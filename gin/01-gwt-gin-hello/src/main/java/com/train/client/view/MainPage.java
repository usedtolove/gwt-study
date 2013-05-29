package com.train.client.view;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.smartgwt.client.widgets.layout.VLayout;

@Singleton
public class MainPage extends VLayout {

    @Inject
    public MainPage(HelloDynamicForm helloDynamicForm) {
        setWidth100();
        setHeight100();
        setBackgroundColor("yellow");

        addMember(helloDynamicForm);
    }
}
