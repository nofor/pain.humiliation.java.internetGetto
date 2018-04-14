package pain.humiliation.java.internetGetto.PetroKozak.task16.models;

import javax.persistence.*;

/**
 * The following class is a model of a table "SocialNetwork" which will be created as a result of the hole program working
 * @author Petro Kozak
 */
@Entity(name = "SocialNetwork")
public class SocialNetwork {

    /**
     * Field "Id" with Generation Type Identity will be used for id-generation by the created table
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    int id;

    /**
     * This is String field which stands for the name of a social network which is used by user
     * is signed as a separated column
     */
    @Column(name = "Network_Name")
    private String networkName;

    /**
     * This is int  field representing the amount of followers by the corresponding social network
     * is signed as a separated column
     */
    @Column(name = "Network_Friends_Count")
    private int networkFriendsCount;

    /**
     * This is a class constructor specifying all the fields of Class except id to create the class instance
     *
     * @param networkName
     * @param networkFriendsCount
     */
    public SocialNetwork(String networkName, int networkFriendsCount) {
        this.networkName = networkName;
        this.networkFriendsCount = networkFriendsCount;
    }

    /**
     * Default constructor
     */
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
