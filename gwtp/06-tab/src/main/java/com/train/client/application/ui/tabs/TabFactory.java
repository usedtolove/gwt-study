package com.train.client.application.ui.tabs;

import com.gwtplatform.mvp.client.TabData;
import com.gwtplatform.mvp.client.proxy.Gatekeeper;

public interface TabFactory {
    RoundTab createRoundTab(TabData tabData, Gatekeeper gatekeeper);

    SimpleTab createSimpleTab(TabData tabData);
}
