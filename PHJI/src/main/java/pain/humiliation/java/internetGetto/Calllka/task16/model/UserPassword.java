package pain.humiliation.java.internetGetto.Calllka.task16.model;

import javax.persistence.*;

/**
 * Model of user password it is a POJO for working with database.
 * In the other word, the class describing structure of the table.
 * The data will be saved in table is: user (en\de)crypted password.
 * (name of table indicates in annotation '@Entity')
 *
 * @author calllka
 * @version 1.0
 * @since 4.4.2018
 */
@Entity(name = "User_Password")
public class UserPassword {

    /**
     * Identity number of user password
     */
    @Id
    @Column(name = "User_Password_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userPasswordId;

    /**
     * User encrypted password
     */
    @Column(name = "Encrypted_Password")
    private String encryptedPassword;

    /**
     * User decrypted password
     */
    @Column(name = "DecryptedPassword")
    private String decryptedPassword;

    /**
     * Default constructor displays full data from table User_Password
     * (w\o this constructor you can't output full data)
     */
    public UserPassword() {
    }

    /**
     * Constructor with parameter that used to save information
     * about {@link encryptedPassword} and {@link decryptedPassword}
     *
     * @param encryptedPassword {@link encryptedPassword}
     * @param decryptedPassword {@link decryptedPassword}
     */
    public UserPassword(String encryptedPassword, String decryptedPassword) {
        this.encryptedPassword = encryptedPassword;
        this.decryptedPassword = decryptedPassword;
    }

    public int getUserPasswordId() {
        return userPasswordId;
    }

    public void setUserPasswordId(int userPasswordId) {
        this.userPasswordId = userPasswordId;
    }

    public java.lang.String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(java.lang.String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    public java.lang.String getDecryptedPassword() {
        return decryptedPassword;
    }

    public void setDecryptedPassword(java.lang.String decryptedPassword) {
        this.decryptedPassword = decryptedPassword;
    }

    @Override
    public String toString() {
        return "UserPassword{" +
                "userPasswordId=" + userPasswordId +
                ", encryptedPassword='" + encryptedPassword + '\'' +
                ", decryptedPassword='" + decryptedPassword + '\'' +
                '}';
    }
}
