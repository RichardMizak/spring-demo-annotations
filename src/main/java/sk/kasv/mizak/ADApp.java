package sk.kasv.mizak;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ADApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");
        Coach coach=context.getBean("coach",Coach.class);
        System.out.println(coach.getDailyWorkout());
        context.close();
    }
}
