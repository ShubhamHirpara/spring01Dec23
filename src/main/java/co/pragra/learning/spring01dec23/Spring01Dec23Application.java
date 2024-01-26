package co.pragra.learning.spring01dec23;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class Spring01Dec23Application {

    public static void main(String[] args) {
        //SpringApplication.run(Spring01Dec23Application.class, args);
        // Loose coupling
        //Car car = new Car("Toyota", new DieselEngine("Diesel"));
        //IOC -> Inversion of control
        // ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");

        Car car = context.getBean("car", Car.class);

        /*
        * Exercise:
        * create Guest class with firstName, LastName, email, PhoneNo
        * and create all args constuctor and toString method
        * use xml config file to create 3 beans with different values
        * use AppContext to getBean -> IOC
        * print all beans
        *
        *
        * create Address class with PostlCode and city
        * and create all args constuctor and toString method
        * use this address in guest class as property and remake constuctor&ToString
        * use xml config file to create 3 beans with different values
         * use AppContext to getBean -> IOC
         * print all beans
        * */

        System.out.println(car);

    }

}
