package com.coderjeel.Springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

    @Component
    public void Alien{
    private int age;
    private Computer com;


    public int getAge() {
        return age;
    }

    @Autowired
    public void setAge(int age) {
        this.age = age;
    }
    public Computer getCom() {
        return com;
    }
    @Autowired
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        com.compile();
    }

 }