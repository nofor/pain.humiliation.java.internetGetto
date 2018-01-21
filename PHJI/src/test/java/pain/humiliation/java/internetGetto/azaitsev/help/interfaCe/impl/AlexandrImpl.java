package pain.humiliation.java.internetGetto.azaitsev.help.interfaCe.impl;

import pain.humiliation.java.internetGetto.azaitsev.help.interfaCe.IInterface;
import pain.humiliation.java.internetGetto.azaitsev.help.interfaCe.IInterfaceAbstract;

public class AlexandrImpl extends IInterfaceAbstract implements IInterface {

    @Override
    public String getName() {
        return "Alexander";
    }

    @Override
    public String getSurname() {
        return "Novikov";
    }

    @Override
    public int getAge() {
        return 25;
    }
}
