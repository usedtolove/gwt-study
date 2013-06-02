package com.train.client.application.ui.tabs;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.assistedinject.Assisted;
import com.gwtplatform.mvp.client.TabData;
import com.gwtplatform.mvp.client.proxy.Gatekeeper;

import javax.inject.Inject;

/**
 * A {@link BaseTab} styled with rounded upper corners and meant to be contained in a {@link RoundTabPanel}. This tab
 * can be protected so that it is only displayed when a given {@link Gatekeeper} can allow access. If a {@code null}
 * {@link Gatekeeper} is used then the tab is always accessible.
 */
public class RoundTab extends BaseTab {
    interface Binder extends UiBinder<Widget, RoundTab> {
    }

    private final Gatekeeper gatekeeper;

    @Inject
    RoundTab(Binder uiBinder,
             @Assisted TabData tabData,
             @Assisted Gatekeeper gatekeeper) {
        super(tabData);

        this.gatekeeper = gatekeeper;

        initWidget(uiBinder.createAndBindUi(this));

        setText(tabData.getLabel());
    }

    @Override
    public boolean canUserAccess() {
        return gatekeeper == null || gatekeeper.canReveal();
    }
}
