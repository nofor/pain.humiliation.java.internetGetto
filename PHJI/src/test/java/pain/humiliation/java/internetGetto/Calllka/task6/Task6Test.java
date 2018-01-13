package pain.humiliation.java.internetGetto.Calllka.task6;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.ListIterator;

import static org.junit.Assert.*;

public class Task6Test {

    private ArrayList<Object> mainList = new ArrayList<Object>();
    private ArrayList<String> tempList = new ArrayList<String>();

    @Before
    public void runInitialization(){
        mainList.add("One");
        mainList.add("Two");
        mainList.add("Three");
        mainList.add("Four");
        mainList.add("Five");
        mainList.add("Six");
        tempList.add("One");
        tempList.add("Two");
        tempList.add("Three");
        System.out.println("Output arrayList:");
        outputMethod(mainList);
    }

    @Test
    public void addElementInPositionTest(){
        mainList.add(2, "Temp");
        System.out.println("Run test 'Add Element in Position': ");
        outputMethod(mainList);
    }

    @Test
    public void retainAllTest(){
        mainList.retainAll(tempList);
        System.out.println("Retain All:");
        outputMethod(mainList);
    }

    @Test
    public void addAllTest(){
        mainList.addAll(tempList);
        System.out.println("Add All:");
        outputMethod(mainList);
    }

    @Test
    public void addAllElementInPositionTest(){
        mainList.addAll(1, tempList);
        System.out.println("Add All in Position:");
        outputMethod(mainList);
    }

    @Test
    public void clearCollectionTest(){
        mainList.clear();
        System.out.println("Clear:");
        assertTrue(mainList.size() == 0);
    }

    @Test
    public void cloneCollectionTest(){
        mainList.clear();
        mainList = (ArrayList<Object>) tempList.clone();
        System.out.println("Clone:");
        outputMethod(mainList);
    }

    @Test
    public void containsElementTest(){
        assertFalse("Collection contain element", mainList.contains("One"));
    }

    @Test
    public void getElementTest(){
        assertTrue(mainList.get(1) == "Two");
    }

    @Test
    public void setElementTest(){
        mainList.set(1,"One");
        assertFalse(mainList.get(1) == "Two");
        assertTrue(mainList.get(1) == "One");
    }

    @Test
    public void indexOfElementTest(){
        assertTrue(mainList.indexOf("Two") == 1);
    }

    @Test
    public void isEmptyTest(){
        assertFalse(mainList.isEmpty());
    }

    @Test
    public void removeElementTest(){
        mainList.remove(1);
        mainList.remove("Five");
        System.out.println("Remove two elements: ");
        outputMethod(mainList);
    }

    @Test
    public void removeAllTest(){
        int c = mainList.size();
        mainList.removeAll(tempList);
        assertTrue(mainList.size() == c - tempList.size());
    }

    @Test
    public void lastIndexOfTest(){
        System.out.println(mainList.lastIndexOf("One") + " " + mainList.lastIndexOf("one"));
    }

    @Test
    public void subListTest(){
        mainList.add(tempList.subList(0,2));
        outputMethod(mainList);
    }

    @Test
    public void lstIndexOfTest(){
        ListIterator<Object> lItr = mainList.listIterator();

        System.out.println("HasNext:");

        while(lItr.hasNext()){
            System.out.print(lItr.next());
        }

        System.out.println("HasPrevious:");

        while(lItr.hasPrevious()){
            System.out.print(lItr.previous());
        }
    }

    @Test
    public void toArrayTest(){
        Object[] arrayString = mainList.toArray();

        for(Object temp : arrayString){
            System.out.print(temp + ", ");
        }
    }

    private void outputMethod(ArrayList<Object> list){
        for (Object temp : list){
            System.out.println(temp);
        }
    }

}
