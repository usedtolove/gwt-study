package com.mycompany.sg.server.servlet;

import com.mycompany.sg.client.dto.UserDto;
import com.mycompany.sg.client.service.UserServiceRPC;
import com.mycompany.sg.entity.User;
import com.mycompany.sg.service.UserService;
import org.apache.log4j.Logger;
import org.dozer.DozerBeanMapperSingletonWrapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service("userRPCServlet")
public class UserServiceRPCServlet implements UserServiceRPC {

    private static final Logger log = Logger.getLogger(UserServiceRPCServlet.class);

    @Resource
    private UserService userService;

    public List<UserDto> getAll() {
        List<UserDto> list = new ArrayList<UserDto>();
        for(User u : userService.getAll()){
            list.add(DozerBeanMapperSingletonWrapper.getInstance().map(u , UserDto.class));
        }
        return list;
    }
}
