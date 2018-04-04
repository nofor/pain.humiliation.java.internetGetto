package pain.humiliation.java.internetGetto.PetroKozak.task16.models;

import javax.persistence.*;

@Entity
@Table(name = "SocialNetwork")
public class SocialNetwork {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    int id;

    @Column(name = "Network Name")
    private String networkName;

    @Column(name = "Network Friends Count")
    private int networkFriendsCount;

    public SocialNetwork(String networkName, int networkFriendsCount) {
        this.networkName = networkName;
        this.networkFriendsCount = networkFriendsCount;
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

    @Override
    public String toString() {
        return "SocialNetwork{" +
                "id=" + id +
                ", networkName='" + networkName + '\'' +
                ", networkFriendsCount=" + networkFriendsCount +
                '}';
    }
}
