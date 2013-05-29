package com.train.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.fields.ButtonItem;
import com.smartgwt.client.widgets.form.fields.TextItem;
import com.train.client.SimpleMessages;
import com.train.client.service.HelloServiceAsync;

public class HelloDynamicForm extends DynamicForm{

    // The 'service' will be created by calling GWT.create(HelloService.class) prior to injection.
    @Inject
    private HelloServiceAsync service;
//    @Inject
//    private SimpleMessages messages;

    @Inject
    public HelloDynamicForm(final SimpleMessages messages) {
        setWidth(300);
        setHeight(300);
        setBackgroundColor("silver");

        final TextItem textItem = new TextItem();
        textItem.setTitle(messages.your_name());

        ButtonItem btnItem = new ButtonItem();
        btnItem.setTitle(messages.click_me());

        btnItem.addClickHandler(new com.smartgwt.client.widgets.form.fields.events.ClickHandler() {
            public void onClick(com.smartgwt.client.widgets.form.fields.events.ClickEvent clickEvent) {
                String name = textItem.getValue().toString();
                service.sayHello(name, new AsyncCallback<String>() {
                    public void onFailure(Throwable throwable) {
                        GWT.log(throwable.toString());
                    }

                    public void onSuccess(String s) {
                        SC.say(messages.server_say(s));
                    }
                });
            }
        });
        setItems(textItem, btnItem);
    }

}
