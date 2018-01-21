package pain.humiliation.java.internetGetto.Pbahher.task6;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import static java.util.Arrays.asList;

/**
 * Created by pbahher on 1/16/18.
 */
public class Task6 {

    public ArrayList<String> collection = new ArrayList<String>();

    public ArrayList<String> collection2 = new ArrayList<String>();

    public void trimToSize() {
        collection.trimToSize();
    }

    public void ensureCapacity() {
        collection.ensureCapacity(10);
    }

    public void size() {
        List<Integer> collection = asList(1, 2, 3, 4, 5);

        collection.size();

        System.out.print(collection.size());
    }

    public void isEmpty() {
        List<Integer> collection = asList(1, 2, 3, 4, 5);

        collection.isEmpty();

        System.out.println(collection.isEmpty());
    }

    public void contains() {
        List<Integer> collection = asList(1, 2, 3, 4, 5);

        collection.contains(6);

        System.out.println(collection.contains(6));
    }

    public void indexOff() {
        List<Integer> collection = asList(1, 2, 3, 4, 5);

        collection.indexOf(6);

        System.out.println(collection.indexOf(6));
    }

    public void lastIndexOff() {
        List<Integer> collection = asList(1, 2, 3, 4, 5);

        collection.lastIndexOf(2);

        System.out.println(collection.lastIndexOf(2));
    }

    public void clones() {

    }

    public void toArray() {
        Object a[] = new String[4];
        List<String> collection = asList("a", "b", "c", "d");

        collection.toArray(a);

        a = collection.toArray();

        for (Object o : a) {
            System.out.println(o);
        }
    }

    public void toArrayT() {
        Object a[] = new String[5];
        List<String> collection = asList("a", "b", "c", "d", "e");

        collection.toArray(a);

        a = collection.toArray();

        for (Object o : a) {
            System.out.println(o);
        }
    }

    public void get() {
        List<String> collection = asList("a", "b", "c", "d", "e", "f");

        collection.get(2);

        System.out.print(collection.get(2));
    }

    public void set() {
        List<String> collection = asList("a", "b", "c", "d");

        collection.set(2, "e");

        System.out.println(collection);
    }

    public void add() {
        List<String> collection = asList("a", "b", "c", "d");

        System.out.println(collection);
    }

    public void addPosition() {
        List<String> collection = asList("a", "b", "c", "d");
        collection.add(1, "e");

        System.out.println(collection);
    }

    public void removePosition() {
        List<String> collection = asList("a", "b", "c", "d", "e");

        collection.remove(collection.get(2));

        System.out.println(collection);
    }

    public void remove() {
        List<String> collection = asList("a", "b", "c", "d", "e", "f");

        collection.remove("e");

        System.out.println(collection);
    }

    public void clear() {
        List<String> collection = asList("a", "b", "c", "d", "e", "f");

        collection.clear();

        System.out.println(collection);
    }

    public void addAll() {
        List<String> collection = asList("a", "b", "c", "f");
        List<String> collection2 = asList("d", "e");

        collection.addAll(collection2);

        System.out.println(collection);

    }

    public void addAllPosition() {
        List<String> collection = asList("a", "b", "c", "d");
        collection2.add("e");

        collection.addAll(2,collection2);

        System.out.println(collection);
    }

    public void removeRange() {
        List<String> collection = asList("a", "b", "c", "d", "e", "f");

        //collection.removeRange(2, 3);

        System.out.println(collection);
    }

    public void removeAll() {
        List<String> collection = asList("a", "b", "d", "f");
        List<String> collection2 = asList("c", "e");

        collection.removeAll(collection2);

        System.out.println(collection);
    }

    public void retainAll() {
        List<String> collection = asList("a", "c", "e", "f");
        List<String> collection2 = asList("b","d");

        System.out.println(collection.retainAll(collection2));

        System.out.println(collection2);
    }

    public void listIteratorPosition() {
        List<String> collection = asList("a", "b", "c", "d", "e", "f");

        ListIterator<String> listIter = collection.listIterator(3);

        while(listIter.hasNext()) {

            System.out.println(listIter.next());
        }
    }

    public void listIterator() {
        List<String> collection = asList("a", "b", "c", "d", "e", "f");

        ListIterator<String> listIter = collection.listIterator();

        while(listIter.hasNext()) {

            System.out.println(listIter.next());
        }
    }

    public void iterator() {

    }

    public void subList() {
        List<String> collection = asList("a", "b", "c", "d", "e", "f");

        collection.subList(2, 4).clear();

        System.out.println(collection);
    }
}

