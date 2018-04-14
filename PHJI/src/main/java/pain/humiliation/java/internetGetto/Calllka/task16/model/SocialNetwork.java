package pain.humiliation.java.internetGetto.Calllka.task16.model;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Model of Social network it is a POJO for working with database.
 * In the other word, the class describing structure of the table.
 * The data will be saved in table is: social network name and count of friends.
 * (name of table indicates in annotation '@Entity')
 *
 * @author calllka
 * @version 1.0
 * @since 4.4.2018
 */
@Entity(name = "SocialNetwork")
public class SocialNetwork {

    /**
     * Identity number of social network
     */
    @Id
    @Column(name = "Social_Network_Id")
    @GeneratedValue(strategy = IDENTITY)
    private int socialNetworkId;

    /**
     * Users network name
     */
    @Column(name = "Network_Name")
    private String networkName;

    /**
     * Count of user network friends
     */
    @Column(name = "Network_Friends_Count")
    private String networkFriendsCount;

    /**
     * Default constructor displays full data from table SocialNetwork
     * (w\o this constructor you can't output full data)
     */
    public SocialNetwork() {
    }

    /**
     * Constructor with parameter that used to save information
     * about {@link networkName} and {@link networkFriendsCount}
     *
     * @param networkName         {@link networkName}
     * @param networkFriendsCount {@link networkFriendsCount}
     */
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
