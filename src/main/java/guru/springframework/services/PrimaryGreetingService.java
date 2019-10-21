package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by Daniel Šulik on 21-Oct-19
 * <p>
 * Class PrimaryGreetingService is used for .....
 */
@Service
@Primary
public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello - Primary Greeting service";
    }
}
