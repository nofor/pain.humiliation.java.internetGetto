package pain.humiliation.java.internetGetto.Pbahher.task6;

import java.util.ArrayList;
import java.util.ListIterator;

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
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
        collection.add("f");

        collection.size();

        System.out.print(collection.size());
    }

    public void isEmpty() {
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
        collection.add("b");
        collection.add("f");

        collection.isEmpty();

        System.out.println(collection.isEmpty());
    }

    public void contains() {
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
        collection.add("b");
        collection.add("f");

        collection.contains("g");

        System.out.println(collection.contains("g"));
    }

    public void indexOff() {
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
        collection.add("b");
        collection.add("f");

        collection.indexOf("b");

        System.out.println(collection.indexOf("b"));
    }

    public void lastIndexOff() {
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
        collection.add("b");
        collection.add("f");

        collection.lastIndexOf("b");

        System.out.println(collection.lastIndexOf("b"));
    }

    public void clones() {

    }

    public void toArray() {
        Object a[] = new String[4];
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");

        collection.toArray(a);

        a = collection.toArray();

        for (Object o : a) {
            System.out.println(o);
        }
    }

    public void toArrayT() {
        Object a[] = new String[5];
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
        collection.add("e");

        collection.toArray(a);

        a = collection.toArray();

        for (Object o : a) {
            System.out.println(o);
        }
    }

    public void get() {
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
        collection.add("e");
        collection.add("f");

        collection.get(2);

        System.out.print(collection.get(2));
    }

    public void set() {
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");

        collection.set(2, "e");

        System.out.println(collection);
    }

    public void add() {
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");

        System.out.println(collection);
    }

    public void addPosition() {
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
        collection.add(1, "e");

        System.out.println(collection);
    }

    public void removePosition() {
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
        collection.add("e");

        collection.remove(collection.get(2));

        System.out.println(collection);
    }

    public void remove() {
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
        collection.add("e");

        collection.remove("e");

        System.out.println(collection);
    }

    public void clear() {
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
        collection.add("e");

        collection.clear();

        System.out.println(collection);
    }

    public void addAll() {
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection2.add("d");
        collection2.add("e");

        collection.addAll(collection2);

        System.out.println(collection);

    }

    public void addAllPosition() {
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
        collection2.add("e");

        collection.addAll(2,collection2);

        System.out.println(collection);
    }

    public void removeRange() {
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
        collection.add("e");

        //collection.removeRange(2, 3);

        System.out.println(collection);
    }

    public void removeAll() {
        collection.add("a");
        collection.add("b");
        collection2.add("c");
        collection.add("d");
        collection2.add("e");

        collection.removeAll(collection2);

        System.out.println(collection);
    }

    public void retainAll() {
        collection.add("a");
        collection2.add("a");
        collection2.add("b");
        collection.add("c");
        collection2.add("d");

        System.out.println(collection.retainAll(collection2));

        System.out.println(collection2);
    }

    public void listIteratorPosition() {
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
        collection.add("e");
        collection.add("f");

        ListIterator<String> listIter = collection.listIterator(3);

        while(listIter.hasNext()) {

            System.out.println(listIter.next());
        }
    }

    public void listIterator() {

    }

    public void iterator() {

    }

    public void subList() {
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
        collection.add("e");
        collection.add("f");

        collection.subList(2, 4).clear();

        System.out.println(collection);
    }
}

