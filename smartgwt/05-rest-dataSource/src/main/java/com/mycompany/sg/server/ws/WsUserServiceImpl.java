package com.mycompany.sg.server.ws;

import com.mycompany.sg.server.service.UserService;
import com.mycompany.sg.server.ws.to.RequestTo;
import com.mycompany.sg.server.ws.to.ResponseTo;
import com.mycompany.sg.shared.User;
import org.apache.cxf.jaxrs.ext.MessageContext;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import java.util.List;
import java.util.logging.Logger;

@WebService(endpointInterface = "com.mycompany.sg.server.ws.WsUserService",
            serviceName = "WsUserService")
public class WsUserServiceImpl implements WsUserService {

    private static final Logger  logger = Logger.getLogger("com.foo");

    @Resource
    public UserService userService;
    @Context
    private MessageContext context;

    @Override
    public ResponseTo fetch(RequestTo<User> requestTo) {
        logger.info("fetch() run...");
        int startRow = requestTo.getStartRow();
        int endRow = requestTo.getEndRow();
        String[] sortBy = requestTo.getSortBy();
        logger.info("startRow:"+startRow);
        logger.info("endRow:"+endRow);
        logger.info("sortBy:"+sortBy.toString());
        if(sortBy!=null){
            for(String s : sortBy){
                logger.info(s);
            }
        }
        ResponseTo responseTo = userService.getPager(startRow, endRow, sortBy);
        return responseTo;
    }

    public ResponseTo add(RequestTo<User> requestTo) {
        User user = userService.save(requestTo.getData());
        System.out.println("user:"+user);
        return ResponseTo.ok(user);
    }

    public ResponseTo update(RequestTo<User> requestTo) {
        System.out.println("update() run...");
        User user = requestTo.getData();
        if(userService.update(user)){
            return ResponseTo.ok(user);
        }else{
            return ResponseTo.failure();
        }
    }

    public ResponseTo delete(RequestTo<User> requestTo) {
        logger.info("delete() run...");
        User user = requestTo.getData();
        logger.info("id:"+user.getId());
        userService.delete(user.getId());
        return ResponseTo.ok(new User(user.getId()));
    }
}
