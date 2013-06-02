package com.train.client.application.contact;

import com.google.gwt.event.shared.GwtEvent;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ProxyEvent;
import com.gwtplatform.mvp.client.proxy.NavigationEvent;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;

/**
 * The base class of {@link ContactPresenter}. The goal of this class is just to show that {@code @ProxyEvent} can be
 * used in base classes. See Issue 180.
 *
 * @param <Proxy_> The {@link Proxy} type.
 */
public abstract class ContactPresenterBase<Proxy_ extends Proxy<?>> extends
        Presenter<ContactPresenterBase.MyView, Proxy_> {

    String navigationHistory = "";

    /**
     * {@link ContactPresenter}'s view.
     */
    public interface MyView extends View {
        void setNavigationHistory(String navigationHistory);
    }

    ContactPresenterBase(EventBus eventBus,
                         MyView view,
                         Proxy_ proxy,
                         GwtEvent.Type<RevealContentHandler<?>> slot) {
        super(eventBus, view, proxy, slot);
    }

    /**
     * We keep track of the previously visited pages.
     *
     * @param event The {@link com.gwtplatform.mvp.client.proxy.LockInteractionEvent}.
     */
    @ProxyEvent
    public void onNavigation(NavigationEvent event) {
        if (navigationHistory.length() > 0) {
            navigationHistory += ", ";
        }
        navigationHistory += event.getRequest().getNameToken();
        getView().setNavigationHistory(navigationHistory);
    }
}
