package pain.humiliation.java.internetGetto.PetroKozak.task16.models;

import javax.persistence.*;

@Entity(name = "UserCredentials")
public class UserCredentials {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    int id;

    @Column(name = "User_Nickname")
    private String userNickname;

    @OneToOne(fetch = FetchType.EAGER)
    private UserPassword userPassword;

    @OneToOne(fetch = FetchType.EAGER)
    private User user;

    public UserCredentials(String userNickname, UserPassword userPassword, User user) {
        this.userNickname = userNickname;
        this.userPassword = userPassword;
        this.user = user;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserCredentials{" +
                "id=" + id +
                ", userNickname='" + userNickname + '\'' +
                ", userPassword=" + userPassword +
                ", user=" + user +
                '}';
    }
}
