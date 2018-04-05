package pain.humiliation.java.internetGetto.Calllka.task16.model;

import javax.persistence.*;

@Entity(name = "User_Password")
public class UserPassword {

    @Id
    @Column(name = "User_Password_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userPasswordId;

    @Column(name = "Encrypted_Password")
    private String encryptedPassword;

    @Column(name = "DecryptedPassword")
    private String decryptedPassword;

    public UserPassword() {
    }

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
