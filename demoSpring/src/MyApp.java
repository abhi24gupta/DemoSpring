public class MyApp {
    public static void main(String[] args)
    {
        // Get Workout of Baseball Coach
        Coach theCoach = new BaseballCoach();
        System.out.println(theCoach.getDailyWorkout());


        // Get Workput for the Gymnastics
        Coach theCoahc1= new GymCoach();
        System.out.println(theCoahc1.getDailyWorkout());
    }
}