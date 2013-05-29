package com.mycompany.sg.client.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 胡荆陵
 * @version 1.0
 * @since 2013-3-19
 */
public class UserDto implements Serializable {

    //集成自 BaseEntity 父类
    private String id;// ID
    private Date createDate;// 创建日期
    private Date modifyDate;// 修改日期

    //User 自己的属性
    private String name;
    private int age;

    public UserDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id='" + id + '\'' +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
