package com.train.client.application.student;

import com.google.gwt.user.client.ui.Label;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.TreeStore;
import com.sencha.gxt.widget.core.client.Dialog;
import com.sencha.gxt.widget.core.client.tree.Tree;
import com.train.client.model.BaseDto;
import com.train.client.model.FolderDto;

/**
* User: Hu Jing Ling
* Date: 2013-06-04
*/
public class TestPresenter extends Presenter<TestPresenter.MyView,TestPresenter.MyProxy>
    implements TestUiHandlers{

    public interface MyView extends View,HasUiHandlers<TestUiHandlers> {
    }

    @ProxyStandard
    public interface MyProxy extends Proxy<TestPresenter> {
    }

    private EventBus eventBus;

    @Inject
    public TestPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
        super(eventBus, view, proxy);
        this.eventBus = eventBus;
        getView().setUiHandlers(this);
    }

    @Override
    public void buttonClick() {
        System.out.println("button on click");
        Dialog simple = new Dialog();
        simple.add(new Label("you click button"));
        simple.setHideOnButtonClick(true);
        simple.show();
    }

}
