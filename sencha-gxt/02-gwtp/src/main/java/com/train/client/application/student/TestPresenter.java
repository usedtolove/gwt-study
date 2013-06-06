package com.train.client.application.student;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.TreeStore;
import com.sencha.gxt.widget.core.client.tree.Tree;
import com.train.client.model.BaseDto;
import com.train.client.model.FolderDto;

/**
* User: Hu Jing Ling
* Date: 2013-06-04
*/
public class TestPresenter extends Presenter<TestPresenter.MyView,TestPresenter.MyProxy>
    implements TestUiHandlers{

    public interface MyView extends View{
        void showTree(Tree tree);
    }

    @ProxyStandard
    public interface MyProxy extends Proxy<TestPresenter> {
    }

    private EventBus eventBus;

    @Inject
    public TestPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
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
