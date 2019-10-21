package guru.springframework.controller;

import guru.springframework.controllers.GetterInjectedController;
import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Daniel Šulik on 08-Oct-19
 * <p>
 * Class GetterInjectedControllerTest is used for .....
 */
public class GetterInjectedControllerTest {
    private GetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.setterInjectedController = new GetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_SPRINGER, this.setterInjectedController.sayHello());
    }
}
