package com.mycompany.study;

import com.vaadin.data.Container;
import com.vaadin.data.util.BeanItemContainer;
import org.fluttercode.datafactory.impl.DataFactory;

/**
 *  mock some user info
 *  lazy singleton mode
 */
public class MyBeanContainer {

    private static Container instance;

    private MyBeanContainer(){
    }

    public static Container getInstance(){
        if(instance == null){
            BeanItemContainer<UserDto> container = new BeanItemContainer<UserDto>(UserDto.class);
            DataFactory dataFactory = new DataFactory();
            for (int i = 1; i <= 100; i++) {
                UserDto userDto = new UserDto();
                userDto.setId(String.valueOf(i));
                userDto.setName(dataFactory.getName());
                userDto.setAge(String.valueOf(dataFactory.getNumberBetween(20,60)));
                container.addBean(userDto);
                instance = container;
            }
        }
        return instance;
    }

}
