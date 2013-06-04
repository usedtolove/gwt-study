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
public class HeaderPresenter extends Presenter<HeaderPresenter.MyView,HeaderPresenter.MyProxy>
    implements HeaderUiHandlers
                                    {

    public interface MyView extends View {
    }

    @ProxyStandard
    public interface MyProxy extends Proxy<HeaderPresenter> {
    }

    @Inject
    public HeaderPresenter(EventBus eventBus, MyView view,MyProxy proxy) {
        super(eventBus, view, proxy);
    }
}
