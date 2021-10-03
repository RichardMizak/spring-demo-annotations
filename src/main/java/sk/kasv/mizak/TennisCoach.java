package sk.kasv.mizak;

import org.springframework.stereotype.Component;

@Component("coach")
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice";
    }
}
