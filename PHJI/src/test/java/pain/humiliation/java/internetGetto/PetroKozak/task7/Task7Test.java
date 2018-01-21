package pain.humiliation.java.internetGetto.PetroKozak.task7;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

import static org.junit.Assert.*;

public class Task7Test {

    private ArrayList<String> list = new ArrayList<>();
    private ArrayList<String> list2 = new ArrayList<>();
    private LinkedList<String> linkedlist = new LinkedList<>();

    @Before
    public void initialize() {
        Collections.addAll(list, "Work", "hard", "play", "hard");
        Collections.addAll(list2, "Eat", "hard", "sleep", "hard");
        Collections.addAll(linkedlist, "Work", "hard,", "play", "hard");
    }

    @Test
    public void testAddAll() {
        list.addAll(list2);
        assertTrue(list.containsAll(list2));
    }

    @Test
    public void testAddAll2() {
        list.addAll(list2);
        assertTrue(list.get(4).equals(list2.get(0)));
    }

    @Test
    public void testAddAll3() {
        int a = list.size();
        int b = list.size();

        list.addAll(list2);

        int c = list.size();

        assertTrue(a + b == c);

    }

    @Test
    public void testAdd() {
        assertTrue(list.add("fghj"));
    }

    @Test
    public void testAddingNull() {
        assertTrue(list.add(null));
    }

    @Test
    public void testAddAllToIndex() {
        list.addAll(0, list2);
        assertTrue(list.get(0).equals(list2.get(0)));
    }

    @Test
    public void testAddingToIndex() {
        list.add(3, "and");
        assertEquals("and", list.get(3));
    }

    @Test
    public void testAddingToIndex2() {
        list.add(3, "and");
        assertEquals(list.indexOf("and"), 3);
    }

    @Test
    public void testClear() {
        list.clear();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testClear2() {
        list.clear();
        assertTrue(list.size() == 0);
    }

    @Test
    public void testClone() {
        list.clear();
        list = (ArrayList<String>) list2.clone();
        assertEquals(list, list2);
    }

    @Test
    public void testClone2() {
        list = (ArrayList<String>) list2.clone();
        assertEquals(list, list2);
    }

    @Test
    public void testClone3() {
        String prove = list.get(0);
        list = (ArrayList<String>) list2.clone();
        assertFalse(list.contains(prove));
    }

    @Test
    public void testClone4() {
        list = (ArrayList<String>) list2.clone();
        assertEquals(list.size(), list2.size());
    }

    @Test
    public void proveContains() {
        assertTrue("Collection does not contain this element", list.contains("Work"));
    }

    @Test
    public void proveContains2() {
        assertTrue("Collection does not contain this element", list.contains(list.get(3)));
    }

    @Test
    public void testGettingElement() {
        assertEquals("Work", list.get(0));
    }

    @Test
    public void testIsEmpty() {
        assertTrue("Collection is not empty", list.isEmpty());
    }

    @Test
    public void testIsEmpty2() {
        assertTrue("Collection is not empty", list.size() == 0);
    }

    @Test
    public void testRemoveAll() {
        list.addAll(list2);
        list.removeAll(list2);
        assertTrue("Collection does not contain the required Object", list.containsAll(list2));
    }

    @Test
    public void testRemoveAll2() {
        list.addAll(list2);
        assertTrue(list.removeAll(list2));
    }

    @Test
    public void testSetValue() {
        ArrayList<String> testList = (ArrayList<String>) list.clone();
        list.set(3, "blablabla");
        assertEquals("Collections are not equal, which means that new element was added", testList, list);
    }

    @Test
    public void testSetValue2() {
        list.set(3, "blablabla");
        assertTrue("Collection does not contain this element", list.contains("blablabla"));
    }

    @Test
    public void testSetValueOnIndex() {
        list.set(3, "blablabla");
        assertEquals("index is wrong", 3, list.indexOf("blablabla"));
    }

    @Test
    public void testSublist() {
        list.addAll(list2.subList(2, 4));
        assertTrue(list.containsAll(list2.subList(2, 4)));
    }

    @Test
    public void testIndexOf() { //WTF???
        assertEquals(1, list.indexOf("hard"));
    }

    @Test
    public void testLastIndexOf() { //WTF???
        assertEquals(3, list.lastIndexOf("hard"));
    }

    @Test
    public void testRemove() {
        String a = list.get(2);
        list.remove(2);
        assertEquals(a, list.get(2));
    }

    @Test
    public void testRemove2() {
        list.remove("hard");
        assertTrue(list.contains("hard"));
    }

    @Test
    public void testRemove3() { //strange that object-removing is boolean,while index-removing isn't.
        assertTrue(list.remove("hard"));
    }

    @Test
    public void testBehaviourAfterRemove() {
        String a = list.get(3);
        list.remove(2);
        assertEquals(a, list.get(2));
    }

    @Test
    public void testBehaviourAfterAdd() {
        list.add("added");
        assertTrue(list.indexOf("added") == list.size() - 1);
    }

    @Test
    public void testBehaviourAfterAdd2() {
        int a = list.size();
        list.add("added");
        int b = list.size();
        assertTrue(b > a);
    }

    @Test
    public void deleteWithIterator() {
        ListIterator<String> iter = list.listIterator();

        while (iter.hasNext()) {
            iter.next();
            iter.remove();
        }
        assertTrue(list.size() == 0);
    }

    @Test
    public void deleteWithIterator2() {
        ListIterator<String> iter = list.listIterator();

        while (iter.hasNext()) {
            iter.next();
            iter.remove();
        }
        assertTrue(list.isEmpty());
    }

    @Test
    public void deleteWithIterator3() {
        ListIterator<String> iter = list.listIterator();
        int a = list.size();
        while (iter.hasNext()) {
            iter.next();
            iter.remove();
        }

        int b = list.size();
        assertTrue(a > b);
    }

    @Test
    public void deleteWithIterator4() {
        ListIterator<String> iter = list.listIterator();

        while (iter.hasNext()) {
            iter.next();

            if (iter.next().equals("hard")) {
                iter.remove();
            }
        }

        assertFalse(list.contains("hard"));
    }

    @Test
    public void testAddingWithIterator() {
        ListIterator<String> iter = list.listIterator();

        while (iter.hasNext()) {
            iter.next();
            iter.add("add1");
        }

        assertTrue(list.contains("add1"));
    }

    @Test
    public void testAddingWithIterator2() {
        ListIterator<String> iter = list.listIterator();
        int a = list.size();

        while (iter.hasNext()) {
            iter.next();
            iter.add("add1");
        }

        int b = list.size();

        assertTrue(b > a);
    }

    @Test
    public void testRetainAll() {
        list.retainAll(list2);
        assertTrue(list.contains("hard"));
    }

    @Test
    public void testRetainAll2() {
        assertTrue(list.retainAll(list2));
    }

    @Test
    public void testRetainAll3() {
        list.retainAll(list2);
        assertTrue(list.size() == 2);
    }

    @Test
    public void testIterator() {
        ListIterator<String> iter = list.listIterator();
        int a = 0;

        while (iter.hasNext()) {
            iter.next();
            a++;
        }

        assertTrue(a == list.size());
    }

    @Test
    public void testTimeOfAddingInside() {
        long startTimeArrayList = System.nanoTime();

        list.add(3, "added element");

        long spentTimeArrayList = System.nanoTime() - startTimeArrayList;

        long startTimeLinkedList = System.nanoTime();

        linkedlist.add(3, "added element");

        long spentTimeLinkedList = System.nanoTime() - startTimeLinkedList;

        System.out.println("Arraylist did add in " + spentTimeArrayList + " millisecs" +
                "\nLinkedlist did add in " + spentTimeLinkedList + " millisecs");

    }

    @Test
    public void testTimeOfDeletion() {
        long startTimeArrayList = System.nanoTime();

        list.remove(3);

        long spentTimeArrayList = System.nanoTime() - startTimeArrayList;

        long startTimeLinkedList = System.nanoTime();

        linkedlist.remove(3);

        long spentTimeLinkedList = System.nanoTime() - startTimeLinkedList;

        System.out.println("Arraylist did remove in " + spentTimeArrayList + " millisecs" +
                "\nLinkedlist did remove in " + spentTimeLinkedList + " millisecs");

    }

    @Test
    public void testTimeOfSearch() {
        long startTimeArrayList = System.nanoTime();

        list.get(3);

        long spentTimeArrayList = System.nanoTime() - startTimeArrayList;

        long startTimeLinkedList = System.nanoTime();

        linkedlist.get(3);

        long spentTimeLinkedList = System.nanoTime() - startTimeLinkedList;

        System.out.println("Arraylist did remove in " + spentTimeArrayList + " millisecs" +
                "\nLinkedlist did remove in " + spentTimeLinkedList + " millisecs");

    }

    @Test
    public void testToArray() {
        Object[] a;
        a = list.toArray();

        for (int i = 0; i < list.size(); i++) {
            assertEquals(a[i], list.get(i));
        }
    }

    @Test
    public void checkIfTheresNull() {
        list.add(null);

        for (String i : list) {
            assertNotNull("There were a Null found", i);
        }
    }

    @Test
    public void testIfThereAreEqualElements() {
        ListIterator<String> iter = list.listIterator();
        int count = 0;

        while (iter.hasNext()) {
            iter.next();
            if (iter.next().equals("hard"))
                count++;
        }

        System.out.println(count);
    }

    @Test
    public void testMethodEquals() {
        assertTrue(list.get(1).equals(list.get(3)));
    }

    @Test
    public void testHashcode() {
        if (list.get(1).hashCode() == list2.get(1).hashCode()) {
            System.out.println("Elements are equal");
        }
    }

    @After
    public void cleanGarbage() {
        list.clear();
    }

}