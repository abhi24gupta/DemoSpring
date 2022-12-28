import java.util.List;

public  class GymCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "GAME : GYM || 50 Set Pushups & Trademill";
    }

    @Override
    public List<String> getLocations() {
        return null;
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
