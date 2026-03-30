package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Desktop desktopObj = context.getBean(Desktop.class);
        desktopObj.compile();

        Desktop desktopObj1 = context.getBean( Desktop.class);
        desktopObj1.compile();

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj1 = context.getBean("alien1", Alien.class);
////        obj1.setAge(11);
//        System.out.println(obj1.getAge());
//        obj1.code();
////        Alien obj2 = (Alien) context.getBean("alien1");
////        System.out.println(obj2.getAge());
////        obj2.code();
//
////        Laptop laptopObj = context.getBean(Laptop.class);
////        laptopObj.machine();
//
//        Desktop obj2 = context.getBean("com2", Desktop.class);

    }
}
