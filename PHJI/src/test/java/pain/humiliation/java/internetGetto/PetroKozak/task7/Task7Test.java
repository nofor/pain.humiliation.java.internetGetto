package pain.humiliation.java.internetGetto.PetroKozak.task7;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;


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
        assertFalse(list.isEmpty());
    }

    @Test
    public void testIsEmpty2() {
        assertFalse(list.size() == 0);
    }

    @Test
    public void testRemoveAll() {
        list.addAll(list2);
        list.removeAll(list2);

        assertFalse(list.containsAll(list2));
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
        assertFalse(testList.equals(list));
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
    public void testSublist() {  //todo think about value of indexes
        list.addAll(list2.subList(2, 4));
        assertTrue(list.containsAll(list2.subList(2, 4)));
    }

    @Test
    public void testIndexOf() { //WTF???  //todo remove it
        assertEquals(1, list.indexOf("hard"));
    }

    @Test
    public void testLastIndexOf() { //WTF???  //todo remove it
        assertEquals(3, list.lastIndexOf("hard"));
    }

    @Test
    public void testRemove() {
        String a = list.get(2);

        list.remove(2);
        assertTrue(a!=(list.get(2)));
    }

    @Test
    public void testRemove2() {
        list.removeAll(Collections.singleton("hard"));
        assertFalse(list.contains("hard"));
    }

    @Test
    public void testRemove3() { //strange that object-removing is boolean,while index-removing isn't.
        assertTrue(list.remove("hard"));
    }

    @Test
    public void testIfElementsGoLeftAfterDeletion() {
        String a = list.get(3);

        list.remove(2);
        assertEquals(a, list.get(2));
    }

    @Test
    public void testIfAddedElementGoesInTheEndOfArray() {
        list.add("added");
        assertTrue(list.indexOf("added") == list.size() - 1);
    }

    @Test
    public void testIfSizeIsChangingAfterAdding() {
        int a = list.size();
        list.add("added");

        assertTrue(list.size() > a);
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


        assertTrue(a > list.size());
    }

    @Test
    public void deleteWithIterator4() {
        ListIterator<String> iter = list.listIterator();

        while (iter.hasNext()) {

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

        testIfThereAreEqualElements("add1");

    }

    @Test
    public void testAddingWithIterator2() {
        ListIterator<String> iter = list.listIterator();
        int a = list.size();

        while (iter.hasNext()) {
            iter.next();
            iter.add("add1");
        }

        int count = testIfThereAreEqualElements("add1");

        assertTrue(list.size() - a == count);
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
        list.clear();

        System.out.print("Write list size that you want to check:");

        Scanner scan = new Scanner(System.in);
        long size = scan.nextLong();

        long spentTimeArrayList = testTimeAddList(size);
        long spentTimeLinkedList = testTimeAddLinkedList(size);

        System.out.println("Arraylist did add in " + spentTimeArrayList + " millisecs" +
                "\nLinkedlist did add in " + spentTimeLinkedList + " millisecs");

    }

    @Test
    public void testTimeOfDeletion() {
        list.clear();

        System.out.print("Write list size that you want to check:");

        Scanner scan = new Scanner(System.in);
        long size = scan.nextLong();

        long spentTimeArrayList = testTimeDeleteList(size);
        long spentTimeLinkedList = testTimeDeleteLinkedList(size);

        System.out.println("Arraylist did remove in " + spentTimeArrayList + " millisecs" +
                "\nLinkedlist did remove in " + spentTimeLinkedList + " millisecs");

    }

    @Test
    public void testTimeOfSearch() {
        list.clear();

        System.out.print("Write list size that you want to check:");

        Scanner scan = new Scanner(System.in);
        long size = scan.nextLong();

        long spentTimeArrayList = testTimeGetArrayList(size);
        long spentTimeLinkedList = testTimeGetLinkedArrayList(size);

        System.out.println("Arraylist did remove in " + spentTimeArrayList + " millisecs" +
                "\nLinkedlist did remove in " + spentTimeLinkedList + " millisecs");

    }

    @Test
    public void testToArray() {
        Object[] a = list.toArray();

        for (int i = 0; i < list.size(); i++) {
            assertEquals(a[i], list.get(i));
        }
    }

    @Test
    public void checkIfTheresNull() {  
        list.add(null);
        int count = 0;

        for (String i : list) {
            if (i == null) {
                count++;
            }
        }
        assertTrue(count > 0);
    }

    public int testIfThereAreEqualElements(String x) {
        ListIterator<String> iter = list.listIterator();
        int count = 0;

        while (iter.hasNext()) {
            if (iter.next().equals(x))
                count++;
        }

        return count;
    }

    public long testTimeAddList(long size) {
        long startTimeArrayList = System.currentTimeMillis();

        for (int i = 0; i <= size; i++) {
            list.add(i, "element");
        }
        return System.nanoTime() - startTimeArrayList;
    }

    public long testTimeAddLinkedList(long size) {
        long startTimeLinkedList = System.nanoTime();

        for (int i = 0; i <= size; i++) {
            linkedlist.add(i, "element");
        }

        return System.nanoTime() - startTimeLinkedList;
    }

    public long testTimeDeleteList(long size) {
        for (int i = 0; i <= size; i++) {
            list.add(i, "element");
        }

        long startTimeArrayList = System.currentTimeMillis();

        for (int i = 0; i <= size; i++) {
            list.remove(i);
        }
        return System.nanoTime() - startTimeArrayList;
    }

    public long testTimeDeleteLinkedList(long size) {
        for (int i = 0; i <= size; i++) {
            linkedlist.add(i, "element");
        }

        long startTimeLinkedList = System.nanoTime();

        for (int i = 0; i <= size; i++) {
            linkedlist.remove(i);
        }

        return System.nanoTime() - startTimeLinkedList;
    }

    public long testTimeGetArrayList(long size) {
        for (int i = 0; i <= size; i++) {
            list.add(i, "element");
        }

        long startTimeLinkedList = System.nanoTime();
        list.get(3);

        return System.nanoTime() - startTimeLinkedList;
    }

    public long testTimeGetLinkedArrayList(long size) {
        for (int i = 0; i <= size; i++) {
            linkedlist.add(i, "element");
        }

        long startTimeLinkedList = System.nanoTime();
        linkedlist.get(3);

        return System.nanoTime() - startTimeLinkedList;
    }

    @After
    public void cleanGarbage() {
        list.clear();
        list2.clear();
        linkedlist.clear();
    }

}