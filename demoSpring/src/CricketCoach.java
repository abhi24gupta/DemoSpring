import java.util.List;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;
    // create no args constructor
    public CricketCoach(){
        System.out.println("CricketCoach : inside non-args constructor");
    }

    // our setter method for Calling Setter Injections
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach : inside Setter method");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling";
    }

    @Override
    public List<String> getLocations() {
        return null;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
