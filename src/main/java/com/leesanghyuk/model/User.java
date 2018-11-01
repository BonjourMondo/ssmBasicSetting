package com.leesanghyuk.model;

public class User {
    //用户标识
    private Integer id;
    //用户姓名
    private String name;
    //用户性别
    private String sex;
    //用户年龄
    private int age;
    //无参构造器
    public User() {
    }
    //有参构造器
    public User(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    //getter setter

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
