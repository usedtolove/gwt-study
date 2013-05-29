package com.mycompany.sg.server.service;

import com.mycompany.sg.server.ws.to.ResponseTo;
import com.mycompany.sg.shared.User;

import java.util.List;

public interface UserService {

    User getById(int id);

    List<User> getAll();

    User save(User user);

    boolean update(User user);

    void delete(int id);

    ResponseTo getPager(int startRow, int endRow, String[] sortBy);
}
