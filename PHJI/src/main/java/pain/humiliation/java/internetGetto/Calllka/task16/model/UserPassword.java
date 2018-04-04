package pain.humiliation.java.internetGetto.Calllka.task16.model;

import javax.persistence.*;

@Entity(name = "User_Password")
public class UserPassword {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Encrypted_Password")
    private String encryptedPassword;

    @Column(name = "DecryptedPassword")
    private String decryptedPassword;

    @OneToOne
    private UserCredentials userCredentials;

    public UserPassword() {
    }

    public UserPassword(String encryptedPassword, String decryptedPassword, UserCredentials userCredentials) {
        this.encryptedPassword = encryptedPassword;
        this.decryptedPassword = decryptedPassword;
        this.userCredentials = userCredentials;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public UserCredentials getUserCredentials() {
        return userCredentials;
    }

    public void setUserCredentials(UserCredentials userCredentials) {
        this.userCredentials = userCredentials;
    }

    @Override
    public String toString() {
        return "UserPassword{" +
                "id=" + id +
                ", encryptedPassword='" + encryptedPassword + '\'' +
                ", decryptedPassword='" + decryptedPassword + '\'' +
                ", userCredentials=" + userCredentials +
                '}';
    }
}
