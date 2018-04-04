package pain.humiliation.java.internetGetto.PetroKozak.task16.models;

import javax.persistence.*;

@Entity
@Table(name = "UserCredentials")
public class UserCredentials {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    int id;

    @Column(name = "User Nickname")
    private String userNickname;

    @Column(name = "UserPasswordID")
    @OneToOne
    private UserPassword userPassword;

    public UserCredentials(String userNickname, UserPassword userPassword) {
        this.userNickname = userNickname;
        this.userPassword = userPassword;
    }

    public UserCredentials() {
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public UserPassword getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(UserPassword userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "UserCredentials{" +
                "id=" + id +
                ", userNickname='" + userNickname + '\'' +
                ", userPassword=" + userPassword +
                '}';
    }
}
