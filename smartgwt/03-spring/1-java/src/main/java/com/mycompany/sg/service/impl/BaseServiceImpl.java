package com.mycompany.sg.service.impl;

import com.mycompany.sg.dao.BaseDao;
import com.mycompany.sg.service.BaseService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Service实现类 - Service实现类基类
 */
@Transactional
public class BaseServiceImpl<T> implements BaseService<T> {

    private BaseDao<T> baseDao;

    public BaseDao<T> getBaseDao() {
        return baseDao;
    }

    public void setBaseDao(BaseDao<T> baseDao) {
        this.baseDao = baseDao;
    }

    public T get(String id) {
        return baseDao.get(id);
    }

    public List<T> get(String[] ids) {
        return baseDao.get(ids);
    }

    public T get(String propertyName, Object value) {
        return baseDao.get(propertyName, value);
    }

    public List<T> getList(String propertyName, Object value) {
        return baseDao.getList(propertyName, value);
    }

    public List<T> getAll() {
        return baseDao.getAll();
    }

    public Long getTotalCount() {
        return baseDao.getTotalCount();
    }

    public boolean isExist(String propertyName, Object value) {
        return baseDao.isExist(propertyName, value);
    }

    public String save(T entity) {
        return baseDao.save(entity);
    }

    public void update(T entity) {
        baseDao.update(entity);
    }

    public void delete(T entity) {
        baseDao.delete(entity);
    }

    public void delete(String id) {
        baseDao.delete(id);
    }

    public void delete(String[] ids) {
        baseDao.delete(ids);
    }

}
