import java.util.List;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;
    public TrackCoach(FortuneService theFortuneService){
        fortuneService= theFortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "RUN a hard 5k";
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
