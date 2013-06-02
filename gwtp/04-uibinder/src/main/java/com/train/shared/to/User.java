package com.train.shared.to;

import java.io.Serializable;

/**
 * User: Hu Jing Ling
 * Date: 2013-05-31
 */
public class User implements Serializable {

    private String name;
    private int age;
    private Pet pet;

    public User() {
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

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
