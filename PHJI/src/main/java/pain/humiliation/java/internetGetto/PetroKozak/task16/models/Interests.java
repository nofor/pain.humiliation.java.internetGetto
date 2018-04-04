package pain.humiliation.java.internetGetto.PetroKozak.task16.models;

import javax.persistence.*;

@Entity(name = "Interests")
public class Interests {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    int id;

    @Column(name = "Interests_Name")
    private String interestsName;

    @Column(name = "Interests_Period")
    private String interestsPeriod;

    @ManyToOne
    private User user;

    public Interests(String interestsName, String interestsPeriod, User user) {
        this.interestsName = interestsName;
        this.interestsPeriod = interestsPeriod;
        this.user = user;
    }

    public Interests() {
    }

    public String getInterestsName() {
        return interestsName;
    }

    public void setInterestsName(String interestsName) {
        this.interestsName = interestsName;
    }

    public String getInterestsPeriod() {
        return interestsPeriod;
    }

    public void setInterestsPeriod(String interestsPeriod) {
        this.interestsPeriod = interestsPeriod;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Interests{" +
                "id=" + id +
                ", interestsName='" + interestsName + '\'' +
                ", interestsPeriod='" + interestsPeriod + '\'' +
                ", user=" + user +
                '}';
    }
}
