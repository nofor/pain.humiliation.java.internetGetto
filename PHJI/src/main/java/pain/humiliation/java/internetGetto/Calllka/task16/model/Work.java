package pain.humiliation.java.internetGetto.Calllka.task16.model;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity(name = "Work")
public class Work {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = IDENTITY)
    private int id;

    @Column(name = "Company_Name")
    private String companyName;

    @Column(name = "Position")
    private String position;

    @Column(name = "Salary")
    private String salary;

    @ManyToOne
    private User user;

    public Work() {
    }

    public Work(String companyName, String position, String salary, User user) {
        this.companyName = companyName;
        this.position = position;
        this.salary = salary;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Work{" +
                "id=" + id +
                ", companyName=" + companyName +
                ", position=" + position +
                ", salary=" + salary +
                ", user=" + user +
                '}';
    }
}
