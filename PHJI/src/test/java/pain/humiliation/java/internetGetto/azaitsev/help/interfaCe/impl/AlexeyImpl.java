package pain.humiliation.java.internetGetto.azaitsev.help.interfaCe.impl;

import pain.humiliation.java.internetGetto.azaitsev.help.interfaCe.IInterface;
import pain.humiliation.java.internetGetto.azaitsev.help.interfaCe.IInterfaceAbstract;

public class AlexeyImpl  extends IInterfaceAbstract implements IInterface {

    @Override
    public String getName() {
        return "Alexey";
    }

    @Override
    public String getSurname() {
        return "Sugak";
    }

    @Override
    public int getAge() {
        return 25;
    }
}
