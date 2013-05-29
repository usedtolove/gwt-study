package com.mycompany.sg.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * 定义远程接口访问的相对路径
 */
@RemoteServiceRelativePath("GwtRPCServlet")
public interface HelloServiceRPC extends RemoteService {

    String say(String name);

}
