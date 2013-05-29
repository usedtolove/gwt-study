package com.mycompany.sg.client.service;

import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.mycompany.sg.client.lib.GenericGwtRpcService;
import com.mycompany.sg.shared.dto.UserDto;

@RemoteServiceRelativePath("springGwtServices/userServiceRpcServlet")
public interface UserServiceRPC extends GenericGwtRpcService<UserDto> {

}
