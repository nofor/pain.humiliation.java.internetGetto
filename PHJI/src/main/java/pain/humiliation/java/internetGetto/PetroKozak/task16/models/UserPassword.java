package pain.humiliation.java.internetGetto.PetroKozak.task16.models;

import javax.persistence.*;

/**
 * The following class is a model of a table "UserCredentials" which will be created as a result of the hole program working
 * @author Petro Kozak
 */
@Entity(name = "UserPassword")
public class UserPassword {

    /**
     * Field "Id" with Generation Type Identity will be used for id-generation by the created table
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    int id;

    /**
     * This is String field containing the ecrypted password of the user
     * is signed as a separated column
     */
    @Column(name = "Ecrypted_Password")
    private String ecryptedPassword;

    /**
     * This is String field containing the decrypted password of the user
     * is signed as a separated column
     */
    @Column(name = "decrypted_Password")
    private String decryptedPassword;

    /**
     * This is a class constructor specifying all the fields of Class except id to create the class instance
     *
     * @param ecryptedPassword
     * @param decryptedPassword
     */
    public UserPassword(String ecryptedPassword, String decryptedPassword) {
        this.ecryptedPassword = ecryptedPassword;
        this.decryptedPassword = decryptedPassword;
    }

    /**
     * Default constructor
     */
    public UserPassword() {
    }

    public String getEcryptedPassword() {
        return ecryptedPassword;
    }

    public void setEcryptedPassword(String ecryptedPassword) {
        this.ecryptedPassword = ecryptedPassword;
    }

    public String getDecryptedPassword() {
        return decryptedPassword;
    }

    public void setDecryptedPassword(String decryptedPassword) {
        this.decryptedPassword = decryptedPassword;
    }

    @Override
    public String toString() {
        return "UserPassword{" +
                "id=" + id +
                ", ecryptedPassword='" + ecryptedPassword + '\'' +
                ", decryptedPassword='" + decryptedPassword + '\'' +
                '}';
    }
}
