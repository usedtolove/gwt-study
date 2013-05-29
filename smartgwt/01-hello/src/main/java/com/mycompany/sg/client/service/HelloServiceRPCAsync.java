package com.mycompany.sg.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface HelloServiceRPCAsync {

    void say(String name, AsyncCallback<String> async);

}
