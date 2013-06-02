package com.train.client.application.settings;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.TabInfo;
import com.gwtplatform.mvp.client.proxy.TabContentProxyPlace;
import com.train.client.application.ApplicationPresenter;
import com.train.client.place.NameTokens;
import com.train.client.security.CurrentUser;

/**
 * A sample {@link Presenter} that lets user toggle between being an administrator and a regular user.
 * <p/>
 * It demonstrates the option 1 described in {@link TabInfo}.
 */
public class SettingsPresenter extends Presenter<SettingsPresenter.MyView, SettingsPresenter.MyProxy>
        implements SettingsUiHandlers {
    /**
     * {@link SettingsPresenter}'s proxy.
     */
    @ProxyCodeSplit
    @NameToken(NameTokens.settingsPage)
    @TabInfo(container = ApplicationPresenter.class, label = "Settings", priority = 2)
    // The third tab in the main page
    public interface MyProxy extends TabContentProxyPlace<SettingsPresenter> {
    }

    /**
     * {@link SettingsPresenter}'s view.
     */
    public interface MyView extends View, HasUiHandlers<SettingsUiHandlers> {
        void setAdmin(boolean isAdmin);
    }

    private final CurrentUser currentUser;

    @Inject
    SettingsPresenter(EventBus eventBus,
                      MyView view,
                      MyProxy proxy,
                      CurrentUser currentUser) {
        super(eventBus, view, proxy, ApplicationPresenter.TYPE_SetTabContent);

        this.currentUser = currentUser;

        view.setUiHandlers(this);
    }

    @Override
    public void togglePrivileges() {
        currentUser.setAdmin(!currentUser.isAdmin());
        updateView();
    }

    @Override
    protected void onReveal() {
        updateView();
    }

    private void updateView() {
        getView().setAdmin(currentUser.isAdmin());
    }
}
