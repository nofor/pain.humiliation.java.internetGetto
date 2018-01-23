package pain.humiliation.java.internetGetto.Pbahher.task8;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import pain.humiliation.java.internetGetto.Pbahher.task8.MyArray;

/**
 * Created by pbahher on 1/23/18.
 */
public class Task8Test {

    static MyArray task8 = new MyArray();

    public static ArrayList<String> values = new ArrayList<String>();

    @Before
    public void beforeTest() {
        Collections.addAll(values, "a", "b", "c", "d", "e", "f");
    }

    @After
    public void afterTest() {
        values.clear();
    }

    @Test
    public void size() { task8.size();}
}