package guru.springframework.examplebeans;

/**
 * Created by Daniel Šulik on 07-Feb-20
 * <p>
 * Class FakeJMSBroker is used for .....
 */
public class FakeJMSBroker {

    private String username;
    private String password;
    private String url;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
