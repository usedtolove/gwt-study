package com.train.client.application.common;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;

/**
* User: Hu Jing Ling
* Date: 2013-06-04
*/
public class MenuPresenter extends Presenter<MenuPresenter.MyView,MenuPresenter.MyProxy>
    implements HeaderUiHandlers{

    public interface MyView extends View {
    }

    @ProxyStandard
    @NameToken("asd")
    public interface MyProxy extends ProxyPlace<MenuPresenter> {
    }

    @Inject
    public MenuPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
        super(eventBus, view, proxy);
    }
}
