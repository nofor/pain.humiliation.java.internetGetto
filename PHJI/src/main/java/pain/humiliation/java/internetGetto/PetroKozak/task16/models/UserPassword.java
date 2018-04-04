package pain.humiliation.java.internetGetto.PetroKozak.task16.models;

import javax.persistence.*;

@Entity(name = "UserPassword")
public class UserPassword {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    int id;

    @Column(name = "Ecrypted_Password")
    private String ecryptedPassword;

    @Column(name = "decrypted_Password")
    private String decryptedPassword;

    @OneToOne(fetch = FetchType.EAGER)
    private UserCredentials userCredentials;

    public UserPassword(String ecryptedPassword, String decryptedPassword, UserCredentials userCredentials) {
        this.ecryptedPassword = ecryptedPassword;
        this.decryptedPassword = decryptedPassword;
        this.userCredentials = userCredentials;
    }

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
                ", ecryptedPassword='" + ecryptedPassword + '\'' +
                ", decryptedPassword='" + decryptedPassword + '\'' +
                ", userCredentials=" + userCredentials +
                '}';
    }
}
