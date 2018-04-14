package pain.humiliation.java.internetGetto.Calllka.task16.model;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Model of user credentials it is a POJO for working with database.
 * In the other word, the class describing structure of the table.
 * The data will be saved in table is: nickname and password.
 * (name of table indicates in annotation '@Entity')
 *
 * @author calllka
 * @version 1.0
 * @since 4.4.2018
 */
@Entity(name = "User_Credentials")
public class UserCredentials {

    /**
     * Identity number of user credentials
     */
    @Id
    @Column(name = "User_Credentials_Id")
    @GeneratedValue(strategy = IDENTITY)
    private int userCredentialsId;

    /**
     * User nickname
     */
    @Column(name = "User_Nickname")
    private String userNickname;

    /**
     * User password
     */
    @Column(name = "User_Password")
    private String userPassword;

    /**
     * Instance of UserPassword class, which contains info about (en\de)crypted password.
     * <p>
     * Relation between this two Models is OneToOne
     *
     * @see UserPassword
     */
    @OneToOne(cascade = CascadeType.ALL)
    private UserPassword userPasswordClass;

    /**
     * Default constructor displays full data from table User_Credentials
     * (w\o this constructor you can't output full data)
     */
    public UserCredentials() {
    }

    /**
     * Constructor with parameter that used to save information
     * about {@link userNickname}, {@link userPassword} and {@link userPasswordClass}
     *
     * @param userNickname      {@link userNickname}
     * @param userPassword      {@link userPassword}
     * @param userPasswordClass {@link userPasswordClass}
     */
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