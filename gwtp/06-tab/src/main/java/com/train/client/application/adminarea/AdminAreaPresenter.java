package com.train.client.application.adminarea;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.TabData;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.TabInfo;
import com.gwtplatform.mvp.client.annotations.UseGatekeeper;
import com.gwtplatform.mvp.client.proxy.TabContentProxyPlace;
import com.train.client.application.ApplicationPresenter;
import com.train.client.place.NameTokens;
import com.train.client.security.IsAdminGatekeeper;

/**
 * A sample {@link Presenter} that should only be displayed to administrator users. It appears as a tab within
 * {@link ApplicationPresenter}.
 * <p/>
 * It uses {@link IsAdminGatekeeper} to prevent access to non-administrator users.
 * <p/>
 * It uses the option 3 described in {@link TabInfo} to describe the tab using a {@link TabDataExt} that ensures the tab
 * is not visible to non-administrator users.
 */
public class AdminAreaPresenter extends Presenter<AdminAreaPresenter.MyView, AdminAreaPresenter.MyProxy> {
    /**
     * {@link AdminAreaPresenter}'s proxy.
     */
    @ProxyCodeSplit
    @NameToken(NameTokens.adminPage)
    @UseGatekeeper(IsAdminGatekeeper.class)
    public interface MyProxy extends TabContentProxyPlace<AdminAreaPresenter> {
    }

    @TabInfo(container = ApplicationPresenter.class)
    static TabData getTabLabel(IsAdminGatekeeper adminGatekeeper) {
        // Priority = 1000, means it will be the right-most tab in the home tab
        return new TabDataExt("Admin area", 1000, adminGatekeeper);
    }

    /**
     * {@link AdminAreaPresenter}'s view.
     */
    public interface MyView extends View {
    }

    @Inject
    AdminAreaPresenter(EventBus eventBus,
                       MyView view,
                       MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.TYPE_SetTabContent);
    }
}
