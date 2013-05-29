package com.mycompany.sg.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.mycompany.sg.client.service.HelloServiceRPC;
import com.mycompany.sg.client.service.HelloServiceRPCAsync;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.fields.ButtonItem;
import com.smartgwt.client.widgets.form.fields.TextItem;
import com.smartgwt.client.widgets.form.fields.events.ClickEvent;
import com.smartgwt.client.widgets.form.fields.events.ClickHandler;
import com.smartgwt.client.widgets.layout.VLayout;

public class Hello implements EntryPoint {

    private final HelloServiceRPCAsync userService = GWT.create(HelloServiceRPC.class);

    public void onModuleLoad() {

        VLayout layout = new VLayout();
        layout.setBackgroundColor("silver");
        layout.setWidth100();
        layout.setHeight100();

        final DynamicForm form = new DynamicForm();

        final TextItem textItem = new TextItem();
        textItem.setTitle("You Name:");
        textItem.setRequired(true);
        textItem.setRequiredMessage("can not be blank");

        ButtonItem btn = new ButtonItem();
        btn.setTitle("click me");

        btn.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                if (form.validate()) {
                    String name = textItem.getValue().toString();
                    userService.say(name, new AsyncCallback<String>() {
                        @Override
                        public void onFailure(Throwable caught) {
                            SC.warn(caught.getMessage());
                        }

                        @Override
                        public void onSuccess(String result) {
                            SC.say("Server return:", result);
                        }
                    });
                }
            }
        });

        form.setFields(textItem, btn);

        layout.addMember(form);
        layout.draw();
    }

}
