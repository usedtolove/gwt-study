package com.train.client.application.common;

import com.google.gwt.core.client.GWT;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.train.client.event.ModuleSelectEvent;

/**
* User: Hu Jing Ling
* Date: 2013-06-04
*/
public class HeaderPresenter extends Presenter<HeaderPresenter.MyView,HeaderPresenter.MyProxy>
    implements HeaderUiHandlers{

    public interface MyView extends View,HasUiHandlers<HeaderUiHandlers> {
    }

    @ProxyStandard
    public interface MyProxy extends Proxy<HeaderPresenter> {
    }

    private EventBus eventBus;

    @Inject
    public HeaderPresenter(EventBus eventBus, MyView view,MyProxy proxy) {
        super(eventBus, view, proxy);
        this.eventBus = eventBus;
        getView().setUiHandlers(this);
    }

    @Override
    public void selectModule(String moduleName) {
        GWT.log("HeaderPresenter selectModule():" + moduleName);
        ModuleSelectEvent.fire(this, moduleName);
    }

}
