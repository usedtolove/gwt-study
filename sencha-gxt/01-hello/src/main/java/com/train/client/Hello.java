package com.train.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.widget.client.TextButton;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.sencha.gxt.widget.core.client.FramedPanel;
import com.sencha.gxt.widget.core.client.box.AlertMessageBox;
import com.sencha.gxt.widget.core.client.container.CenterLayoutContainer;
import com.sencha.gxt.widget.core.client.form.TextField;
import com.train.client.gin.MyInjector;
import com.train.client.service.HelloServiceAsync;

@Singleton
public class Hello implements EntryPoint {

	public void onModuleLoad() {
        final MyInjector injector = GWT.create(MyInjector.class);
        RootPanel.get().add(injector.getMainPage());
    }
}
