package com.mycompany.sg.server.service;

import com.mycompany.sg.server.entity.User;

import java.util.List;

public interface UserService {

    User getById(String id);

    List<User> getAll();

    User save(User user);

    User update(User user);

    void delete(User user);

}
