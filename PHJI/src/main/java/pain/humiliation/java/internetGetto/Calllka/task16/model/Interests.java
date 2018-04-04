package pain.humiliation.java.internetGetto.Calllka.task16.model;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity(name = "Interests")
public class Interests {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = IDENTITY)
    private int id;

    @Column(name = "Interests_Name")
    private String interestsName;

    @Column(name = "Interests_Period")
    private String interestsPeriod;

    @ManyToOne
    private User user;

    public Interests() {
    }

    public Interests(String interestsName, String interestsPeriod, User user) {
        this.interestsName = interestsName;
        this.interestsPeriod = interestsPeriod;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
