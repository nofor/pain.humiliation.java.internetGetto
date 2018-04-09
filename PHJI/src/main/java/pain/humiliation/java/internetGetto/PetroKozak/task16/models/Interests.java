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

    public Interests(String interestsName, String interestsPeriod) {
        this.interestsName = interestsName;
        this.interestsPeriod = interestsPeriod;
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

    @Override
    public String toString() {
        return "Interests{" +
                "id=" + id +
                ", interestsName='" + interestsName + '\'' +
                ", interestsPeriod='" + interestsPeriod + '\'' +
                '}';
    }
}
