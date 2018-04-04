package pain.humiliation.java.internetGetto.Calllka.task16.model;

import javax.persistence.*;

import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity(name = "Users")
public class User {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = IDENTITY)
    private int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Surname")
    private String surname;

    @Column(name = "Age")
    private int age;

    @OneToMany(fetch = FetchType.EAGER)
    private Set<Work> workID;

    @OneToMany(fetch = FetchType.EAGER)
    private Set<Interests> interestsId;

    @OneToMany(fetch = FetchType.EAGER)
    private Set<SocialNetwork> socialNetworkId;

    @OneToOne(fetch = FetchType.EAGER)
    private UserCredentials userCredentialsId;

    public User() {
    }

    public User(String name, String surname, int age, Set<Work> workID, Set<Interests> interestsId, Set<SocialNetwork> socialNetworkId, UserCredentials userCredentialsId) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.workID = workID;
        this.interestsId = interestsId;
        this.socialNetworkId = socialNetworkId;
        this.userCredentialsId = userCredentialsId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                "id=" + id +
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
