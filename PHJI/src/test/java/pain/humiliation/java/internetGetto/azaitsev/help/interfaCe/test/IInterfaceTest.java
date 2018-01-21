package pain.humiliation.java.internetGetto.azaitsev.help.interfaCe.test;

import org.junit.Test;
import pain.humiliation.java.internetGetto.azaitsev.help.interfaCe.IInterface;
import pain.humiliation.java.internetGetto.azaitsev.help.interfaCe.impl.AlexandrImpl;
import pain.humiliation.java.internetGetto.azaitsev.help.interfaCe.impl.AlexeyImpl;
import pain.humiliation.java.internetGetto.azaitsev.help.interfaCe.impl.PetroImpl;

public class IInterfaceTest {

    @Test
    public void useDifferentImplementation () {
        IInterface tempInterface;

        tempInterface = new AlexandrImpl();
        System.out.println("Alexander: " + tempInterface.getSurname() + " " + tempInterface.getAge());

        tempInterface = new AlexeyImpl();
        System.out.println("Alexey: " + tempInterface.getSurname() + " " + tempInterface.getAge());

        tempInterface = new PetroImpl();
        System.out.println("Petro: " + tempInterface.getSurname() + " " + tempInterface.getAge());

        PetroImpl temp = new PetroImpl();
        System.out.println("Full data: " + temp.getFullData());

        AlexandrImpl temp2 = new AlexandrImpl();
        System.out.println("Full data: " + temp2.getFullData());
    }

}
