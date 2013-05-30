package com.train.client.gin;

import com.google.gwt.inject.client.AsyncProvider;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.train.client.presenter.MainPagePresenter;
import com.train.client.presenter.ResponsePresenter;

@GinModules(ClientModule.class)
public interface MyInjector extends Ginjector{

    PlaceManager getPlaceManager();

    EventBus getEventBus();

    //对应 @ProxyCodeSplit 的 Presenter
    AsyncProvider<MainPagePresenter> getMainPagePresenter();
    AsyncProvider<ResponsePresenter> getResponsePresenter();
}
