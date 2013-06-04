package com.train.client.application;

import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.TreeStore;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.container.FlowLayoutContainer;
import com.sencha.gxt.widget.core.client.tree.Tree;
import com.train.client.data.TestData;
import com.train.client.images.ExampleImages;
import com.train.client.model.BaseDto;
import com.train.client.model.FolderDto;


/**
 * User: hjl
 * Date: 2013-6-2
 */
public class ApplicationView extends ViewWithUiHandlers<ApplicationUiHandlers> implements ApplicationPresenter.MyView {
    @UiField
    ContentPanel treePanel;

    class KeyProvider implements ModelKeyProvider<BaseDto> {
        @Override
        public String getKey(BaseDto item) {
            return (item instanceof FolderDto ? "f-" : "m-") + item.getId().toString();
        }
    }

//    @UiField(provided = true)//the field must be filled before createAndBindUi is called.
//    TreeStore store = new TreeStore<BaseDto>(new KeyProvider());;
//    @UiField
//    Tree tree;

    //从 MainPageView.ui.xml 文件中读取布局
    interface Binder extends UiBinder<Widget,ApplicationView>{
    }

    @Inject
    public ApplicationView(Binder binder) {

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

        Widget w = binder.createAndBindUi(this);
//        treeCon.add(tree);
        treePanel.add(tree);
        tree.setAutoExpand(true);//expand all nodes
        tree.getStyle().setLeafIcon(ExampleImages.INSTANCE.music());
        initWidget(w);
//        initWidget(binder.createAndBindUi(this));  //填充各 ui 组件
    }

    private void processFolder(TreeStore<BaseDto> store, FolderDto folder) {
        for (BaseDto child : folder.getChildren()) {
            store.add(folder, child);
            if (child instanceof FolderDto) {
                processFolder(store, (FolderDto) child);
            }
        }
    }

}