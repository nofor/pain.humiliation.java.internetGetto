package pain.humiliation.java.internetGetto.PetroKozak.task16.models;

import javax.persistence.*;

/**
 * The following class is a model of a table "Interests" which will be created as a result of the hole program working
 * @author Petro Kozak
 */
@Entity(name = "Interests")
public class Interests {

    /**
     * Field "Id" with Generation Type Identity will be used for id-generation by the created table
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    int id;

    /**
     * This is String field which stands for the short description of the users interest/hobby
     * is signed as a separated column
     */
    @Column(name = "Interests_Name")
    private String interestsName;

    /**
     * This is String field which stands for the period our user was actively involved by the corresponding interest
     * is signed as a separated column
     */
    @Column(name = "Interests_Period")
    private String interestsPeriod;

    /**
     * This is a class constructor specifying all the fields of Class except id to create the class instance
     *
     * @param interestsName
     * @param interestsPeriod
     */
    public Interests(String interestsName, String interestsPeriod) {
        this.interestsName = interestsName;
        this.interestsPeriod = interestsPeriod;
    }

    /**
     * Default constructor
     */
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
