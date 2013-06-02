package com.train.client.application;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.ChangeTabHandler;
import com.gwtplatform.mvp.client.RequestTabsHandler;
import com.gwtplatform.mvp.client.TabContainerPresenter;
import com.gwtplatform.mvp.client.TabView;
import com.gwtplatform.mvp.client.annotations.*;
import com.gwtplatform.mvp.client.proxy.*;
import com.train.client.security.CurrentUserChangedEvent;
import com.train.client.security.CurrentUserChangedHandler;

/**
 * The main {@link com.gwtplatform.mvp.client.Presenter} of the application. It contains a number of tabs allowing
 * access to the various parts of the application. Tabs are refreshed whenever the current user's privileges change in
 * order to hide areas that cannot be accessed.
 */
public class ApplicationPresenter
        extends TabContainerPresenter<ApplicationPresenter.MyView, ApplicationPresenter.MyProxy>
        implements CurrentUserChangedHandler, AsyncCallStartHandler, AsyncCallFailHandler, AsyncCallSucceedHandler {
    /**
     * {@link ApplicationPresenter}'s proxy.
     */
    @ProxyStandard
    public interface MyProxy extends Proxy<ApplicationPresenter> {
    }

    /**
     * {@link ApplicationPresenter}'s view.
     */
    public interface MyView extends TabView {
        void refreshTabs();

        void setTopMessage(String string);
    }

    /**
     * This will be the event sent to our "unknown" child presenters, in order for them to register their tabs.
     */
    @RequestTabs
    public static final Type<RequestTabsHandler> TYPE_RequestTabs = new Type<RequestTabsHandler>();

    /**
     * Fired by child proxie's when their tab content is changed.
     */
    @ChangeTab
    public static final Type<ChangeTabHandler> TYPE_ChangeTab = new Type<ChangeTabHandler>();

    /**
     * Use this in leaf presenters, inside their {@link #revealInParent} method.
     */
    @ContentSlot
    public static final Type<RevealContentHandler<?>> TYPE_SetTabContent = new Type<RevealContentHandler<?>>();

    @Inject
    ApplicationPresenter(EventBus eventBus,
                         MyView view,
                         MyProxy proxy) {
        super(eventBus, view, proxy, TYPE_SetTabContent, TYPE_RequestTabs, TYPE_ChangeTab, RevealType.Root);
    }

    @ProxyEvent
    @Override
    public void onCurrentUserChanged(CurrentUserChangedEvent event) {
        getView().refreshTabs();
    }

    @ProxyEvent
    @Override
    public void onAsyncCallStart(AsyncCallStartEvent event) {
        getView().setTopMessage("Loading...");
    }

    @ProxyEvent
    @Override
    public void onAsyncCallFail(AsyncCallFailEvent event) {
        getView().setTopMessage("Oops, something went wrong...");
    }

    @ProxyEvent
    @Override
    public void onAsyncCallSucceed(AsyncCallSucceedEvent event) {
        getView().setTopMessage(null);
    }
}
