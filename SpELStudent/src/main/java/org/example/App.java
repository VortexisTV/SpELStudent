package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context1 = new ClassPathXmlApplicationContext("BeanConfig.xml");
        ApplicationContext context2 =  new AnnotationConfigApplicationContext("org.example");
        Student s = (Student) context1.getBean("Student");
        Student s2 = (Student) context2.getBean("student");
        System.out.println(s);
        System.out.println(s2);
    }
}
