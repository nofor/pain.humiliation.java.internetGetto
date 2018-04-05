package pain.humiliation.java.internetGetto.Calllka.task16.model;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity(name = "Work")
public class Work {

    @Id
    @Column(name = "Work_Id")
    @GeneratedValue(strategy = IDENTITY)
    private int workId;

    @Column(name = "Company_Name")
    private String companyName;

    @Column(name = "Position")
    private String position;

    @Column(name = "Salary")
    private String salary;

    public Work() {
    }

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
