package com.train.client.application.home;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.train.client.application.ApplicationPresenter;
import com.train.client.place.NameTokens;

public class HomePresenter extends Presenter<HomePresenter.MyView, HomePresenter.MyProxy> {
    /**
     * {@link HomePresenter}'s proxy.
     */
    @ProxyCodeSplit
    @NameToken(NameTokens.homePage)
    public interface MyProxy extends ProxyPlace<HomePresenter> {
    }

    /**
     * {@link HomePresenter}'s view.
     */
    public interface MyView extends View {
    }

    @Inject
    public HomePresenter(EventBus eventBus,
                         MyView view,
                         MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.TYPE_SetMainContent);
    }
}
