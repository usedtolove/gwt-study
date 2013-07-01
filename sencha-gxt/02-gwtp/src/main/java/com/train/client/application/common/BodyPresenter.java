package com.train.client.application.common;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.train.client.application.student.TestPresenter;
import com.train.client.event.FunctionSelectEvent;

/**
* User: Hu Jing Ling
* Date: 2013-06-04
*/
public class BodyPresenter extends Presenter<BodyPresenter.MyView,BodyPresenter.MyProxy>
    implements BodyUiHandlers,FunctionSelectEvent.FunctionDataHandler{

    public interface MyView extends View{
        void addItem(String name,PresenterWidget pw);
//        void addItem(String name,Presenter pw);
    }

    @ProxyStandard
    public interface MyProxy extends Proxy<BodyPresenter> {
    }

    private final TestPresenter test;

    @Inject
    public BodyPresenter(EventBus eventBus, MyView view, MyProxy proxy,TestPresenter test) {
        super(eventBus, view, proxy);
        this.test = test;
    }
    @Override
    protected void onBind() {
        super.onBind();
        addRegisteredHandler(FunctionSelectEvent.getType(), this);
    }

    @Override
    public void onFunctionEvent(FunctionSelectEvent event) {
//        System.out.println("BodyPresenter onFunctionEvent():"+event.getData());
        String name = event.getData();
        getView().addItem(name,test);
    }

}
