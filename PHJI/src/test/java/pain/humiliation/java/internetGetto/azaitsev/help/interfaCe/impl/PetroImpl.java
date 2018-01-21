package pain.humiliation.java.internetGetto.azaitsev.help.interfaCe.impl;

import pain.humiliation.java.internetGetto.azaitsev.help.interfaCe.IInterface;
import pain.humiliation.java.internetGetto.azaitsev.help.interfaCe.IInterfaceAbstract;

public class PetroImpl extends IInterfaceAbstract implements IInterface {

    @Override
    public String getName() {
        return "Petro";
    }

    @Override
    public String getSurname() {
        return "Kozak";
    }

    @Override
    public int getAge() {
        return 22;
    }

    @Override
    public String getFullData() {
        return "Default get full data";
    }
}
