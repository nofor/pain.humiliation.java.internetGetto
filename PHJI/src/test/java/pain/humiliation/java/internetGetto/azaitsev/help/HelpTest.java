package pain.humiliation.java.internetGetto.azaitsev.help;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HelpTest {

    private ArrayList arrayList = new ArrayList();

    Help help = new Help();

    @Test
    public void reverseStringTest() {
        System.out.println(help.reverseString("abcabcabcabcabcabcabcabcabcabcabc"));
    }

    @Before
    public void createCollectionElements () {
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("6");
        arrayList.add("7");
    }

    @Test
    public void teasAddElement () {
        arrayList.clear();
        arrayList.add("1");

        assertEquals(2, arrayList.size());
        //assertEquals();
        //assertFalse();
        //assertTrue();
        //assertNotEquals();
    }

    @Test
    public void teasAddElementIndex () {
        arrayList.add(4, "motherfucking");
        //todo remove extra line
        assertEquals("motherfucking", arrayList.get(4));
        //assertEquals();
        //assertFalse();
        //assertTrue();
        //assertNotEquals();
    }

    @After
    public void removeCollectionElements () {
        arrayList.clear();
    }

}
