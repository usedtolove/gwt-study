package com.train.client.application.aboutus;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.train.client.application.ApplicationPresenter;
import com.train.client.place.NameTokens;

public class AboutUsPresenter extends Presenter<AboutUsPresenter.MyView, AboutUsPresenter.MyProxy> {
    /**
     * {@link AboutUsPresenter}'s proxy.
     */
    @ProxyCodeSplit
    @NameToken(NameTokens.aboutUsPage)
    public interface MyProxy extends ProxyPlace<AboutUsPresenter> {
    }

    /**
     * {@link AboutUsPresenter}'s view.
     */
    public interface MyView extends View {
    }

    @Inject
    AboutUsPresenter(EventBus eventBus,
                     MyView view,
                     MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.TYPE_SetMainContent);
    }
}
