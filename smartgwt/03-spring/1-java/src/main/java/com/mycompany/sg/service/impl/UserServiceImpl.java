package com.mycompany.sg.service.impl;

import com.mycompany.sg.dao.UserDao;
import com.mycompany.sg.entity.User;
import com.mycompany.sg.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    @Resource
    public void setBaseDao(UserDao userDao){
        super.setBaseDao(userDao);
    }

}
