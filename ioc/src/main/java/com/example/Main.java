package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Circle circle = context.getBean("shape", Circle.class);
        System.out.print("Enter values: ");
        double area = circle.area();
        System.out.println(String.format("%.2f", area) + " " + circle.getCreator());

    }
}