package com.train.client.application.settings;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

/**
 * The view implementation for {@link SettingsPresenter} .
 */
public class SettingsView extends ViewWithUiHandlers<SettingsUiHandlers> implements SettingsPresenter.MyView {
    interface Binder extends UiBinder<Widget, SettingsView> {
    }

    @UiField
    InlineLabel userPrivileges;
    @UiField
    Button togglePrivileges;

    @Inject
    SettingsView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    public void setAdmin(boolean isAdmin) {
        if (isAdmin) {
            userPrivileges.setText("Admin");
            togglePrivileges.setText("Toggle to non-admin user");
        } else {
            userPrivileges.setText("Non-admin");
            togglePrivileges.setText("Toggle to admin user");
        }
        togglePrivileges.setVisible(true);
    }

    @UiHandler("togglePrivileges")
    void onSwitchSecurityClicked(ClickEvent event) {
        getUiHandlers().togglePrivileges();
    }
}
