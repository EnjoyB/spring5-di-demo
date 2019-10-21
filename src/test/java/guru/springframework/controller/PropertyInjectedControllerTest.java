package guru.springframework.controller;

import guru.springframework.controllers.PropertyInjectedController;
import guru.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Daniel Šulik on 08-Oct-19
 * <p>
 * Class PropertyInjectedControllerTest is used for .....
 */
public class PropertyInjectedControllerTest {
    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_SPRINGER, this.propertyInjectedController.sayHello());
    }
}
