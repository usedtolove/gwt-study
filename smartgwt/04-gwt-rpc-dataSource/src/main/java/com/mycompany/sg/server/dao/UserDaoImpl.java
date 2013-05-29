package com.mycompany.sg.server.dao;

import com.mycompany.sg.server.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Resource
    private SessionFactory sessionFactory;

    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    public User getById(String id) {
        return (User) getSession().get(User.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<User> getAll() {
        return getSession().createCriteria(User.class).list();
    }

    public User save(User user) {
        getSession().save(user);
        return user;
    }

    public User update(User user) {
        getSession().saveOrUpdate(user);
        return user;
    }

    public void delete(User user) {
        getSession().delete(user);
    }
}
