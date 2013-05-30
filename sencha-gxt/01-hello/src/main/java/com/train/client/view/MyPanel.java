package com.train.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.sencha.gxt.widget.core.client.Dialog;
import com.sencha.gxt.widget.core.client.FramedPanel;
import com.sencha.gxt.widget.core.client.Window;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.form.TextField;
import com.train.client.service.HelloServiceAsync;

/**
 * User: Hu Jing Ling
 * Date: 2013-05-30
 */
public class MyPanel extends FramedPanel {

    @Inject
    private HelloServiceAsync service;

    public MyPanel() {
        setHeadingText("Demo");
        setWidth(350);
        setBodyStyle("background: none; padding: 5px");

        final TextField nameField = new TextField();
        nameField.setAllowBlank(false);
        nameField.setEmptyText("Enter your name...");

        TextButton textButton = new TextButton("Send");
        textButton.addSelectHandler(new SelectEvent.SelectHandler() {
            @Override
            public void onSelect(SelectEvent event) {
                String name = nameField.getValue();
                service.sayHello(name, new AsyncCallback<String>() {
                    @Override
                    public void onFailure(Throwable throwable) {
                        GWT.log(throwable.toString());
                    }

                    @Override
                    public void onSuccess(String s) {
                        Dialog simple = new Dialog();
                        simple.setHeadingText("Server:");
                        simple.add(new Label(s));
                        simple.setHideOnButtonClick(true);
                        simple.show();
                    }
                });
            }
        });
        add(nameField);
        addButton(textButton);
    }
}
