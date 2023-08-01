package com.bhagwat.Fristapp;
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
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
    	
//      Vehicle obj= (Vehicle)context.getBean("bike");
//          obj.drive();
//     Vehicle obj1= (Vehicle)context.getBean("car");
//          obj1.drive();
    	Tyre t = (Tyre)context.getBean("tyre");
    	System.out.println(t);
    	
    }
}
