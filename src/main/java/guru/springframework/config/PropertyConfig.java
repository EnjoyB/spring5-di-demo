package guru.springframework.config;

import guru.springframework.examplebeans.FakeDataSource;
import guru.springframework.examplebeans.FakeJMSBroker;
import jdk.nashorn.internal.objects.annotations.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * Created by Daniel Šulik on 07-Feb-20
 * <p>
 * Class PropertyConfig is used for .....
 */
@Configuration
//@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
@PropertySources({@PropertySource("classpath:datasource.properties"), @PropertySource("classpath:jms.properties")}

)
public class PropertyConfig {

    @Autowired
    Environment environment;

    @Value("${demo.username}")
    String user;

    @Value("${demo.password}")
    String password;

    @Value("${demo.dburl}")
    String url;


    @Value("${demo.jms.username}")
    String jmsUsername;

    @Value("${demo.jms.password}")
    String jmsPassword;

    @Value("${demo.jms.dburl}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource dataSource = new FakeDataSource();
        dataSource.setUser(environment.getProperty("username"));
        dataSource.setPassword(password);
        dataSource.setUrl(url);
        return dataSource;
    }

    @Bean
    public FakeJMSBroker fakeJMSBroker() {
        FakeJMSBroker dataSource = new FakeJMSBroker();
        dataSource.setUsername(jmsUsername);
        dataSource.setPassword(jmsPassword);
        dataSource.setUrl(jmsUrl);
        return dataSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        return configurer;
    }
}
