package pain.humiliation.java.internetGetto.PetroKozak.task16.models;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * The following class is a model of a table "users" which will be created as a result of the hole program working
 * @author Petro Kozak
 */
@Entity(name = "users")
public class User {

    /**
     * Field "Id" with Generation Type Identity will be used for id-generation by the created table
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    int id;

    /**
     * This String field stands for the users name,
     * is also annotated as a separated column in the future table
     */
    @Column(name = "Name")
    private String name;

    /**
     * This String field stands for the users surname,
     * is also annotated as a separated column in the future table
     */
    @Column(name = "Surname")
    private String surname;

    /**
     * This int field stands for the users age,
     * is also annotated as a separated column in the future table
     */
    @Column(name = "age")
    private int age;

    /**
     * This field is a List of Work class instances, which represent the
     * the user work placed, either actual one, or those in the past
     *
     * Relation between this two Models is OneToMany, and this is only one-way relation
     * Fetching type is EAGER because we need to get all the connected Infos while selecting User-Objects in th DataBase.
     *
     * @see Work
     */
    @OneToMany(fetch = FetchType.EAGER)
    private List<Work> work;

    /**
     * This field is a Set of Interests class instances, which stands for the set of users interests.
     *
     * Relation between this two Models is OneToMany, and this is only one-way relation
     * Fetching type is EAGER because we need to get all the connected Infos while selecting User-Objects in th DataBase.
     *
     * @see Interests
     */
    @OneToMany(fetch = FetchType.EAGER)
    private Set<Interests> interests;

    /**
     * This field is a Set of SocialNetwork class instances, which represents
     * all the social networks, that our users is registered in.
     *
     * Relation between this two Models is OneToMany, and this is only one-way relation
     * Fetching type is EAGER because we need to get all the connected Infos while selecting User-Objects in th DataBase.
     *
     * @see SocialNetwork
     */
    @OneToMany(fetch = FetchType.EAGER)
    private Set<SocialNetwork> socialNetworks;

    /**
     * This field is a UserCredential class instance, which contains such infos as users nickname and users password
     *
     * Relation between this two Models is OneToOne, because such params as nick and password have to be unique ones.
     * Fetching type is EAGER because we need to get all the connected Infos while selecting User-Objects in th DataBase.
     *
     * @see SocialNetwork
     */
    @OneToOne(fetch = FetchType.EAGER)
    private  UserCredentials userCredentials;

    /**
     * This is class constructor specifying all the fields of Class except id to create the class instance
     *
     * @param name  users name
     * @param surname users surname
     * @param age users age
     * @param work list containing instances of class Work
     * @param interests list containing instances of class Interests
     * @param socialNetworks list containing instances of class SocialNetwork
     * @param userCredentials list containing instances of class UserCredentials
     *
     * @see Work
     * @see Interests
     * @see SocialNetwork
     * @see UserCredentials
     */
    public User(String name, String surname, int age, List<Work> work, Set<Interests> interests, Set<SocialNetwork> socialNetworks, UserCredentials userCredentials) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.work = work;
        this.interests = interests;
        this.socialNetworks = socialNetworks;
        this.userCredentials = userCredentials;
    }

    /**
     * Default constructor
     */
    public User() {
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

    public List<Work> getWork() {
        return work;
    }

    public void setWork(List<Work> work) {
        this.work = work;
    }

    public Set<Interests> getInterests() {
        return interests;
    }

    public void setInterests(Set<Interests> interests) {
        this.interests = interests;
    }

    public Set<SocialNetwork> getSocialNetworks() {
        return socialNetworks;
    }

    public void setSocialNetworks(Set<SocialNetwork> socialNetworks) {
        this.socialNetworks = socialNetworks;
    }

    public UserCredentials getUserCredentials() {
        return userCredentials;
    }

    public void setUserCredentials(UserCredentials userCredentials) {
        this.userCredentials = userCredentials;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", work=" + work +
                ", interests=" + interests +
                ", socialNetworks=" + socialNetworks +
                ", userCredentials=" + userCredentials +
                '}';
    }
}
