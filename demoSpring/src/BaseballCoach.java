import java.util.ArrayList;
import java.util.List;

public class BaseballCoach implements Coach{

    //define private field for dependency
    private FortuneService fortuneService;
    // define constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Game: Baseball || 30 Pushups";
    }

    @Override
    public List<String> getLocations() {
        List<String> locations = new ArrayList<>();
        locations.add("Sector 14");
        locations.add("Sector 32");
        locations.add("Queens Road");
        return locations;
    }
    @Override
    public String getDailyFortune() {
        // use myFortuneService to get Fortune
       return fortuneService.getFortune();
    }

}
