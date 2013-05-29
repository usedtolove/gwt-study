package com.mycompany.sg.server.dao;


import com.mycompany.sg.shared.User;

import java.util.List;

public interface UserDao {

    User getById(int id);

    List<User> getAll();

    User save(User user);

    User update(User user);

    void delete(User user);

    int getTotal();

    List<User> getPager(int startRow, int endRow, String[] sortBy);
}
