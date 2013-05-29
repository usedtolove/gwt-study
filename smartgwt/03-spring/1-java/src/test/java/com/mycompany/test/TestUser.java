package com.mycompany.test;

import com.mycompany.sg.entity.User;
import com.mycompany.sg.service.UserService;
import org.hibernate.SessionFactory;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import javax.annotation.Resource;
import java.util.List;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@Ignore
public class TestUser extends AbstractJUnit4SpringContextTests {

    @Resource
    private UserService userService;

    @Resource(name = "&sessionFactory")
    private LocalSessionFactoryBean sessionFactory;

    @Test
    @Ignore
    public void test1simple() {
    }

    @Test
    public void test1DDL(){
        SchemaExport se = new SchemaExport( sessionFactory.getConfiguration());
        se.create(true,true);
    }

    @Test
    public void test2getAll() {
        List list = userService.getAll();
        System.out.println(list.size());
    }

    @Test
    public void test3save() {
        User user = new User();
        user.setName("testUser2");
        userService.save(user);

        long total = userService.getTotalCount();
//        Assert.assertEquals(1, total);
    }

    @Test
    public void test4update() {
        User user = userService.get("name", "testUser");
        Assert.assertNotNull(user);

        user.setAge(user.getAge()+1);
        userService.update(user);
    }

    @Test
    public void test5delete() {
        User user = userService.get("name", "testUser");
        Assert.assertNotNull(user);
        userService.delete(user);
    }


}
