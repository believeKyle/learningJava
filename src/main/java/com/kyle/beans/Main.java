package com.kyle.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String... args){
        //ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/beans.xml");
        //ApplicationContext context = new FileSystemXmlApplicationContext("file:/Users/kyle/Documents/IdeaWorkSpace/demo/src/main/resources/beans.xml");
        //ApplicationContext context = new ClassPathXmlApplicationContext("resources/beans.xml");
        Person person = (Person)context.getBean("person");
        System.out.println(person.getName());
    }
}
