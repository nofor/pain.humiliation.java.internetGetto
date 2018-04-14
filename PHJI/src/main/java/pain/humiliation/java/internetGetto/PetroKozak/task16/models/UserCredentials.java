package pain.humiliation.java.internetGetto.PetroKozak.task16.models;

import javax.persistence.*;

/**
 * The following class is a model of a table "UserCredentials" which will be created as a result of the hole program working
 * @author Petro Kozak
 */
@Entity(name = "UserCredentials")
public class UserCredentials {

    /**
     * Field "Id" with Generation Type Identity will be used for id-generation by the created table
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    int id;

    /**
     * This is String field which stands for the users nickname
     * is signed as a separated column
     */
    @Column(name = "User_Nickname")
    private String userNickname;

    /**
     * This field is a UserPassword class instance, which contains such infos as ecrypted and decrypted password.
     *
     * Relation between this two Models is OneToOne, because such params as nick and password have to be unique ones.
     * Fetching type is EAGER because we need to get all the connected Infos while selecting User-Objects in th DataBase.
     *
     * @see UserPassword
     */
    @OneToOne(fetch = FetchType.EAGER)
    private UserPassword userPassword;

    /**
     * This is a class constructor specifying all the fields of Class except id to create the class instance
     *
     * @param userNickname
     * @param userPassword
     *
     * @see UserPassword
     */
    public UserCredentials(String userNickname, UserPassword userPassword) {
        this.userNickname = userNickname;
        this.userPassword = userPassword;
    }

    /**
     * Default constructor
     */
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
