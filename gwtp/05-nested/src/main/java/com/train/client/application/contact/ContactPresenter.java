package com.train.client.application.contact;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.train.client.application.ApplicationPresenter;
import com.train.client.place.NameTokens;

/**
 * The events are handled in {@link ContactPresenterBase}.
 */
public class ContactPresenter extends ContactPresenterBase<ContactPresenter.MyProxy> {
    /**
     * {@link ContactPresenter}'s proxy.
     */
    @ProxyCodeSplit
    @NameToken(NameTokens.contactPage)
    public interface MyProxy extends ProxyPlace<ContactPresenter> {
    }

    @Inject
    ContactPresenter(EventBus eventBus,
                     MyView view,
                     MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.TYPE_SetMainContent);
    }
}
