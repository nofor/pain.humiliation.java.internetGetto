package pain.humiliation.java.internetGetto.Calllka.task16.model;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity(name = "User_Credentials")
public class UserCredentials {

    @Id
    @Column(name = "User_Credentials_Id")
    @GeneratedValue(strategy = IDENTITY)
    private int userCredentialsId;

    @Column(name = "User_Nickname")
    private String userNickname;

    @Column(name = "User_Password")
    private String userPassword;

    @OneToOne(cascade = CascadeType.ALL)
    private UserPassword userPasswordClass;

    public UserCredentials() {
    }

    public UserCredentials(String userNickname, String userPassword, UserPassword userPasswordClass) {
        this.userNickname = userNickname;
        this.userPassword = userPassword;
        this.userPasswordClass = userPasswordClass;
    }

    public int getUserCredentialsId() {
        return userCredentialsId;
    }

    public void setUserCredentialsId(int userCredentialsId) {
        this.userCredentialsId = userCredentialsId;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public UserPassword getUserPasswordClass() {
        return userPasswordClass;
    }

    public void setUserPasswordClass(UserPassword userPasswordClass) {
        this.userPasswordClass = userPasswordClass;
    }

    @Override
    public String toString() {
        return "UserCredentials{" +
                "userCredentialsId=" + userCredentialsId +
                ", userNickname='" + userNickname + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userPasswordClass=" + userPasswordClass +
                '}';
    }
}