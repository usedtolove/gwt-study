package com.train.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.train.client.gin.MyInjector;
import com.train.client.view.MainPage;

public class HelloEntryPoint implements EntryPoint {

    final MyInjector injector = GWT.create(MyInjector.class);

    public void onModuleLoad() {
        MainPage homePage = injector.getMainPage();
        homePage.draw();
    }
}
