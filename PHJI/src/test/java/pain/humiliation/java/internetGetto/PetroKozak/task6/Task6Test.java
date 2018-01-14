package pain.humiliation.java.internetGetto.PetroKozak.task6;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.ListIterator;

import static org.junit.Assert.*;

public class Task6Test {

    private ArrayList<String> list = new ArrayList<>();
    private ArrayList<String> list2 = new ArrayList<>();

    @Before
    public void initializer() {
        list.add("Hello");
        list.add("from");
        list.add("the");
        list.add("other");
        list.add("side");

        list2.add("you");
        list2.add("on");
        list2.add("the");
        list2.add("other");
        list2.add("side");
        System.out.println("Our List is:");
        arrayOutput(list);
    }

    @Test
    public void addElementOnIndex() {
        list.add(4, "motherfucking");
        System.out.println("\nAdding element in the position looks like:");
        arrayOutput(list);
    }

    @Test
    public void methodAddAll() {
        list.addAll(list2);
        System.out.println("\nAdding other list:");
        arrayOutput(list);
    }

    @Test
    public void addOtherListFromThePosition() {
        list.addAll(0, list2);
        System.out.println("\nAdding other List from the position:");
        arrayOutput(list);
    }

    @Test
    public void clearArrayAndCheckIfEmpty() {
        assertFalse(list.isEmpty());
    }

    @Test
    public void clearAndClone() {
        list.clear();
        list = (ArrayList<String>) list2.clone();
        System.out.println("\nNew list is:");
        arrayOutput(list);
    }

    @Test
    public void getElement() {
        System.out.println("\nThe element is:");
        System.out.println(list.get(2));
    }

    @Test
    public void proveIfContains() {
        assertTrue(list.contains("the"));
    }

    @Test
    public void getSize() {
        System.out.println("\nSize is " + list.size());
    }

    @Test
    public void remove() {
        list.remove("the");
        System.out.println("\nActual List is:");
        arrayOutput(list);
    }

    @Test
    public void subList() {
        list.addAll(list2.subList(2, 4));
        arrayOutput(list);
    }

    @Test
    public void retainAll() {
        list.retainAll(list2);
        arrayOutput(list);
    }

    @Test
    public void setValue() {
        list.set(3, "same");
        arrayOutput(list);
    }

    @Test
    public void equality() {
        System.out.println(list.equals(list2));
    }

    @Test
    public void containsAll() {
        System.out.println(list.containsAll(list2));
    }

    @Test
    public void removeAll() {
        list.removeAll(list2);
        arrayOutput(list);
    }

    @Test
    public void toArray() {
        Object[] x = list.toArray();

        for (Object i : x) {
            System.out.println(i);
        }
    }

    @Test
    public void firstAndLastOccurrence() {
        System.out.println(list.indexOf("the"));
        list.add("the");
        System.out.println(list.lastIndexOf("the"));
    }

    @Test
    public void iterations() {
        ListIterator<String> iter = list.listIterator();

        System.out.println("\nIteration forward:");

        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }

        System.out.println("\nIteration backward:");

        while (iter.hasPrevious()) {
            System.out.print(iter.previous() + " ");
        }
    }

    private void arrayOutput(ArrayList<String> list) {
        for (String i : list) {
            System.out.print(i + " ");
        }
    }
}
