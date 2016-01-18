package dbService.dataSets;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by nikitaborodulin on 18/01/16.
 */
@Entity
@Table(name = "users")
public class UsersDataSet implements Serializable {
    private static final long serialVersionUID = -8706689714326132798L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "login", unique = true, updatable = false)
    private String login;

    @Column(name = "password", updatable = false)
    private String pass;

    //Important to Hibernate!
    @SuppressWarnings("UnusedDeclaration")
    public UsersDataSet() {
    }

    @SuppressWarnings("UnusedDeclaration")
    public UsersDataSet(long id, String login, String pass) {
        this.setId(id);
        this.setLogin(login);
        this.setPassword(pass);
    }

    public UsersDataSet(String login, String pass) {
        this.setId(-1);
        this.setLogin(login);
        this.setPassword(pass);
    }

    @SuppressWarnings("UnusedDeclaration")
    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return pass;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String pass) {
        this.pass = pass;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserDataSet{" +
                "id=" + id +
                ", login='" + login +
                ", password=" + pass + '\'' +
                '}';
    }
}
