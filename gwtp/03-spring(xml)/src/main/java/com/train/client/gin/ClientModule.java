package com.train.client.gin;

import com.gwtplatform.dispatch.client.gin.DispatchAsyncModule;
import com.gwtplatform.mvp.client.annotations.DefaultPlace;
import com.gwtplatform.mvp.client.annotations.ErrorPlace;
import com.gwtplatform.mvp.client.annotations.UnauthorizedPlace;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import com.gwtplatform.mvp.client.proxy.DefaultPlaceManager;
import com.train.client.place.NameTokens;
import com.train.client.presenter.MainPagePresenter;
import com.train.client.presenter.ResponsePresenter;
import com.train.client.view.MainPageView;
import com.train.client.view.ResponseView;

//Step 3. Declare bindings
public class ClientModule extends AbstractPresenterModule {

    protected void configure() {
        //使用GWTP默认模块配置
        install(new DefaultModule(DefaultPlaceManager.class));
        //用于创建 DispatchAsync
        install(new DispatchAsyncModule());
        //配置 Place
        bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.home); //默认页面
        bindConstant().annotatedWith(ErrorPlace.class).to(NameTokens.home); //错误页面
        bindConstant().annotatedWith(UnauthorizedPlace.class).to(NameTokens.home); //未授权页面

        bindPresenter(MainPagePresenter.class,
                MainPagePresenter.MyView.class,
                MainPageView.class,
                MainPagePresenter.MyProxy.class);

        bindPresenter(ResponsePresenter.class,
                ResponsePresenter.MyView.class,
                ResponseView.class,
                ResponsePresenter.MyProxy.class);
    }
}
