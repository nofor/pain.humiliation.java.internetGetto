package pain.humiliation.java.internetGetto.PetroKozak.task8;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class Task8Test {

    MyCollection<Object> myCollection = new MyCollection();
    MyCollection<Object> helpColl = new MyCollection();
    @Before
    public void initializer(){
        myCollection.add("element to remove");
        myCollection.add("bbb");
        myCollection.add("ccc");
        myCollection.add("dddd");

        helpColl.add("1");
        helpColl.add("bbb");
        helpColl.add("ccc");
        helpColl.add("2");
    }

    @Test
    public void testSize() {
        System.out.println(myCollection.size());
    }

    @Test
    public void testIsEmpty() {
        myCollection.isEmpty();
    }

    @Test
    public void testAddAndSet() {
        myCollection.add("hhh");
        myCollection.add("ffff");
        myCollection.add("ghjk");
        myCollection.add("hjk");

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.print(myCollection.get(i) + " ");
        }

        myCollection.set(1, "added");
        System.out.println("\nAfter setting");

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.print(myCollection.get(i) + " ");
        }
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
    public void testRemoveByIndex(){

        myCollection.remove(0);

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.print(myCollection.get(i) + " ");
        }
    }
    @Test
    public void testAddToIndex(){
        myCollection.add(1,"addedElement");

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.print(myCollection.get(i) + " ");
        }
    }

    @Test
    public void testIndexOf(){
        System.out.println(myCollection.indexOf("ccc"));
    }
    @Test
    public void testLastIndexOf(){
        myCollection.add("bbb");
        System.out.println(myCollection.lastIndexOf("bbb"));
    }
    @Test
    public void testRetainAll(){
        myCollection.retainAll(helpColl);
    }
   @Test
    public void testContains(){
       System.out.println( myCollection.contains("bbb"));
   }

}
