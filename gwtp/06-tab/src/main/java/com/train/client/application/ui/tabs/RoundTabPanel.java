package com.train.client.application.ui.tabs;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.TabData;
import com.gwtplatform.mvp.client.proxy.Gatekeeper;
import com.train.client.application.adminarea.TabDataExt;

/**
 * A {@link BaseTabPanel} styled to contain {@link RoundTab}.
 * <p/>
 * Look at {@link com.train.client.application.ui.linkmenu.LinkMenu} to see how we can use this widget within a UiBinder file even though its constructor relies
 * on dependency injection.
 */
public class RoundTabPanel extends BaseTabPanel {
    public interface Binder extends UiBinder<Widget, RoundTabPanel> {
    }

    private final TabFactory tabFactory;

    @Inject
    RoundTabPanel(Binder binder,
                  TabFactory tabFactory) {
        this.tabFactory = tabFactory;

        initWidget(binder.createAndBindUi(this));
    }

    @Override
    protected BaseTab createNewTab(TabData tabData) {
        Gatekeeper gatekeeper = null;
        if (tabData instanceof TabDataExt) {
            TabDataExt tabDataExt = (TabDataExt) tabData;
            gatekeeper = tabDataExt.getGatekeeper();
        }

        return tabFactory.createRoundTab(tabData, gatekeeper);
    }
}
