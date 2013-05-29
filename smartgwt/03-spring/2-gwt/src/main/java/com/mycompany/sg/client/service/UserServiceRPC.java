package com.mycompany.sg.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.mycompany.sg.client.dto.UserDto;

import java.util.List;

@RemoteServiceRelativePath("springGwtServices/userRPCServlet")
public interface UserServiceRPC extends RemoteService {

    List<UserDto> getAll();

}
