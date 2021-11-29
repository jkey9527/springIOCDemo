package com.gm.model;

import java.io.Serializable;

public class User implements Serializable {

    private Integer id;

    private String name;

    private Dog dog;

    public User() {
    }

    public User(Integer id, String name, Dog dog) {
        this.id = id;
        this.name = name;
        this.dog = dog;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void hello(){
        System.out.println("hello!");
    }

}
