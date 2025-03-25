package com.diya;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // This is the Spring container that will manage the beans
        dev obj = (dev) context.getBean("dev"); // This is the bean that we are trying to get from the container
        // dev obj= new dev();
         obj.build();
            obj.setAge(19);
            System.out.println(obj.getAge());

    }
}
