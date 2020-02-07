package guru.springframework;

import guru.springframework.controllers.ConstructorInjectedController;
import guru.springframework.controllers.GetterInjectedController;
import guru.springframework.controllers.MyController;
import guru.springframework.controllers.PropertyInjectedController;
import guru.springframework.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        FakeDataSource dataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

        System.out.println(
                String.format("Datasource contains:: \n user: %s\npassword: %s\nurl: %s\n", dataSource.getUser(),
                              dataSource.getPassword(), dataSource.getUrl()));
    }
}
