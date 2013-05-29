package com.mycompany.sg.server.dao;

import com.mycompany.sg.shared.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Resource
    private SessionFactory sessionFactory;

    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    public User getById(int id) {
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

    @Override
    public int getTotal() {
        Object obj = getSession().createCriteria(User.class).setProjection(Projections.rowCount()).uniqueResult();
        return Integer.valueOf(String.valueOf(obj.toString()));
    }

    @Override
    public List<User> getPager(int startRow, int endRow, String[] sortBy) {
        return getSession().createCriteria(User.class)
                    .setFirstResult(startRow)
                    .setMaxResults(endRow - startRow)
                    .addOrder(Order.asc(sortBy[0]))
                    .list();
        //20
        //0  ,20
    }
}
