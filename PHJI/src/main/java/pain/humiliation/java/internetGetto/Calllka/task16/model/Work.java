package pain.humiliation.java.internetGetto.Calllka.task16.model;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Model of Work it is a POJO for working with database.
 * In the other word, the class describing structure of the table.
 * The data will be saved in table is: company name, position and salary.
 * (name of table indicates in annotation '@Entity')
 *
 * @author calllka
 * @version 1.0
 * @since 4.4.2018
 */
@Entity(name = "Work")
public class Work {

    /**
     * Identity number of interests
     */
    @Id
    @Column(name = "Work_Id")
    @GeneratedValue(strategy = IDENTITY)
    private int workId;

    /**
     * Company name, where user works
     */
    @Column(name = "Company_Name")
    private String companyName;

    /**
     * Position held
     */
    @Column(name = "Position")
    private String position;

    /**
     * User salary on company
     */
    @Column(name = "Salary")
    private String salary;

    /**
     * Default constructor displays full data from table Work
     * (w\o this constructor you can't output full data)
     */
    public Work() {
    }

    /**
     * Constructor with parameter that used to save information
     * about {@link companyName}, {@link position} and {@link salary}
     *
     * @param companyName {@link companyName}
     * @param position    {@link position}
     * @param salary      {@link salary}
     */
    public Work(String companyName, String position, String salary) {
        this.companyName = companyName;
        this.position = position;
        this.salary = salary;
    }

    public int getWorkId() {
        return workId;
    }

    public void setWorkId(int workId) {
        this.workId = workId;
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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Work{" +
                "workId=" + workId +
                ", companyName=" + companyName +
                ", position=" + position +
                ", salary=" + salary +
                '}';
    }
}
