import java.util.List;

public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "RUN a hard 5k";
    }

    @Override
    public List<String> getLocations() {
        return null;
    }
}
