package org.prodapt.spring_hello;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        
        Hello_World obj = (Hello_World) context.getBean("helloBean");
        
        obj.printHello();
        
        ((ClassPathXmlApplicationContext)context).close();
    	System.out.println( "Hello World!" );
    }
}
