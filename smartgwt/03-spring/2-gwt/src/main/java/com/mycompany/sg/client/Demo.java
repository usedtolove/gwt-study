package com.mycompany.sg.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.mycompany.sg.client.dto.UserDto;
import com.mycompany.sg.client.service.UserServiceRPC;
import com.mycompany.sg.client.service.UserServiceRPCAsync;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.layout.VLayout;

import java.util.List;

public class Demo implements EntryPoint{

    private final UserServiceRPCAsync userService = GWT.create(UserServiceRPC.class);

	public void onModuleLoad() {

        VLayout layout = new VLayout();
        layout.setBackgroundColor("black");
        layout.setWidth100();
        layout.setHeight100();

        IButton btn = new IButton();
        btn.setTitle("click me");

        final Canvas canvas = new Canvas();
        canvas.setBackgroundColor("silver");

        btn.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent clickEvent) {
                userService.getAll(new AsyncCallback<List<UserDto>>() {
                    public void onFailure(Throwable throwable) {
                        SC.warn("onFailure");
                    }
                    public void onSuccess(List<UserDto> users) {
                        SC.say("Server return", "Total user count:"+String.valueOf(users.size()));
                        if(users.size()>0){
                            String s = "";
                            for(UserDto u : users){
                                s += u.toString() + "<br/>";
                            }
                            canvas.setContents(s);
                        }
                    }
                });
            }
        });

        layout.addMember(canvas);
        layout.addMember(btn);
        layout.draw();
        layout.show();
	}

}
