package guru.springframework.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Daniel Šulik on 21-Oct-19
 * <p>
 * Class GetterGreetingService is used for .....
 */
@Service
public class GetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the getter";
    }
}
