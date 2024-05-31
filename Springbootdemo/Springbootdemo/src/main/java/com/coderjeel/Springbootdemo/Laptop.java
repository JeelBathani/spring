package com.coderjeel.Springbootdemo;

public class Laptop implements Computer {

    @Override
    public void compile() {
        System.out.println("compiling in laptop class ");
    }
}
