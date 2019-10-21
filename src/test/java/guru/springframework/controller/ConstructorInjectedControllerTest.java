package guru.springframework.controller;

import guru.springframework.controllers.ConstructorInjectedController;
import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.stereotype.Controller;

import static org.junit.Assert.assertEquals;

/**
 * Created by Daniel Šulik on 08-Oct-19
 * <p>
 * Class ConstructorInjectedControllerTest is used for .....
 */
public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_SPRINGER, constructorInjectedController.sayHello());
    }
}
