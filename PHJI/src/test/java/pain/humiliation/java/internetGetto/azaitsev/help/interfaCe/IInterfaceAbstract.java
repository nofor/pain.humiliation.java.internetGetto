package pain.humiliation.java.internetGetto.azaitsev.help.interfaCe;

public abstract class IInterfaceAbstract {

    String getName() {
        return "Default";
    }

    String getSurname() {
        return "Default";
    }

    int getAge() {
        return 100500;
    }

    public String getFullData () {
        return getName() + " " + getSurname() + " " + getAge();
    }

}
