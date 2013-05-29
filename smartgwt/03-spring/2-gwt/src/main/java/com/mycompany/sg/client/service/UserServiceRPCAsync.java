package com.mycompany.sg.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.mycompany.sg.client.dto.UserDto;

import java.util.List;

public interface UserServiceRPCAsync {

    void getAll(AsyncCallback<List<UserDto>> async);

}
