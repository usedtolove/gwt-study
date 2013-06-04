package com.train.client.gin;

import com.gwtplatform.dispatch.client.gin.DispatchAsyncModule;
import com.gwtplatform.mvp.client.annotations.DefaultPlace;
import com.gwtplatform.mvp.client.annotations.ErrorPlace;
import com.gwtplatform.mvp.client.annotations.UnauthorizedPlace;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import com.gwtplatform.mvp.client.proxy.DefaultPlaceManager;
import com.train.client.application.ApplicationPresenter;
import com.train.client.application.ApplicationView;
import com.train.client.application.common.HeaderPresenter;
import com.train.client.application.common.HeaderView;
import com.train.client.application.common.MenuPresenter;
import com.train.client.application.common.MenuView;
import com.train.client.place.NameTokens;

public class ClientModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new DefaultModule(DefaultPlaceManager.class));
        install(new DispatchAsyncModule());

        // DefaultPlaceManager Places
        bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.homePage);
        bindConstant().annotatedWith(ErrorPlace.class).to(NameTokens.homePage);
        bindConstant().annotatedWith(UnauthorizedPlace.class).to(NameTokens.homePage);

        //MVP
        bindPresenter(ApplicationPresenter.class,ApplicationPresenter.MyView.class, ApplicationView.class,ApplicationPresenter.MyProxy.class);

        bindPresenter(HeaderPresenter.class, HeaderPresenter.MyView.class, HeaderView.class,
                HeaderPresenter.MyProxy.class);
        bindPresenter(MenuPresenter.class, MenuPresenter.MyView.class, MenuView.class,
                MenuPresenter.MyProxy.class);
    }
}
