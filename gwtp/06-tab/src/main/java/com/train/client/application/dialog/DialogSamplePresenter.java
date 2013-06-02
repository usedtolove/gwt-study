package com.train.client.application.dialog;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.RequestTabsHandler;
import com.gwtplatform.mvp.client.TabContainerPresenter;
import com.gwtplatform.mvp.client.TabView;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.RequestTabs;
import com.gwtplatform.mvp.client.annotations.TabInfo;
import com.gwtplatform.mvp.client.proxy.NonLeafTabContentProxy;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.train.client.application.ApplicationPresenter;
import com.train.client.place.NameTokens;

/**
 * A sample {@link com.gwtplatform.mvp.client.Presenter Presenter} that acts as a container for the dialog sub tab
 * presenters. It appears as a tab within {@link com.train.client.application.ApplicationPresenter}.
 * <p/>
 * It demonstrates the option 1 described in {@link TabInfo}.
 */
public class DialogSamplePresenter extends
        TabContainerPresenter<DialogSamplePresenter.MyView, DialogSamplePresenter.MyProxy> {
    /**
     * {@link DialogSamplePresenter}'s proxy.
     */
    @ProxyCodeSplit
    @TabInfo(container = ApplicationPresenter.class, label = "Dialogs", priority = 1, // The second tab in the main page
             nameToken = NameTokens.globalDialogSamplePage)
    public interface MyProxy extends NonLeafTabContentProxy<DialogSamplePresenter> {
    }

    /**
     * {@link DialogSamplePresenter}'s view.
     */
    public interface MyView extends TabView {
    }

    /**
     * This will be the event sent to our "unknown" child presenters, in order for them to register their tabs.
     */
    @RequestTabs
    public static final Type<RequestTabsHandler> TYPE_RequestTabs = new Type<RequestTabsHandler>();

    /**
     * Use this in leaf presenters, inside their {@link #revealInParent} method.
     */
    @ContentSlot
    public static final Type<RevealContentHandler<?>> TYPE_SetTabContent = new Type<RevealContentHandler<?>>();

    @Inject
    DialogSamplePresenter(EventBus eventBus,
                          MyView view,
                          MyProxy proxy) {
        super(eventBus, view, proxy, TYPE_SetTabContent, TYPE_RequestTabs, ApplicationPresenter.TYPE_SetTabContent);
    }
}
