package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * Created by Daniel Šulik on 21-Oct-19
 * <p>
 * Class ConstructorGreetingService is used for .....
 */
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - I was injected via the constructor!!!";
    }
}
