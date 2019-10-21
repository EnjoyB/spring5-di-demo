package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Daniel Šulik on 08-Oct-19
 * <p>
 * Class SetterInjectedController is used for .....
 */
@Controller
public class GetterInjectedController {
    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    @Autowired
    @Qualifier("getterGreetingService")
    public void setGreetingService( GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
