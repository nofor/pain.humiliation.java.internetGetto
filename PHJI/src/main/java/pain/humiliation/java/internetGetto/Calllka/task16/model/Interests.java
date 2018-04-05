package pain.humiliation.java.internetGetto.Calllka.task16.model;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;
import static javax.persistence.GenerationType.IDENTITY;
import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name = "Interests")
public class Interests {

    @Id
    @Column(name = "Interests_Id")
    @GeneratedValue(strategy = IDENTITY)
    private int interestsId;

    @Column(name = "Interests_Name")
    private String interestsName;

    @Column(name = "Interests_Period")
    private String interestsPeriod;

    public Interests() {
    }

    public Interests(String interestsName, String interestsPeriod) {
        this.interestsName = interestsName;
        this.interestsPeriod = interestsPeriod;
    }

    public int getInterestsId() {
        return interestsId;
    }

    public void setInterestsId(int interestsId) {
        this.interestsId = interestsId;
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
                "interestsId=" + interestsId +
                ", interestsName='" + interestsName + '\'' +
                ", interestsPeriod='" + interestsPeriod + '\'' +
                '}';
    }
}
