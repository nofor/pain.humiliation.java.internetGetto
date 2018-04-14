package pain.humiliation.java.internetGetto.Calllka.task16.model;

import javax.persistence.*;

import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Model of Users it is a POJO for working with database.
 * In the other word, the class describing structure of the table.
 * The data will be saved in table is: name, surname, age and
 * collection of work, interests, socialNetwork and userCredentials.
 * (name of table indicates in annotation '@Entity')
 *
 * @author calllka
 * @version 1.0
 * @see Work
 * @see Interests
 * @see SocialNetwork
 * @see UserCredentials
 * @since 4.4.2018
 */
@Entity(name = "Users")
public class Users {

    /**
     * Identity number of interests
     */
    @Id
    @Column(name = "User_Id")
    @GeneratedValue(strategy = IDENTITY)
    private int userId;

    /**
     * Users name
     */
    @Column(name = "Name")
    private String name;

    /**
     * Users surname
     */
    @Column(name = "Surname")
    private String surname;

    /**
     * Users age
     */
    @Column(name = "Age")
    private int age;

    /**
     * The Set collection for storage instance of Work class.
     * <p>
     * Relation between this two Models is OneToMany. That means that one user can keep one or more jobs.
     * The fetch type Eager indicates that the data from table Work will be unloaded at the same time with Users.
     *
     * @see Work
     */
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Work> workID;

    /**
     * The Set collection for storage instance of Interests class.
     * <p>
     * Relation between this two Models is OneToMany. That means that one user can keep one or more interests.
     * The fetch type Eager indicates that the data from table Work will be unloaded at the same time with Users.
     *
     * @see Interests
     */
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Interests> interestsId;

    /**
     * The Set collection for storage instance of SocialWork class.
     * <p>
     * Relation between this two Models is OneToMany. That means that one user can keep one or more social network.
     * The fetch type Eager indicates that the data from table Work will be unloaded at the same time with Users.
     *
     * @see SocialNetwork
     */
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<SocialNetwork> socialNetworkId;

    /**
     * Instance of UserCredentials class, which contains info about user nickname and password.
     * <p>
     * Relation between this two Models is OneToOne
     *
     * @see UserCredentials
     */
    @OneToOne(cascade = CascadeType.ALL)
    private UserCredentials userCredentialsId;

    /**
     * Default constructor displays full data from table Users
     * (w\o this constructor you can't output full data)
     */
    public Users() {
    }

    /**
     * Constructor with parameter that used to save information
     * about {@link name}, {@link surname}, {@link age}, {@link workID},
     * {@link interestsId}, {@link socialNetworkId} and {@link userCredentialsId}
     *
     * @param name              {@link name}
     * @param surname           {@link surname}
     * @param age               {@link age}
     * @param workID            {@link workID}
     * @param interestsId       {@link interestsId}
     * @param socialNetworkId   {@link socialNetworkId}
     * @param userCredentialsId {@link userCredentialsId}
     */
    public Users(String name, String surname, int age, Set<Work> workID, Set<Interests> interestsId, Set<SocialNetwork> socialNetworkId, UserCredentials userCredentialsId) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.workID = workID;
        this.interestsId = interestsId;
        this.socialNetworkId = socialNetworkId;
        this.userCredentialsId = userCredentialsId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<Work> getWorkID() {
        return workID;
    }

    public void setWorkID(Set<Work> workID) {
        this.workID = workID;
    }

    public Set<Interests> getInterestsId() {
        return interestsId;
    }

    public void setInterestsId(Set<Interests> interestsId) {
        this.interestsId = interestsId;
    }

    public Set<SocialNetwork> getSocialNetworkId() {
        return socialNetworkId;
    }

    public void setSocialNetworkId(Set<SocialNetwork> socialNetworkId) {
        this.socialNetworkId = socialNetworkId;
    }

    public UserCredentials getUserCredentialsId() {
        return userCredentialsId;
    }

    public void setUserCredentialsId(UserCredentials userCredentialsId) {
        this.userCredentialsId = userCredentialsId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", workID=" + workID +
                ", interestsId=" + interestsId +
                ", socialNetworkId=" + socialNetworkId +
                ", userCredentialsId=" + userCredentialsId +
                '}';
    }
}
