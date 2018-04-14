package pain.humiliation.java.internetGetto.PetroKozak.task16.models;

import javax.persistence.*;

/**
 * The following class is a model of a table "Work" which will be created as a result of the hole program working
 * @author Petro Kozak
 */
@Entity(name = "Work")
public class Work {

    /**
     * Field "Id" with Generation Type Identity will be used for id-generation by the created table
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    int id;

    /**
     * This String field stands for the name of the users working place,
     * is also signed as a separated column
     */
    @Column(name = "Company_Name")
    private String companyName;

    /**
     * This String field stands for the users position in his working place,
     * is also signed as a separated column
     */
    @Column(name = "Position")
    private String position;

    /**
     * This int  field stands for users salary, or some other regular income that user has while working
     * is also signed as a separated column
     */
    @Column(name = "Salary")
    private int salary;

    /**
     * This is class constructor specifying all the fields of Class except id to create the class instance
     *
     * @param companyName
     * @param position
     * @param salary
     */
    public Work(String companyName, String position, int salary) {
        this.companyName = companyName;
        this.position = position;
        this.salary = salary;
    }

    /**
     * Default constructor
     */
    public Work() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Work{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
