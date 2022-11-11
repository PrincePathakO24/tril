package com.hibernate.SpringLab1;

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
        ApplicationContext ac=new ClassPathXmlApplicationContext("SpringContext.xml"); // object & path of  ApplicationContext
        Student st=(Student)ac.getBean("studentbean1"); // obj 1 of Student 
        System.out.println(st+"\n");					// to print
        Student st1=(Student)ac.getBean("studentbean2"); // obj 2 of Student 
        System.out.println(st1);						// to print
    
    }
} 