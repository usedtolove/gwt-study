package com.train.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.sencha.gxt.widget.core.client.box.AlertMessageBox;
import com.sencha.gxt.widget.core.client.box.MessageBox;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.event.SelectEvent;

public class HelloGXT implements EntryPoint {

    @Override
    public void onModuleLoad() {
//        VerticalPanel vp = new VerticalPanel();
//
//        TextButton btn = new TextButton("Hello World");
//        btn.addSelectHandler(new SelectEvent.SelectHandler() {
//            @Override
//            public void onSelect(SelectEvent event) {
//                AlertMessageBox d = new AlertMessageBox("Alert", "Access Denied");
//                d.show();
//            }
//        });
//
//        vp.add(btn);
//        RootPanel.get().add(vp);

        MessageBox popup = new MessageBox("On the 8th day, God said...",
                              "Hello World");
          RootPanel.get().add(popup);
          popup.show();
    }
}
