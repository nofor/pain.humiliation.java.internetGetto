package pain.humiliation.java.internetGetto.PetroKozak.task16.models;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Surname")
    private String surname;

    @Column(name = "age")
    private int age;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Work> work;

    @OneToMany(fetch = FetchType.EAGER)
    private Set<Interests> interests;

    @OneToMany(fetch = FetchType.EAGER)
    private Set<SocialNetwork> socialNetworks;

    @OneToOne(fetch = FetchType.EAGER)
    private  UserCredentials userCredentials;

    public User(String name, String surname, int age, List<Work> work, Set<Interests> interests, Set<SocialNetwork> socialNetworks, UserCredentials userCredentials) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.work = work;
        this.interests = interests;
        this.socialNetworks = socialNetworks;
        this.userCredentials = userCredentials;
    }

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
