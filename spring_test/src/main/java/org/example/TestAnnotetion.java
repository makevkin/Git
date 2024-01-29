package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotetion {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Cat cat = context.getBean("catBean", Cat.class);
        cat.say();
        context.close();
    }
}
