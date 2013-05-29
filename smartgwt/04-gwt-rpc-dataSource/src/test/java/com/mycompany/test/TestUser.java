package com.mycompany.test;

import com.mycompany.sg.server.entity.User;
import com.mycompany.sg.server.service.UserService;
import org.fluttercode.datafactory.impl.DataFactory;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import javax.annotation.Resource;
import java.util.List;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestUser extends AbstractJUnit4SpringContextTests {

    @Resource
    private UserService userService;

    @Resource(name = "&sessionFactory")
    private LocalSessionFactoryBean sessionFactory;

    @Test
    public void test1DDL(){
        SchemaExport se = new SchemaExport( sessionFactory.getConfiguration());
        se.create(true,true);
    }

    @Test
    public void test2BatchSave() {
        DataFactory df = new DataFactory();
        for (int i = 0; i < 100; i++) {
            User user = new User();
            user.setName(df.getName());
            user.setLocation(df.getAddress());
            userService.save(user);
        }
    }
}
