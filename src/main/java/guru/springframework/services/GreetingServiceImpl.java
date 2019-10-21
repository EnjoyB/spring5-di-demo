package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * Created by Daniel Šulik on 08-Oct-19
 * <p>
 * Class GreetingServiceImpl is used for .....
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_SPRINGER = "Hello Springers!!!!";


    @Override
    public String sayGreeting() {
        return HELLO_SPRINGER;
    }
}
