package com.kyle.core;

public class Outer {
    private String name;

    Outer(String name){
        this.name = name;
    }

    class Inner{
        void hello(){
            System.out.println("Hello, "+Outer.this.name);
        }
    }
}
