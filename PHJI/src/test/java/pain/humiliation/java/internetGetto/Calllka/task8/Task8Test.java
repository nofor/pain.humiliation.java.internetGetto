package pain.humiliation.java.internetGetto.Calllka.task8;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class Task8Test {

    private Task8ArrayList<Object> mainList = new Task8ArrayList<>();
    private Task8ArrayList<Object> tempList = new Task8ArrayList<>();

    @Before
    public void runBeforeTest() {
        Collections.addAll(mainList, "one", "two", "three", "four", "five", "six");
        Collections.addAll(tempList, "seven", "eight", "nine", "one", "three", "five");

        System.out.print("Main ArrayList size: " + mainList.size() + "; " + "Elements: ");
        outputArrayList(mainList);
        System.out.print("Temp ArrayList size: " + tempList.size() + "; " + "Elements: ");
        outputArrayList(tempList);
    }

    @Test
    public void testAddSize() {
        mainList.add("temp");
        assertTrue(7 == mainList.size());
    }

    @Test
    public void testAddElements() {
        mainList.add("temp");//todo remove extra line DONE
        assertTrue("temp".equals(mainList.get(mainList.size() - 1)));
    }

    @Test
    public void testElementsFalse() {
        assertFalse("temp".equals(mainList.get(1)));
    }

    @Test
    public void testAddInCollection() {
        mainList.add(0, "temp");
        assertFalse("one".equals(mainList.get(0)));
    }

    @Test
    public void testAddAll() {
        int mainSize = mainList.size();

        mainList.addAll(tempList);
        assertFalse(mainSize == mainList.size());
    }

    @Test
    public void testAddAllPosition() {
        mainList.addAll(tempList);
        assertTrue(8 == mainList.indexOf("nine"));
    }

    @Test
    public void testAddAllElementsInPosition() {
        mainList.addAll(1, tempList);

        assertNotEquals("two", mainList.get(1));
        assertEquals("seven", mainList.get(1)); //todo add check on first element of second collection DONE
    }

    @Test
    public void testAddAllElementsInPositionSubList() {
        mainList.addAll(1, tempList);        //todo add extra line DONE

        Object[] array = mainList.subList(1, 5).toArray();
        assertArrayEquals(new Object[]{"seven", "eight", "nine", "one"}, array);
    }

    @Test
    public void testIndexOf() {
        assertEquals(0, mainList.indexOf("one"));
    }

    @Test
    public void testIndexOfFor() {
        for (int i = 0; i < mainList.size(); i++) {
            assertEquals(i, mainList.indexOf(mainList.get(i)));
        }
    }

    @Test
    public void testClear() {
        mainList.clear();
        assertEquals(0, mainList.size());
    }

    @Test
    public void testClearTakeElementFromCollection() {
        mainList.clear();
        assertFalse("one".equals(mainList.contains("one")));
    }

    @Test
    public void testCloneSame() throws CloneNotSupportedException {
        mainList = (Task8ArrayList<Object>) tempList.clone();

        for (int i = 0; i < mainList.size(); i++) {
            assertSame(mainList.get(i), tempList.get(i));
        }
    }

    @Test
    public void testCloneSize() throws CloneNotSupportedException {
        int mainSize = mainList.size(); //todo add extra line DONE

        mainList = (Task8ArrayList<Object>) tempList.clone();
        assertNotEquals(mainSize, mainList);
    }

    @Test
    public void testCloneWithGet() throws CloneNotSupportedException {
        mainList = (Task8ArrayList<Object>) tempList.clone();
        assertNotEquals("one", mainList.get(0));
    }

    @Test
    public void testCloneWithArray() throws CloneNotSupportedException {
        mainList = (Task8ArrayList<Object>) tempList.clone();
        assertArrayEquals(mainList.toArray(), tempList.toArray());
    }

    @Test
    public void testCloneAndContains() throws CloneNotSupportedException {
        mainList = (Task8ArrayList<Object>) tempList.clone();
        assertFalse(mainList.contains("two"));
    }

    @Test
    public void testContains() {
        assertTrue(mainList.contains("one"));
    }

    @Test
    public void testContainsWithGet() {
        assertFalse(mainList.contains(tempList.get(1)));
    }

    @Test  //todo remove copy DONE
    public void testContainsWithSet() {
        mainList.set(0,"temp");
        assertFalse(mainList.contains("one"));
    }

    @Test
    public void testIsEmpty() {
        assertFalse(mainList.isEmpty());
    }

    @Test
    public void testIsEmptyTrue() {
        mainList.clear();
        assertTrue(mainList.isEmpty());
    }

    @Test
    public void testIsEmptyFalseAfterAddElement() {
        mainList.clear();
        mainList.add("One");

        assertFalse(mainList.isEmpty());
    }

    @Test
    public void testIterator() {
        Iterator<Object> iterator = mainList.iterator();
        int i = 0;

        while (iterator.hasNext()) {
            assertEquals(mainList.get(i), iterator.next());
            i++;
        }
    }

    @Test
    public void testIteratorRemove() {
        Iterator iterator = mainList.iterator();
        int i = 0;

        while (iterator.hasNext()) {
            iterator.next(); //must be called

            if (i % 2 == 0) {
                iterator.remove();
            }

            i++;
        }

        assertEquals(3, mainList.size());
    }

    @Test
    public void testIteratorRemoveAll() {
        Iterator iterator = mainList.iterator();

        while (iterator.hasNext()) {
            iterator.next(); //must be called
            iterator.remove();
        }

        assertTrue(mainList.isEmpty());
    }

    @Test
    public void testListIterator() {  //todo +1 v karmy DONE
        ListIterator iterator = mainList.listIterator();
        int i = mainList.size() - 1;

        while (iterator.hasPrevious()) {
            assertEquals(mainList.get(i), iterator.previous());
            i--;
        }
    }

    @Test
    public void testListIteratorAdd() {
        ListIterator listIterator = mainList.listIterator();
        int i = 0;

        while (listIterator.hasNext()) {
            listIterator.next();

            if (i % 2 == 0) {
                listIterator.add("Half of" + i);
            }

            i++;
        }

        assertEquals(9, mainList.size());
    }

    @Test
    public void testListIteratorSet() {
        ListIterator listIterator = mainList.listIterator();
        int i = 0;

        runListIterator(listIterator, i);
        assertEquals(1, mainList.get(1));
    }

    @Test
    public void testListIteratorSetContains() {
        ListIterator listIterator = mainList.listIterator();
        int i = 0;

        runListIterator(listIterator, i);
        assertFalse(mainList.contains("two"));
    }

    @Test
    public void testGetNotNull() {
        assertNotNull(mainList.get(1));
    }

    @Test
    public void testGetEquals() {
        assertEquals("six", mainList.get(5));
    }

    @Test
    public void testSet() {
        mainList.set(0, "1");
        assertFalse("one".equals(mainList.get(0)));
    }

    @Test
    public void testSetSize() {
        mainList.set(0, "1");
        assertEquals(6, mainList.size());
    }

    @Test
    public void testSetNotSame() {  //todo +1 v karmy za not same method DONE
        Object temp = mainList.get(0);

        mainList.set(0, "1");
        assertNotSame(temp, mainList.get(0));
    }

    @Test
    public void testRemoveIndex() {
        mainList.remove(1);
        assertTrue(5 == mainList.size());
    }

    @Test
    public void testRemoveIndexGet() {
        mainList.remove(4);
        assertFalse("five".equals(mainList.get(4)));
    }

    @Test
    public void testRemoveIndexContains() {
        mainList.remove(3);
        assertFalse(mainList.contains("four"));
    }

    @Test
    public void testRemoveObject(){
        assertFalse(mainList.remove("seven"));
    }

    @Test
    public void testRemoveObjectGet(){
        mainList.remove("four");
        assertNotSame("four", mainList.get(3));
    }

    @Test
    public void testRemoveObjectContains(){
        mainList.remove("four");
        assertFalse(mainList.contains("four"));
    }

    @Test
    public void testRemoveObjectAdd(){
        int objectIndex = mainList.indexOf("four");

        mainList.remove("four");
        mainList.add("four");

        assertNotSame(objectIndex, mainList.indexOf("four"));
    }

    @Test
    public void testRemoveAll(){
        mainList.removeAll(mainList);
        assertEquals(0, mainList.size());
    }

    @Test
    public void testRemoveAllSizeWithTempArrayList(){
        mainList.removeAll(tempList);
        assertNotEquals(6, mainList.size());
    }

    @Test
    public void testRemoveALlWithTempArrayList(){
        mainList.removeAll(tempList);

        Object[] temp = mainList.toArray();  //todo initialize it during first use DONE
        assertArrayEquals(new String[]{"two", "four", "six"}, temp);
    }

    @Test
    public void testRetainAllSizeWithSameArrayListSize(){
        Task8ArrayList<Object> one = new Task8ArrayList<>();
        one.add("p");
        one.add("s");
        one.add("t");
        one.add("u");

        assertNotSame(mainList, one);
        mainList.retainAll(one);  //todo do not yse the same collection DONE
        assertEquals(0, mainList.size());
    }

    @Test
    public void testRetainAllWithTempArrayListSize(){
        mainList.retainAll(tempList);
        assertEquals(3, mainList.size());
    }

    @Test
    public void testRetainAllWithTempArrayListArrayEquals(){
        mainList.retainAll(tempList);

        Object[] mainArrayBeforeRetain= mainList.toArray(); //todo initialize it during first use DONE
        assertArrayEquals(new String[]{"one", "three", "five"}, mainArrayBeforeRetain);
    }

    @Test
    public void testSubListSize(){
        mainList.clear();
        mainList.add(tempList.subList(1,4));

        assertEquals(1, mainList.size());
    }

    @Test
    public void testSubListContains(){
        assertArrayEquals(mainList.subList(0,2).toArray(), new String[]{"one", "two"});
    }

    @After
    public void clearAfterTest() {
        mainList.clear();
        tempList.clear();
    }

    private void outputArrayList(Task8ArrayList outputArrayList) {
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
