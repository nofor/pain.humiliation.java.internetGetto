package pain.humiliation.java.internetGetto.PetroKozak.task8;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class Task8Test {

    MyCollection<Object> myCollection = new MyCollection();
    MyCollection<Object> helpColl = new MyCollection();

    @Before
    public void initializer() {
        myCollection.add("element to remove");
        myCollection.add("bbb");
        myCollection.add("ccc");
        myCollection.add("dddd");


        helpColl.add("1");
        helpColl.add("2");
        helpColl.add("3");
        helpColl.add("bbb");
        helpColl.add("ccc");
    }

    @Test
    public void testSize() {
        System.out.println(myCollection.size());
        System.out.println(helpColl.size());
    }

    @Test
    public void testIsEmpty() {
        System.out.println(myCollection.isEmpty());
    }

    @Test
    public void testSet() {

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.print(myCollection.get(i) + " ");
        }

        System.out.println("\nAfter setting");
        System.out.println(myCollection.set(1, "added"));

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.print(myCollection.get(i) + " ");
        }
    }

    @Test
    public void testGet() {
        System.out.println(myCollection.get(3));
    }

    @Test
    public void testRemove() {
        myCollection.remove("element to remove");

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.print(myCollection.get(i) + " ");
        }
    }

    @Test
    public void testAddAll() {
        ArrayList<Object> list = new ArrayList<>();

        Collections.addAll(list, "1", "2", "3", "4", "5");
        myCollection.addAll(list);

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.print(myCollection.get(i) + " ");
        }
    }

    @Test
    public void testClear() {
        myCollection.clear();
        System.out.println(myCollection.size());
    }

    @Test
    public void testRemoveByIndex() {
        System.out.println(myCollection.remove(0));

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.print(myCollection.get(i) + " ");
        }
    }

    @Test
    public void testAddToIndex() {
        myCollection.add(2, "addedElement");

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.print(myCollection.get(i) + " ");
        }

    }

    @Test
    public void testIndexOf() {
        System.out.println(myCollection.indexOf("ccc"));
    }

    @Test
    public void testLastIndexOf() {
        myCollection.add("bbb");
        System.out.println(myCollection.lastIndexOf("bbb"));
    }

    @Test
    public void testRetainAll() {
        myCollection.retainAll(helpColl);

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.print(myCollection.get(i) + " ");
        }
    }

    @Test
    public void testContains() {
        System.out.println(myCollection.contains("bbb"));
    }

    @Test
    public void testContainsAll() {
        System.out.println(myCollection.containsAll(helpColl));
    }

    @Test
    public void testSublist() {
        System.out.println(myCollection.subList(1, 3));
    }

    @Test
    public void testRemoveAll() {
        myCollection.removeAll(helpColl);

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.print(myCollection.get(i) + " ");
        }
    }

    @Test
    public void testAddAllToIndex() {
        myCollection.addAll(3, helpColl);

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.print(myCollection.get(i) + " ");
        }
    }

    @Test
    public void testToArray() {
        Object[] test = myCollection.toArray();

        for (Object x : test) {
            System.out.println(x);
        }
    }
}
