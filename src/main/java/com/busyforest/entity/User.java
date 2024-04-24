package com.busyforest.entity;

public class User {
    private int age;
    private int uid;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return this.getClass()+"["+this.name+", "+this.uid
                +", "+this.age+"]";
    }
}
