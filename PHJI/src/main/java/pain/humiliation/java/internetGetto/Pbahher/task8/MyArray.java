package pain.humiliation.java.internetGetto.Pbahher.task8;

import java.util.*;

/**
 * Created by pbahher on 1/23/18.
 */
public class MyArray<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable {

    public static void main(String[] args) {
        MyArray<String> strings = new MyArray<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");

        strings.remove(1);
        System.out.println(strings.get(1));
    }

    public E[] values;
    public int index;
    public int size;
    private static final int def_cap = 10;

    public MyArray() {
        values = (E[]) new Object[def_cap];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        boolean flag = false;

        Iterator<E> e = iterator();
        if (o == null) {
            while (e.hasNext())
                if (e.next() == null)
                    flag = true;
        } else {
            while   (e.hasNext())
                if (o.equals(e.next()))
                    flag = true;
        }
        return flag;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(values);
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        boolean flag = true;

        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
            flag = false;
        }

        return flag;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        int fromIndex = 0;
        int toIndex = values.length - 1;
        ListIterator<E> it = listIterator(fromIndex);
        for (int i = 0, n = toIndex-fromIndex; i<n; i++) {
            it.next();
            it.remove();
        }
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public E set(int index, E value) {
        return null;
    }

    @Override
    public void add(int index, E element) {
        if (index == values.length){
            E[] newArray = (E[]) new Integer[values.length * 2];
            System.arraycopy(values, 0, newArray, 0, index - 1);
            values = newArray;
        }
        values[index] = element;
        index++;
        size++;
    }

    @Override
    public E remove(int index) {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);

            int amountElementAfterIndex = temp.length - index - 1;

            System.arraycopy(temp, index + 1, values, index, amountElementAfterIndex);

        return values[index];
    }

    @Override
    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (values[i]==null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (o.equals(values[i]))
                    return i;
        }

        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        if (o == null) {
            for (int i = size - 1; i >= 0; i--)
                if (values[i] == null)
                    return i;
        } else {
            for (int i = size - 1; i >= 0; i--)
                if (o.equals(values[i]))
                    return i;
        }
        return -1;
    }


    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
