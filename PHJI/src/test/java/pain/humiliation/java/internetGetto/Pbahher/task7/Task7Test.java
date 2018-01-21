package pain.humiliation.java.internetGetto.Pbahher.task7;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
//todo 39 tests != 50 tests
import static org.junit.Assert.*;

/**
 * Created by pbahher on 1/21/18.
 */
public class Task7Test {

    public static ArrayList<String> collection = new ArrayList<String>();
    public static ArrayList<String> collection2 = new ArrayList<String>();

    @Before
    public void beforeTest() {
        Collections.addAll(collection, "a", "b", "c", "d", "e", "f");
        Collections.addAll(collection2, "a", "b", "c", "d");

        System.out.print("Well done!");
    }

    @After
    public void afterTest() {
        collection.clear();
        collection2.clear();
        //todo clear second collection
    }

    @Test
    public void addTest() {
        //todo use your own add method, not Collections util add
        assertEquals(6, collection.size());
    }

    @Test
    public void getTest2() {
        assertEquals("a", collection.get(0));
        assertEquals("b", collection.get(1));
    }

    @Test
    public void addAllTest1() {
        collection.addAll(collection2);
        assertEquals(10, collection.size());
    }

    @Test
    public void addAllTest2() {
        collection.add("sss");
        collection.addAll(collection2);
        //todo add extra line
        assertEquals(11, collection.size());
    }

    @Test
    public void addAllTest3() {
        collection.add("sss");
        collection.addAll(collection2);
        //todo add extra line
        assertEquals(true, collection.contains("d"));  //todo you have "d" element in first collection
    }

    @Test
    public void containsTest() {
        collection.add("sss");
        assertEquals(true, collection.contains("sss"));
    }

    @Test
    public void containsAllTest() {
        assertEquals(true, collection.containsAll(collection2));
    }

    @Test
    public void clearTest() {
        collection.add("sss");  //todo remove it
        collection.clear();
        //todo remove extra line
        assertEquals(0, collection.size());
    }

    @Test
    public void clearTest2() {
        collection.clear();
        assertTrue(collection.size() == 0);
    }

    @Test
    public void retainAllTest() {
        collection.add("sss");
        //todo remove extra line
        assertFalse(collection.retainAll(collection));  //todo change this to collection2 as compare parameter
    }

    @Test
    public void retainAllTest2() {
        assertTrue(collection.retainAll(collection2));
    }

    @Test
    public void subListTest() {
        assertEquals(collection2, collection.subList(0, 4));
    }

    @Test
    public void subListTest2() {
        collection.addAll(collection2.subList(0, 4));
        assertTrue(collection.containsAll(collection2.subList(0, 4)));
    }

    @Test
    public void subListSizeTest() {
        ArrayList<Object> subListArray = new ArrayList<Object>();  //todo use you own collection
        subListArray.add(collection.subList(2, 3));

        assertEquals(1, subListArray.size());
    }

    @Test
    public void lastIndexOfTest() {
        int index = collection.lastIndexOf("b");  //todo add another "b" element to collection, remove "index" variable
        //todo remove extra line
        assertEquals(1, index);
    }

    @Test
    public void cloneTest() {
        assertEquals(collection, collection.clone());
    }

    @Test
    public void cloneTest2() {
        collection = (ArrayList<String>) collection2.clone();
        assertEquals(collection.size(), collection2.size());
    }

    @Test
    public void setTest() {
        collection.set(1, "a");
        collection.set(0, "b");

        assertEquals("a", collection.get(1));
        assertEquals("b", collection.get(0));
    }

    @Test
    public void sizeTest() {
        assertEquals(6, collection.size());
    }

    @Test
    public void sizeTest2() {
        assertEquals(4, collection2.size());   //todo do not test second collection
    }

    @Test
    public void removeTest() {
        assertEquals("c", collection.remove(2));
        assertEquals(5, collection.size());
    }

    @Test
    public void removeTest2() { //strange that object-removing is boolean,while index-removing isn't.  //todo say thanks to Petya !!!
        assertTrue(collection.remove("c"));
    }

    @Test
    public void removeObjTest() {
        assertEquals(true, collection.remove("c"));
        assertEquals(5, collection.size());
    }

    @Test
    public void retainAllSize() {
        collection.retainAll(collection2);
        //todo remove extra line
        assertEquals(4, collection.size());
    }

    @Test
    public void testRemoveIndexGet() {
        collection.remove(1);
        //todo remove extra line
        assertFalse("b".equals(collection.get(1)));
    }

    @Test
    public void removeAllTest() {
        assertEquals(true, collection.removeAll(collection2));
        assertEquals(2, collection.size());
    }

    @Test
    public void removeAllTest2() {
        collection.addAll(collection2);
        assertTrue(collection.removeAll(collection2));  //todo check if this deletion is cyclical
    }

    @Test
    public void ensureCapaTest() {
        collection.ensureCapacity(0);  //todo you can not test this
    }

    @Test
    public void isEmptyTest() {
        assertFalse(collection.isEmpty());
    }

    @Test
    public void notNullTest() {
        assertNotNull(collection.get(1));
    }

    @Test
    public void contTest() {
        assertTrue(collection.contains("a"));
    }

    @Test
    public void falseElement() {
        assertFalse("y".equals(collection.get(3)));
    }

    @Test
    public void sizeAddTest() {
        collection.add("y");
        assertTrue(7 == collection.size());
    }

    @Test
    public void contStringTest() {
        assertTrue(collection.contains("a"));
    }

    @Test
    public void toArrayTest() {
        String[] elements = collection.toArray(new String[collection.size()]);

        for (int i = 0; i < elements.length; i++) {
            //todo write code here :)
        }

        assertEquals(6, elements.length);
    }

    @Test
    public void indexOfTest() {
        assertEquals(2, collection.indexOf("c"));
    }

    @Test
    public void ensureCapacityTest() {
        collection2.ensureCapacity(2);  //todo not useful here, or write correct comments
        //todo remove extra line
        assertEquals(4, collection2.size());
    }

    @Test
    public void iteratorTest() {
        Iterator<String> iterator = collection.iterator();

        assertEquals("a", iterator.next());
        assertEquals("b", iterator.next());
        assertEquals("c", iterator.next());
    }
}
