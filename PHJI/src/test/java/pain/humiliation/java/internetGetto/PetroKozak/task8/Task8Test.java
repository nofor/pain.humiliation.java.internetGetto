package pain.humiliation.java.internetGetto.PetroKozak.task8;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Task8Test {

    private MyCollection<Object> list = new MyCollection<>();
    private MyCollection<Object> list2 = new MyCollection<>();
    private ArrayList<Object> arrayList = new ArrayList<>();

    @Before
    public void initialize() {
        Collections.addAll(list, "Work", "hard", "play", "hard");
        Collections.addAll(list2, "Eat", "hard", "sleep", "hard");
        Collections.addAll(arrayList, "Work", "hard,", "play", "hard");
    }

    @Test
    public void testAddAll() {
        list.addAll(list2);
        assertTrue(list.containsAll(list2));
        System.out.println(list);
    }

    @Test
    public void testAddAll2() {
        list.addAll(list2);
        assertTrue(list.get(4).equals(list2.get(0)));
    }

    @Test
    public void testAddAll3() {
        int a = list.size();
        int b = list2.size();

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
    public void testClone() throws CloneNotSupportedException {
        list.clear();
        list = (MyCollection<Object>) list2.clone();
        assertEquals(list, list2);
    }

    @Test
    public void testClone2() throws CloneNotSupportedException {
        list = (MyCollection<Object>) list2.clone();
        assertEquals(list, list2);
    }

    @Test
    public void testClone3() throws CloneNotSupportedException {
        Object prove = list.get(0);
        list = (MyCollection<Object>) list2.clone();
        assertFalse(list.contains(prove));
    }

    @Test
    public void testClone4() throws CloneNotSupportedException {
        list = (MyCollection<Object>) list2.clone();
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
    public void testSetValue() throws CloneNotSupportedException {
        MyCollection <Object> testList = (MyCollection<Object>) list.clone();
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
        Object a = list.get(2);

        list.remove(2);
        assertTrue(a!=(list.get(2)));
    }

    @Test
    public void testRemove2() {
        arrayList.clear();
        arrayList.add("hard");

        list.removeAll(arrayList);
        assertFalse(list.contains("hard"));
    }

    @Test
    public void testRemove3() { //strange that object-removing is boolean,while index-removing isn't.
        assertTrue(list.remove("hard"));
    }

    @Test
    public void testIfElementsGoLeftAfterDeletion() {
        Object a = list.get(3);

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
        ListIterator<Object> iter = list.listIterator();
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
        arrayList.clear();

        arrayList.add("hard");
        arrayList.add("hard");

        assertTrue(list.containsAll(arrayList));
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

        for (Object i : list) {
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

    @Test
    public void testSpeed(){
        System.out.println("Adding time for 100 elements MyCollection: " + testTimeAddList(100));
        System.out.println("Adding time for 100 elements ArrayList: "  +testTimeAddLinkedList(100));
        System.out.println("Deletion time for 100 elements MyCollection: " + testTimeDeleteList(100));
        System.out.println("Deletion time for 100 elements ArrayList: "  +testTimeDeleteLinkedList(100));
        System.out.println("Searching  time for 100 elements MyCollection: " + testTimeGetArrayList(100));
        System.out.println("Searching time for 100 elements ArrayList: "  +testTimeGetLinkedList(100));
    }
    public long testTimeAddList(long size) {
        long startTimeArrayList = System.currentTimeMillis();

        for (int i = 0; i <= size; i++) {
            list.add( i,"element");
        }
        return System.nanoTime() - startTimeArrayList;
    }

    public long testTimeAddLinkedList(long size) {
        long startTimeLinkedList = System.nanoTime();

        for (int i = 0; i <= size; i++) {
            arrayList.add(i, "element");
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
            arrayList.add(i, "element");
        }

        long startTimeLinkedList = System.nanoTime();

        for (int i = 0; i <= size; i++) {
            arrayList.remove(i);
        }

        return System.nanoTime() - startTimeLinkedList;
    }

    public long testTimeGetArrayList(long size) {
        for (int i = 0; i <= size; i++) {
            list.add(i, "element");
        }

        long startTimeLinkedList = System.nanoTime();
        list.get((int) (size/2));

        return System.nanoTime() - startTimeLinkedList;
    }

    public long testTimeGetLinkedList(long size) {
        for (int i = 0; i <= size; i++) {
            arrayList.add(i, "element");
        }

        long startTimeLinkedList = System.nanoTime();
        arrayList.get((int) (size/2));

        return System.nanoTime() - startTimeLinkedList;
    }

    @After
    public void cleanGarbage() {
        list.clear();
        list2.clear();
        arrayList.clear();
    }
}

