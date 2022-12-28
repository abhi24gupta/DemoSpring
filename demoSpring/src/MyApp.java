import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;
import java.util.List;

public class MyApp {
    public static void main(String[] args)
    {

        // Video 22: Spring Inversion of Control
//        Spring Development Process
//            1. Configre your Spring Beans
//        applicationContext.xml
//        <bean id="myCoach"
//            class="demoSpring.BaseballCoach">
//            </bean>

//            2. Create a Spring Container
//            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//            3. Retrieve Beans from Spring Container
//              Coach theCoach = context.getBean("myCoach", Coach.class);

        // load the Spring Configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Section 5 : Video 29
//            Constructor Injection
//                    1. Define the dependency interface and class
//                    2. Create a constructor in your class for injections
//                    3. Configure the dependency injection in Spring config file

        Coach theCoach = context.getBean("myCoach",Coach.class);
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        Coach theTrackCoach = context.getBean("myTrackCoach",Coach.class);
        System.out.println(theTrackCoach.getDailyWorkout());
        System.out.println(theTrackCoach.getDailyFortune());
        context.close();
    }
}