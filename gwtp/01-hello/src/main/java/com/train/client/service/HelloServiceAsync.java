package com.train.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface HelloServiceAsync {
    void sayHello(String username , AsyncCallback<String> async);
}
