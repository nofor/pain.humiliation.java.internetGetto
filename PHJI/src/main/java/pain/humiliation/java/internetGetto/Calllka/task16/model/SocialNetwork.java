package pain.humiliation.java.internetGetto.Calllka.task16.model;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity(name = "SocialNetwork")
public class SocialNetwork {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = IDENTITY)
    private int id;

    @Column(name = "Network_Name")
    private String networkName;

    @Column(name = "Network_Friends_Count")
    private String networkFriendsCount;

    @ManyToOne
    private User user;

    public SocialNetwork() {
    }

    public SocialNetwork(String networkName, String networkFriendsCount, User user) {
        this.networkName = networkName;
        this.networkFriendsCount = networkFriendsCount;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public String getNetworkFriendsCount() {
        return networkFriendsCount;
    }

    public void setNetworkFriendsCount(String networkFriendsCount) {
        this.networkFriendsCount = networkFriendsCount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "SocialNetwork{" +
                "id=" + id +
                ", networkName='" + networkName + '\'' +
                ", networkFriendsCount='" + networkFriendsCount + '\'' +
                ", user=" + user +
                '}';
    }
}
