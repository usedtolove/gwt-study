package com.mycompany.sg.server.dao;


import com.mycompany.sg.server.entity.User;

import java.util.List;

public interface UserDao {

    User getById(String id);

    List<User> getAll();

    User save(User user);

    User update(User user);

    void delete(User user);

}
