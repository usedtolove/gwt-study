package com.train.client.application.home;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.RequestTabsHandler;
import com.gwtplatform.mvp.client.TabView;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.RequestTabs;
import com.gwtplatform.mvp.client.annotations.TabInfo;
import com.gwtplatform.mvp.client.proxy.NonLeafTabContentProxy;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.train.client.application.ApplicationPresenter;
import com.train.client.place.NameTokens;
import com.train.client.resources.AppConstants;

/**
 * A sample {@link com.gwtplatform.mvp.client.TabContainerPresenter TabContainerPresenter} appearing as a tab within
 * {@link ApplicationPresenter} and itself containing two tabs. When the tab for {@link HomePresenter} is clicked, them
 * {@link com.train.client.application.homenews.HomeNewsPresenter} is displayed.
 * <p/>
 * It demonstrates the option 2 described in {@link TabInfo}, together with the use of the {@code nameToken} parameter
 * of {@code @TabInfo} to specify which place to show when the tab is clicked.
 */
public class HomePresenter extends HomePresenterBase<HomePresenter.MyView, HomePresenter.MyProxy> {
    /**
     * {@link HomePresenter}'s proxy.
     */
    @ProxyCodeSplit
    public interface MyProxy extends NonLeafTabContentProxy<HomePresenter> {
    }

    @TabInfo(container = ApplicationPresenter.class, priority = 0, // The first tab in the main page
             nameToken = NameTokens.homeNewsPage)
    // Go to HomeNewsPresenter when clicked
    static String getTabLabel(AppConstants constants) {
        return constants.home();
    }

    /**
     * {@link HomePresenter}'s view.
     */
    public interface MyView extends TabView {
    }

    /**
     * This will be the event sent to our "unknown" child presenters, in order for them to register their tabs.
     */
    @RequestTabs
    public static final Type<RequestTabsHandler> TYPE_RequestTabs = new Type<RequestTabsHandler>();

    private final PlaceManager placeManager;

    @Inject
    HomePresenter(EventBus eventBus,
                  MyView view,
                  MyProxy proxy,
                  PlaceManager placeManager) {
        super(eventBus, view, proxy, TYPE_RequestTabs, ApplicationPresenter.TYPE_SetTabContent);

        this.placeManager = placeManager;
    }

    @Override
    public void onReset() {
        super.onReset();
        MyProxy proxy = getProxy();
        proxy.changeTab(proxy.getTabData(), placeManager.getCurrentPlaceRequest().getNameToken());
    }
}
