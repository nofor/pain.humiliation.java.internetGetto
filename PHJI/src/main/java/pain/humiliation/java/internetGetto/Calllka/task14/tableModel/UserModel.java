package pain.humiliation.java.internetGetto.Calllka.task14.tableModel;  //todo this must be a daoModel not table model

import javax.persistence.*;

@Entity
@Table(name = "CalllkaTable")
public class UserModel {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "SecondName")
    private String secondName;

    @Column(name = "Age")
    private int age;

    @Column(name = "Sex")
    private String sex;

    public UserModel(String name, String secondName, int age, String sex) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.sex = sex;
    }

    public UserModel() {  //todo dont need create unusable constructor
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
