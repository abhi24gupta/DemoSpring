import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

public class SetterDemoApp {
    public static void main(String [] args){
        //load the spring configuration file
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

        // retirve bean from spring container
        CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());

        // Injecting values from properties file
//        1. Create Properties file
//        2. Load Properties files in Spring config file
//        3. Reference values from Properties file

        //close the context
        context.close();
    }
}
