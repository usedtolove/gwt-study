package com.train.client.application.common;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.Proxy;

/**
* User: Hu Jing Ling
* Date: 2013-06-04
*/
public class BodyPresenter extends Presenter<BodyPresenter.MyView,BodyPresenter.MyProxy>
    implements BodyUiHandlers{

    public interface MyView extends View{
    }

    @ProxyStandard
    public interface MyProxy extends Proxy<BodyPresenter> {
    }

    @Inject
    public BodyPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
        super(eventBus, view, proxy);
    }
    @Override
    protected void onBind() {
        super.onBind();
//        addRegisteredHandler(FunctionSelectEvent.getType(), this);
    }

//    @Override
//    public void onFunctionEvent(FunctionSelectEvent event) {
//        System.out.println("BodyPresenter onFunctionEvent..........");
//    }


}
