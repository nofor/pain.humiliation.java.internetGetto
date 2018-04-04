package pain.humiliation.java.internetGetto.PetroKozak.task16.models;

import javax.persistence.*;

@Entity(name = "SocialNetwork")
public class SocialNetwork {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    int id;

    @Column(name = "Network_Name")
    private String networkName;

    @Column(name = "Network_Friends_Count")
    private int networkFriendsCount;

    @ManyToOne
    private User user;

    public SocialNetwork(String networkName, int networkFriendsCount, User user) {
        this.networkName = networkName;
        this.networkFriendsCount = networkFriendsCount;
        this.user = user;
    }

    public SocialNetwork() {
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public int getNetworkFriendsCount() {
        return networkFriendsCount;
    }

    public void setNetworkFriendsCount(int networkFriendsCount) {
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
                ", networkFriendsCount=" + networkFriendsCount +
                ", user=" + user +
                '}';
    }
}
