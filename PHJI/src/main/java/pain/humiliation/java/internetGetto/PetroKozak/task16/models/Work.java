package pain.humiliation.java.internetGetto.PetroKozak.task16.models;

import javax.persistence.*;

@Entity
@Table(name = "Work")
public class Work {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    int id;

    @Column(name = "Company name")
    private String companyName;

    @Column(name = "Position")
    private String position;

    @Column(name = "Salary")
    private int salary;

    public Work(String companyName, String position, int salary) {
        this.companyName = companyName;
        this.position = position;
        this.salary = salary;
    }

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
