import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args)
    {
        // Get Workout of Baseball Coach
        Coach theCoach = new BaseballCoach();
        System.out.println(theCoach.getDailyWorkout());


        // Get Workput for the Gymnastics
        Coach theCoach1= new GymCoach();
        System.out.println(theCoach1.getDailyWorkout());

        Coach theCoach2 = new TrackCoach();
        System.out.println(theCoach2.getDailyWorkout());

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


        //retireve bean from spring container
        Coach theCoach3= context.getBean("myCoach3", Coach.class);

        // Call methods on the bean
        System.out.println(theCoach3.getDailyWorkout());

        //close the context
        context.close();

        // Implementation DOne till Video 25



    }
}