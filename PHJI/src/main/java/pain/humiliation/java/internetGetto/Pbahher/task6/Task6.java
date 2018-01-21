package pain.humiliation.java.internetGetto.Pbahher.task6;

import java.util.ArrayList;
import java.util.Collections;
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
        Collections.addAll(collection, "a", "b", "c", "d", "e", "f");

        collection.size();

        System.out.print(collection.size());
    }

    public void isEmpty() {
        Collections.addAll(collection, "a", "b", "c", "d", "e", "f");

        collection.isEmpty();

        System.out.println(collection.isEmpty());
    }

    public void contains() {
        Collections.addAll(collection, "a", "b", "c", "d", "e", "f");

        collection.contains(6);

        System.out.println(collection.contains(6));
    }

    public void indexOff() {
        Collections.addAll(collection, "a", "b", "c", "d", "e", "f");

        collection.indexOf(6);

        System.out.println(collection.indexOf(6));
    }

    public void lastIndexOff() {
        Collections.addAll(collection, "a", "b", "c", "d", "e", "f");

        collection.lastIndexOf("b");

        System.out.println(collection.lastIndexOf("b"));
    }

    public void clones() {

    }

    public void toArray() {
        Object a[] = new String[4];
        Collections.addAll(collection, "a", "b", "c", "d", "e", "f");

        collection.toArray(a);

        a = collection.toArray();

        for (Object o : a) {
            System.out.println(o);
        }
    }

    public void toArrayT() {
        Object a[] = new String[5];
        Collections.addAll(collection, "a", "b", "c", "d", "e", "f");

        collection.toArray(a);

        a = collection.toArray();

        for (Object o : a) {
            System.out.println(o);
        }
    }

    public void get() {
        Collections.addAll(collection, "a", "b", "c", "d", "e", "f");

        collection.get(2);

        System.out.print(collection.get(2));
    }

    public void set() {
        Collections.addAll(collection, "a", "b", "c", "d", "e", "f");

        collection.set(2, "e");

        System.out.println(collection);
    }

    public void add() {
        Collections.addAll(collection, "a", "b", "c", "d", "e", "f");

        System.out.println(collection);
    }

    public void addPosition() {
        Collections.addAll(collection, "a", "b", "c", "d", "e", "f");
        collection.add(1, "e");

        System.out.println(collection);
    }

    public void removePosition() {
        Collections.addAll(collection, "a", "b", "c", "d", "e", "f");

        collection.remove(collection.get(2));

        System.out.println(collection);
    }

    public void remove() {
        Collections.addAll(collection, "a", "b", "c", "d", "e", "f");

        collection.remove("e");

        System.out.println(collection);
    }

    public void clear() {
        Collections.addAll(collection, "a", "b", "c", "d", "e", "f");

        collection.clear();

        System.out.println(collection);
    }

    public void addAll() {
        Collections.addAll(collection, "a", "b", "c", "d", "e", "f");
        Collections.addAll(collection2, "d", "e");

        collection.addAll(collection2);

        System.out.println(collection);

    }

    public void addAllPosition() {
        Collections.addAll(collection, "a", "b", "c", "d", "e", "f");
        collection2.add("e");

        collection.addAll(2,collection2);

        System.out.println(collection);
    }

    public void removeRange() {
        Collections.addAll(collection, "a", "b", "c", "d", "e", "f");

        //collection.removeRange(2, 3);

        System.out.println(collection);
    }

    public void removeAll() {
        Collections.addAll(collection, "a", "b", "c", "d", "e", "f");
        Collections.addAll(collection2, "c", "e");

        collection.removeAll(collection2);

        System.out.println(collection);
    }

    public void retainAll() {
        Collections.addAll(collection, "a", "b", "c", "d", "e", "f");
        Collections.addAll(collection2, "b","d");

        System.out.println(collection.retainAll(collection2));

        System.out.println(collection2);
    }

    public void listIteratorPosition() {
        Collections.addAll(collection, "a", "b", "c", "d", "e", "f");

        ListIterator<String> listIter = collection.listIterator(3);

        while(listIter.hasNext()) {

            System.out.println(listIter.next());
        }
    }

    public void listIterator() {
        Collections.addAll(collection, "a", "b", "c", "d", "e", "f");

        ListIterator<String> listIter = collection.listIterator();

        while(listIter.hasNext()) {

            System.out.println(listIter.next());
        }
    }

    public void iterator() {

    }

    public void subList() {
        Collections.addAll(collection, "a", "b", "c", "d", "e", "f");

        collection.subList(2, 4).clear();

        System.out.println(collection);
    }
}

