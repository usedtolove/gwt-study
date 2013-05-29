package com.mycompany.study;

import com.vaadin.data.Container;
import com.vaadin.data.util.ObjectProperty;
import com.vaadin.ui.Table;

/**
 * UserDto Table UI
 */
public class UserTable extends Table {

    public UserTable() {
        setCaption("this is a simple user table");
        setSelectable(true);
        setImmediate(true);
        setHeight("233px");
        setWidth("50%");

        ObjectProperty<UserDto> objectProperty = new ObjectProperty<UserDto>(null, UserDto.class);
        setPropertyDataSource(objectProperty);
        //create dummy  in-memory  container
        Container container = MyBeanContainer.getInstance();
        setContainerDataSource(container);
        //pagination
        setPageLength(20);

        setColumnHeader("id","编号");
        setColumnHeader("name", "名称");
        setColumnHeader("age", "年龄");

        //custom table column sequence
        Object[] columns = new Object[]{"id", "name", "age"};
        setVisibleColumns(columns);
    }

}
