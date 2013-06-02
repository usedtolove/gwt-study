package com.train.client.gin;

import com.google.inject.Singleton;
import com.gwtplatform.mvp.client.annotations.DefaultPlace;
import com.gwtplatform.mvp.client.annotations.ErrorPlace;
import com.gwtplatform.mvp.client.annotations.GaAccount;
import com.gwtplatform.mvp.client.annotations.UnauthorizedPlace;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import com.gwtplatform.mvp.client.proxy.DefaultPlaceManager;
import com.train.client.application.ApplicationModule;
import com.train.client.place.NameTokens;
import com.train.client.security.CurrentUser;
import com.train.client.security.IsAdminGatekeeper;

public class ClientModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new DefaultModule(DefaultPlaceManager.class));
        install(new ApplicationModule());

        bind(CurrentUser.class).in(Singleton.class);
        bind(IsAdminGatekeeper.class).in(Singleton.class);

        // DefaultPlaceManager Constants
        bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.homeNewsPage);
        bindConstant().annotatedWith(ErrorPlace.class).to(NameTokens.homeNewsPage);
        bindConstant().annotatedWith(UnauthorizedPlace.class).to(NameTokens.homeNewsPage);

        // Google Analytics
        bindConstant().annotatedWith(GaAccount.class).to("UA-8319339-6");

        // Load and inject CSS resources
        bind(ResourceLoader.class).asEagerSingleton();
    }
}
