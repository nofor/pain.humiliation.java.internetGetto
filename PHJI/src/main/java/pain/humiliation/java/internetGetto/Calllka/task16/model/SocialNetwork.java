package pain.humiliation.java.internetGetto.Calllka.task16.model;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity(name = "SocialNetwork")
public class SocialNetwork {

    @Id
    @Column(name = "Social_Network_Id")
    @GeneratedValue(strategy = IDENTITY)
    private int socialNetworkId;

    @Column(name = "Network_Name")
    private String networkName;

    @Column(name = "Network_Friends_Count")
    private String networkFriendsCount;

    public SocialNetwork() {
    }

    public SocialNetwork(String networkName, String networkFriendsCount) {
        this.networkName = networkName;
        this.networkFriendsCount = networkFriendsCount;
    }

    public int getSocialNetworkId() {
        return socialNetworkId;
    }

    public void setSocialNetworkId(int socialNetworkId) {
        this.socialNetworkId = socialNetworkId;
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

    @Override
    public String toString() {
        return "SocialNetwork{" +
                "socialNetworkId=" + socialNetworkId +
                ", networkName='" + networkName + '\'' +
                ", networkFriendsCount='" + networkFriendsCount + '\'' +
                '}';
    }
}
