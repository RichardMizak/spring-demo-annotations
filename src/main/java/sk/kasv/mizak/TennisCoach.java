package sk.kasv.mizak;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    private FortuneService fortuneService;
    public TennisCoach(){
        System.out.println("default constructor");
    }
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("setFortuneService constructor");
        this.fortuneService = fortuneService;
    }

    /*
        @Autowired
        public TennisCoach(FortuneService fortuneService1){
            fortuneService=fortuneService1;
        }
    */
    @Override
    public String getDailyWorkout() {
        return "Practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
