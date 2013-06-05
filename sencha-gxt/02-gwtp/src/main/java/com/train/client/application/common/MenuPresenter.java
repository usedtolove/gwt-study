package com.train.client.application.common;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.sencha.gxt.core.client.Style;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.TreeStore;
import com.sencha.gxt.widget.core.client.tree.Tree;
import com.train.client.data.TestData;
import com.train.client.event.FunctionSelectEvent;
import com.train.client.event.ModuleSelectEvent;
import com.train.client.images.ExampleImages;
import com.train.client.model.BaseDto;
import com.train.client.model.FolderDto;

/**
* User: Hu Jing Ling
* Date: 2013-06-04
*/
public class MenuPresenter extends Presenter<MenuPresenter.MyView,MenuPresenter.MyProxy>
    implements MenuUiHandlers,ModuleSelectEvent.ModuleDataHandler{

    public interface MyView extends View{
        void showTree(Tree tree);
    }

    @ProxyStandard
    public interface MyProxy extends Proxy<MenuPresenter> {
    }

    private EventBus eventBus;

    @Inject
    public MenuPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
        super(eventBus, view, proxy);
        this.eventBus = eventBus;
    }

    class KeyProvider implements ModelKeyProvider<BaseDto> {
        @Override
        public String getKey(BaseDto item) {
            return (item instanceof FolderDto ? "f-" : "m-") + item.getId().toString();
        }
    }

    @Override
    protected void onBind() {
        super.onBind();
        addRegisteredHandler(ModuleSelectEvent.getType(), this);
    }

    private void processFolder(TreeStore<BaseDto> store, FolderDto folder) {
        for (BaseDto child : folder.getChildren()) {
            store.add(folder, child);
            if (child instanceof FolderDto) {
                processFolder(store, (FolderDto) child);
            }
        }
    }

    @Override
    public void onModuleEvent(ModuleSelectEvent event) {
        GWT.log("===============:" + event.getData());
        //Window.alert("Global Event fired");
        TreeStore<BaseDto> store = new TreeStore<BaseDto>(new KeyProvider());

        FolderDto root = TestData.getMusicRootFolder();
        for (BaseDto base : root.getChildren()) {
            store.add(base);
            if (base instanceof FolderDto) {
                processFolder(store, (FolderDto) base);
            }
        }

        final Tree<BaseDto, String> tree = new Tree<BaseDto, String>(store, new ValueProvider<BaseDto, String>() {
            @Override
            public String getValue(BaseDto object) {
                return object.getName();
            }
            @Override
            public void setValue(BaseDto object, String value) {
            }
            @Override
            public String getPath() {
                return "name";
            }
        });

        tree.setAutoExpand(true);//expand all nodes
        tree.getStyle().setLeafIcon(ExampleImages.INSTANCE.application());
        tree.setHeight("100%");
        tree.setWidth("100%");

//        tree.addFocusHandler(new FocusEvent.FocusHandler() {
//            @Override
//            public void onFocus(FocusEvent event) {
//                System.out.println("onFocus"+event);
//            }
//        });

        tree.getSelectionModel().setSelectionMode(Style.SelectionMode.SINGLE);
        tree.getSelectionModel().addSelectionHandler(new SelectionHandler<BaseDto>() {
            @Override
            public void onSelection(SelectionEvent<BaseDto> event) {
                String name = event.getSelectedItem().getName();
                eventBus.fireEvent (new FunctionSelectEvent(name));
            }
        });

        getView().showTree(tree);
    }

}
