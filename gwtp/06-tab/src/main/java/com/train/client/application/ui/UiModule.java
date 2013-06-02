package com.train.client.application.ui;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.inject.client.assistedinject.GinFactoryModuleBuilder;
import com.google.inject.Singleton;
import com.train.client.application.ui.linkmenu.LinkMenu;
import com.train.client.application.ui.tabs.RoundTabPanel;
import com.train.client.application.ui.tabs.SimpleTabPanel;
import com.train.client.application.ui.tabs.TabFactory;

/**
 * This module makes sure every binder required by our widgets are bound as singleton.
 */
public class UiModule extends AbstractGinModule {
    @Override
    protected void configure() {
        // Singleton binders
        bind(LinkMenu.Binder.class).in(Singleton.class);
        bind(RoundTabPanel.Binder.class).in(Singleton.class);
        bind(SimpleTabPanel.Binder.class).in(Singleton.class);

        install(new GinFactoryModuleBuilder().build(TabFactory.class));
    }
}
