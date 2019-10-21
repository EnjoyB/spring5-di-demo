package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by Daniel Šulik on 08-Oct-19
 * <p>
 * Class MyController is used for .....
 */
@Controller // Using controller I'm saying that there is going to be created this type of bean
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        System.out.println("Hello my friend!!!");

        return greetingService.sayGreeting();
    }

}
