package pain.humiliation.java.internetGetto.Calllka.task16.model;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;
import static javax.persistence.GenerationType.IDENTITY;
import static javax.persistence.GenerationType.SEQUENCE;

/**
 * Model of Interests it is a POJO for working with database.
 * In the other word, the class describing structure of the table.
 * The data will be saved in table is: interests name and period.
 * (name of table indicates in annotation '@Entity')
 *
 * @author calllka
 * @version 1.0
 * @since 4.4.2018
 */
@Entity(name = "Interests")
public class Interests {

    /**
     * Identity number of interests
     */
    @Id
    @Column(name = "Interests_Id")
    @GeneratedValue(strategy = IDENTITY)
    private int interestsId;

    /**
     * Name of user interests
     */
    @Column(name = "Interests_Name")
    private String interestsName;

    /**
     * Period how long does the user has interests
     */
    @Column(name = "Interests_Period")
    private String interestsPeriod;

    /**
     * Default constructor displays full data from table Interests
     * (w\o this constructor you can't output full data)
     */
    public Interests() {
    }

    /**
     * Constructor with parameter that used to save information
     * about {@link interestsName} and {@link interestsPeriod}
     *
     * @param interestsName   {@link interestsName}
     * @param interestsPeriod {@link interestsPeriod}
     */
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
