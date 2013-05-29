package com.mycompany.sg.server.service;

import com.mycompany.sg.server.dao.UserDao;
import com.mycompany.sg.server.ws.to.ResponseTo;
import com.mycompany.sg.shared.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Resource
    private UserDao userDao;

    public User getById(int id) {
        return userDao.getById(id);
    }

    public List<User> getAll() {
        return userDao.getAll();
    }

    public User save(User user) {
        return userDao.save(user);
    }

    public boolean update(User user) {
        User temp = userDao.getById(user.getId());
        if(temp != null){
            temp.setName(user.getName());
            temp.setLocation(user.getLocation());
            userDao.update(temp);
            return true;
        } else{
            return false;
        }
    }

    public void delete(int id) {
        User user = userDao.getById(id);
        userDao.delete(user);
    }

    @Override
    public ResponseTo getPager(int startRow, int endRow, String[] sortBy) {
        ResponseTo responseTo = new ResponseTo();
        responseTo.setStartRow(startRow);
        responseTo.setEndRow(endRow);
        responseTo.setTotalRows(userDao.getTotal());
        responseTo.setData(userDao.getPager(startRow,endRow,sortBy));
        return responseTo;
    }
}
