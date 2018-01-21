package pain.humiliation.java.internetGetto.Calllka.task7;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

import static org.junit.Assert.*;

public class Task7Test {

    private ArrayList<Object> mainArrayList = new ArrayList<Object>();
    private ArrayList<Object> tempArrayList = new ArrayList<Object>();

    @Before
    public void runBeforeTest() {
        Collections.addAll(mainArrayList, "one", "two", "three", "four", "five", "six");
        Collections.addAll(tempArrayList, "seven", "eight", "nine", "one", "three", "five");

        System.out.print("Main ArrayList size: " + mainArrayList.size() + "; " + "Elements: ");
        outputArrayList(mainArrayList);
        System.out.print("Temp ArrayList size: " + tempArrayList.size() + "; " + "Elements: ");
        outputArrayList(tempArrayList);
    }

    @Test
    public void testAddSize() {
        mainArrayList.add("temp");
        assertTrue(7 == mainArrayList.size());
    }

    @Test
    public void testAddElements() {
        mainArrayList.add("temp");
        //todo remove extra line
        assertTrue("temp".equals(mainArrayList.get(mainArrayList.size() - 1)));
    }

    @Test
    public void testElementsFalse() {
        assertFalse("temp".equals(mainArrayList.get(1)));
    }

    @Test
    public void testAddInCollection() {
        mainArrayList.add(0, "temp");
        //todo remove extra line
        assertFalse("one".equals(mainArrayList.get(0)));
    }

    @Test
    public void testAddAll() {
        int mainSize = mainArrayList.size();

        mainArrayList.addAll(tempArrayList);
        //todo remove extra line
        assertFalse(mainSize == mainArrayList.size());
    }

    @Test
    public void testAddAllPosition() {
        mainArrayList.addAll(tempArrayList);
        //todo remove extra line
        assertTrue(8 == mainArrayList.indexOf("nine"));
    }

    @Test
    public void testAddAllElementsInPosition() {
        mainArrayList.addAll(1, tempArrayList);
        //todo remove extra line
        assertNotEquals("Two", mainArrayList.get(1));
        //todo add check on first element of second collection
    }

    @Test
    public void testAddAllElementsInPositionSubList() {
        mainArrayList.addAll(1, tempArrayList);
        //todo add extra line
        Object[] array = mainArrayList.subList(1, 5).toArray();
        //todo remove extra line
        assertArrayEquals(new Object[]{"seven", "eight", "nine", "one"}, array);
    }

    @Test
    public void testIndexOf() {
        assertEquals(0, mainArrayList.indexOf("one"));
    }

    @Test
    public void testIndexOfFor() {
        for (int i = 0; i < mainArrayList.size(); i++) {
            assertEquals(i, mainArrayList.indexOf(mainArrayList.get(i)));
        }
    }

    @Test
    public void testClear() {
        mainArrayList.clear();
        //todo remove extra line
        assertEquals(0, mainArrayList.size());
    }

    @Test
    public void testClearTakeElementFromCollection() {
        mainArrayList.clear();
        //todo remove extra line
        assertFalse("one".equals(mainArrayList.contains("one")));
    }

    @Test
    public void testCloneSame() {
        mainArrayList = (ArrayList<Object>) tempArrayList.clone();

        for (int i = 0; i < mainArrayList.size(); i++) {
            assertSame(mainArrayList.get(i), tempArrayList.get(i));
        }
    }

    @Test
    public void testCloneSize() {
        int mainSize = mainArrayList.size();
        //todo add extra line
        mainArrayList = (ArrayList<Object>) tempArrayList.clone();
        //todo remove extra line
        assertNotEquals(mainSize, mainArrayList);
    }

    @Test
    public void testCloneWithGet() {
        mainArrayList = (ArrayList<Object>) tempArrayList.clone();
        //todo remove extra line
        assertNotEquals("one", mainArrayList.get(0));
    }

    @Test
    public void testCloneWithArray() {
        mainArrayList = (ArrayList<Object>) tempArrayList.clone();
        //todo remove extra line
        assertArrayEquals(mainArrayList.toArray(), tempArrayList.toArray());
    }

    @Test
    public void testCloneAndContains() {
        mainArrayList = (ArrayList<Object>) tempArrayList.clone();
        //todo remove extra line
        assertFalse(mainArrayList.contains("two"));
    }

    @Test
    public void testContains() {
        assertTrue(mainArrayList.contains("one"));
    }

    @Test
    public void testContainsWithGet() {
        assertFalse(mainArrayList.contains(tempArrayList.get(1)));
    }

    @Test  //todo remove copy
    public void testContainsWithGetString() {
        assertTrue(mainArrayList.contains("one"));
    }

    @Test
    public void testIsEmpty() {
        assertFalse(mainArrayList.isEmpty());
    }

    @Test
    public void testIsEmptyTrue() {
        mainArrayList.clear();
        //todo remove extra line
        assertTrue(mainArrayList.isEmpty());
    }

    @Test
    public void testIsEmptyFalseAfterAddElement() {
        mainArrayList.clear();
        mainArrayList.add("One");

        assertFalse(mainArrayList.isEmpty());
    }

    @Test
    public void testIterator() {
        Iterator iterator = mainArrayList.iterator();
        int i = 0;

        while (iterator.hasNext()) {
            assertEquals(mainArrayList.get(i), iterator.next());
            i++;
        }
    }

    @Test
    public void testIteratorRemove() {
        Iterator iterator = mainArrayList.iterator();
        int i = 0;

        while (iterator.hasNext()) {
            iterator.next(); //must be called

            if (i % 2 == 0) {
                iterator.remove();
            }

            i++;
        }

        assertEquals(3, mainArrayList.size());
    }

    @Test
    public void testIteratorRemoveAll() {
        Iterator iterator = mainArrayList.iterator();

        while (iterator.hasNext()) {
            iterator.next(); //must be called
        //todo remove extra line
            iterator.remove();
        }

        assertTrue(mainArrayList.isEmpty());
    }

    @Test
    public void testListIterator() {  //todo +1 v karmy
        ListIterator iterator = mainArrayList.listIterator();
        int i = mainArrayList.size() - 1;

        while (iterator.hasPrevious()) {
            assertEquals(mainArrayList.get(i), iterator.previous());
            i--;
        }
    }

    @Test
    public void testListIteratorAdd() {
        ListIterator listIterator = mainArrayList.listIterator();
        int i = 0;

        while (listIterator.hasNext()) {
            listIterator.next();

            if (i % 2 == 0) {
                listIterator.add("Half of" + i);
            }

            i++;
        }

        assertEquals(9, mainArrayList.size());
    }

    @Test
    public void testListIteratorSet() {
        ListIterator listIterator = mainArrayList.listIterator();
        int i = 0;

        runListIterator(listIterator, i);
        //todo remove extra line
        assertEquals(1, mainArrayList.get(1));
    }

    @Test
    public void testListIteratorSetContains() {
        ListIterator listIterator = mainArrayList.listIterator();
        int i = 0;

        runListIterator(listIterator, i);
        //todo remove extra line
        assertFalse(mainArrayList.contains("two"));
    }

    @Test
    public void testGetNotNull() {
        assertNotNull(mainArrayList.get(1));
    }

    @Test
    public void testGetEquals() {
        assertEquals("six", mainArrayList.get(5));
    }

    @Test
    public void testSet() {
        mainArrayList.set(0, "1");
        //todo remove extra line
        assertFalse("one".equals(mainArrayList.get(0)));
    }

    @Test
    public void testSetSize() {
        mainArrayList.set(0, "1");
        //todo remove extra line
        assertEquals(6, mainArrayList.size());
    }

    @Test
    public void testSetNotSame() {  //todo +1 v karmy za not same method
        Object temp = mainArrayList.get(0);

        mainArrayList.set(0, "1");
        //todo remove extra line
        assertNotSame(temp, mainArrayList.get(0));
    }

    @Test
    public void testRemoveIndex() {
        mainArrayList.remove(1);
        //todo remove extra line
        assertTrue(5 == mainArrayList.size());
    }

    @Test
    public void testRemoveIndexGet() {
        mainArrayList.remove(4);
        //todo remove extra line
        assertFalse("five".equals(mainArrayList.get(4)));
    }

    @Test
    public void testRemoveIndexContains() {
        mainArrayList.remove(3);
        //todo remove extra line
        assertFalse(mainArrayList.contains("four"));
    }

    @Test
    public void testRemoveObject(){
        assertFalse(mainArrayList.remove("seven"));
    }

    @Test
    public void testRemoveObjectGet(){
        mainArrayList.remove("four");
        //todo remove extra line
        assertNotSame("four", mainArrayList.get(3));
    }

    @Test
    public void testRemoveObjectContains(){
        mainArrayList.remove("four");
        //todo remove extra line
        assertFalse(mainArrayList.contains("four"));
    }

    @Test
    public void testRemoveObjectAdd(){
        int objectIndex = mainArrayList.indexOf("four");

        mainArrayList.remove("four");
        mainArrayList.add("four");

        assertNotSame(objectIndex, mainArrayList.indexOf("four"));
    }

    @Test
    public void testRemoveAll(){
        mainArrayList.removeAll(mainArrayList);
        //todo remove extra line
        assertEquals(0, mainArrayList.size());
    }

    @Test
    public void testRemoveAllSizeWithTempArrayList(){
        mainArrayList.removeAll(tempArrayList);
        //todo remove extra line
        assertNotEquals(6, mainArrayList.size());
    }

    @Test
    public void testRemoveALlWithTempArrayList(){
        Object[] temp;  //todo initialize it during first use

        mainArrayList.removeAll(tempArrayList);
        temp = mainArrayList.toArray();

        assertArrayEquals(new String[]{"two", "four", "six"}, temp);
    }

    @Test
    public void testRetainAllSizeWithSameArrayListSize(){
        mainArrayList.retainAll(mainArrayList);  //todo do not yse the same collection
        //todo remove extra line
        assertEquals(6, mainArrayList.size());
    }

    @Test
    public void testRetainAllWithTempArrayListSize(){
        mainArrayList.retainAll(tempArrayList);
        //todo remove extra line
        assertEquals(3, mainArrayList.size());
    }

    @Test
    public void testRetainAllWithTempArrayListArrayEquals(){
        Object[] mainArrayBeforeRetain;  //todo initialize it during first use

        mainArrayList.retainAll(tempArrayList);
        mainArrayBeforeRetain = mainArrayList.toArray();

        assertArrayEquals(new String[]{"one", "three", "five"}, mainArrayBeforeRetain);
    }

    @Test
    public void testSubListSize(){
        ArrayList<Object> subListArray = new ArrayList<Object>();  //todo test your own collection
        //todo add extra line
        subListArray.add(mainArrayList.subList(1,4));
        //todo remove extra line
        assertEquals(1, subListArray.size());
    }

    @Test
    public void testSubListContains(){
        assertArrayEquals(mainArrayList.subList(0,2).toArray(), new String[]{"one", "two"});
    }

    @After
    public void clearAfterTest() {
        mainArrayList.clear();
        tempArrayList.clear();
    }

    private void outputArrayList(ArrayList<Object> outputArrayList) {
        for (Object temp : outputArrayList) {
            System.out.print(temp + " ");
        }

        System.out.println();
    }

    private void runListIterator(ListIterator listIterator, int i) {
        while (listIterator.hasNext()) {
            listIterator.next();

            if (i % 2 == 1) {
                listIterator.set(i);
            }

            i++;
        }
    }

}
