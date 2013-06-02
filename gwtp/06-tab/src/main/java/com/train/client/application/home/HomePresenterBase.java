package com.train.client.application.home;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.RequestTabsHandler;
import com.gwtplatform.mvp.client.TabContainerPresenter;
import com.gwtplatform.mvp.client.TabPanel;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;

/**
 * The base class for {@link HomePresenter}. Used mainly to test issue 222:
 * http://code.google.com/p/gwt-platform/issues/detail?id=222.
 *
 * @param <V> The specific type of the {@link View}. Must implement {@link TabPanel}.
 * @param <P> The specific type of the {@link Proxy}.
 */
public abstract class HomePresenterBase<V extends View & TabPanel, P extends Proxy<?>>
        extends TabContainerPresenter<V, P> {
    HomePresenterBase(EventBus eventBus,
                      V view,
                      P proxy,
                      Type<RequestTabsHandler> requestTabsEventType,
                      GwtEvent.Type<RevealContentHandler<?>> slot) {
        super(eventBus, view, proxy, TYPE_SetTabContent, requestTabsEventType, slot);
    }

    /**
     * Use this in leaf presenters, inside their {@link #revealInParent} method.
     */
    @ContentSlot
    public static final Type<RevealContentHandler<?>> TYPE_SetTabContent = new Type<RevealContentHandler<?>>();
}
