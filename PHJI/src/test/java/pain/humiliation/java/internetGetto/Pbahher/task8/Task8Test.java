package pain.humiliation.java.internetGetto.Pbahher.task8;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by pbahher on 2/4/18.
 */
public class Task8Test {

    MyArray<Object> collection = new MyArray<>();
    MyArray<Object> collection2 = new MyArray<>();


    @Before
    public void beforeTest() {
        Collections.addAll(collection, "first", "second", "three", "four", "four", "five", "six");
        Collections.addAll(collection2, "1", "2", "3", "4");
    }

    @After
    public void afterTest() {
        collection.clear();
        collection2.clear();
    }

    @Test
    public void testSize() {
        System.out.println(collection.size());
    }

    @Test
    public void testIsEmpty() {
        System.out.println(collection.isEmpty());
    }

    @Test
    public void testContains() {
        System.out.println(collection.contains("first"));
    }

    @Test
    public void testIterator() {
        Iterator<Object> it = collection.iterator();

        it.next();
        it.remove();

        while (it.hasNext()) {
            System.out.println(it.next()+ " ");
        }
    }

    @Test
    public void testToArray() {
        Object[] toto = collection.toArray();

        for (Object to : toto) {
            System.out.println(to + " ");
        }
    }

    /*@Test
    public void testToArrayT() {

    }*/

    @Test
    public void testAdd() {
        collection.add(3,"seven");
        System.out.println(collection);
    }

    @Test
    public void testRemove() {
        collection.remove("tree");
        System.out.println(collection);
    }

    @Test
    public void testContainsAll() {
        System.out.println(collection.containsAll(collection2));

    }

    /*@Test
    public void testAddAll() {

    }*/

    /*@Test
    public void AddAllIndx() {

    }*/

    /*@Test
    public  void testRemoveAll() {

    }*/

    @Test
    public void testRetainAll() {
        collection.retainAll(collection2);
        System.out.println(collection);
    }

    @Test
    public void testClear() {
        collection.clear();
        System.out.println(collection.size());
    }

    @Test
    public void testGet() {
        System.out.println(collection.get(2));
    }

    @Test
    public void testSet() {
        System.out.println(collection.set(1, "new"));

    }

    /*@Test
    public void testAddIndx() {

    }*/

    @Test
    public void testRemoveIndx() {
        collection.remove(2);
        System.out.println(collection);
    }

    @Test
    public void testIndexOff() {
        System.out.println(collection.indexOf("four"));

    }

    @Test
    public void testLastIndexOff() {
        System.out.println(collection.lastIndexOf("four"));
    }

    /*@Test
    public void testListIterator() {

    }*/

    /*@Test
    public void testListIteratorIndx() {

    }*/

    /*@Test
    public void testSubList() {

    }*/
}
