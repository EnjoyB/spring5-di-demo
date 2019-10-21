package guru.springframework;

import guru.springframework.controllers.ConstructorInjectedController;
import guru.springframework.controllers.GetterInjectedController;
import guru.springframework.controllers.MyController;
import guru.springframework.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);

		MyController myController = (MyController) context.getBean("myController");

		myController.sayHello();

        System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(context.getBean(GetterInjectedController.class).sayHello());
        System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());
    }
}
