package com.train.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.DelayedBindRegistry;
import com.train.client.gin.MyInjector;

public class HelloEntryPoint implements EntryPoint {

    final MyInjector injector = GWT.create(MyInjector.class);

    public void onModuleLoad() {
        DelayedBindRegistry.bind(injector);
        injector.getPlaceManager().revealCurrentPlace();
    }
}
