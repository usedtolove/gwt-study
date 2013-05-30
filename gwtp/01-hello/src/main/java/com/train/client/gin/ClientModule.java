package com.train.client.gin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import com.train.client.place.MyPlaceManager;
import com.train.client.presenter.MainPagePresenter;
import com.train.client.presenter.ResponsePresenter;
import com.train.client.view.MainPageView;
import com.train.client.view.ResponseView;

//Step 3. Declare bindings
public class ClientModule extends AbstractPresenterModule {

    protected void configure() {
        //使用GWTP默认模块配置
        install(new DefaultModule(MyPlaceManager.class));
        //也可以自定义
//        bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);
//        bind(TokenFormatter.class).to(ParameterTokenFormatter.class).in(Singleton.class);
//        bind(RootPresenter.class).asEagerSingleton();
//        bind(PlaceManager.class).to(MyPlaceManager.class).in(Singleton.class);
//        bind(GoogleAnalytics.class).to(GoogleAnalyticsImpl.class).in(Singleton.class);

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
