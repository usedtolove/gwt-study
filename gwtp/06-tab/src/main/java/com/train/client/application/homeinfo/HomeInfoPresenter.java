package com.train.client.application.homeinfo;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.TabInfo;
import com.gwtplatform.mvp.client.proxy.TabContentProxyPlace;
import com.train.client.application.home.HomePresenter;
import com.train.client.place.NameTokens;

/**
 * A sample {@link Presenter} filled with arbitrary content. It appears as a tab within {@link HomeInfoPresenter}, which is
 * itself a s tab in {@link com.train.client.application.ApplicationPresenter}.
 * <p/>
 * It demonstrates the option 1 described in {@link TabInfo}.
 */
public class HomeInfoPresenter extends Presenter<HomeInfoPresenter.MyView, HomeInfoPresenter.MyProxy> {
    /**
     * {@link HomeInfoPresenter}'s proxy.
     */
    @ProxyCodeSplit
    @NameToken(NameTokens.homeInfoPage)
    @TabInfo(container = HomePresenter.class, label = "Info", priority = 1)
    // The second tab in the home tab
    public interface MyProxy extends TabContentProxyPlace<HomeInfoPresenter> {
    }

    /**
     * {@link HomeInfoPresenter}'s view.
     */
    public interface MyView extends View {
    }

    @Inject
    HomeInfoPresenter(EventBus eventBus,
                      MyView view,
                      MyProxy proxy) {
        super(eventBus, view, proxy, HomePresenter.TYPE_SetTabContent);
    }
}
