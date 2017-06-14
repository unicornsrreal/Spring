package com.demo.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
       HelloWorld obj = (HelloWorld) ctx.getBean("helloWorld");
       obj.printHello();
    }
}
