package pain.humiliation.java.internetGetto.PetroKozak.task8;

import java.util.*;

public class MyCollection<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable {

    private int size = 0;
    private Object[] default_array;
    private int initial_capacity = 5;

    public MyCollection() {
        default_array = new Object[initial_capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o)>=0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size()];

        for (int i = 0; i < size(); i++) {
            result[i] = default_array[i];
        }

        return result;
    }

    @Override
    public boolean add(Object o) {
        boolean x = true;

        try {
            default_array[size] = o;
            x = true;
        } catch (IndexOutOfBoundsException ex) {
            makeCapacityBigger(default_array);
            default_array[size] = o;
            x = true;
        }

        size++;
        return x;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size() - 1; i++) {
            if (default_array[i].equals(o)) {
                for (int j = i; j < size() - 1; j++) {
                    Object temp = default_array[j + 1];
                    default_array[j + 1] = default_array[j];
                    default_array[j] = temp;
                }
            }
        }
        default_array[size() - 1] = null;
        size--;
        return true;
    }

    @Override
    public boolean addAll(Collection c) {
        Object[] collection = c.toArray();
        Object[] result = new Object[size() + c.size()];

        for (int i = 0; i < size(); i++) {
            result[i] = default_array[i];
        }

        for (int j = 0; j < collection.length; j++) {
            result[size() + j] = collection[j];
        }

        default_array = result;
        size = result.length;
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {
        default_array = new Object[initial_capacity];
        size = 0;
    }

    @Override
    public E get(int index) {
        return (E) default_array[index];
    }

    @Override
    public E set(int index, Object element) {
        for (int i = 0; i < size; i++) {
            if (i == index) {
                default_array[i] = element;
            }
        }

        return null;
    }

    @Override
    public void add(int index, Object element) {
        try {
            default_array[size()] = default_array[size() - 1];

            for (int j = index; j <= size() - 1; j++) {
                default_array[j + 1] = default_array[j];
            }

            default_array[index] = element;
        } catch (IndexOutOfBoundsException ex) {
            makeCapacityBigger(default_array);

            default_array[size()] = default_array[size() - 1];

            for (int j = index; j <= size() - 1; j++) {
                default_array[j + 1] = default_array[j];
            }
            default_array[index] = element;
        }

        size++;
    }

    @Override
    public E remove(int index) {
        for (int j = index; j < size() - 1; j++) {
            Object temp = default_array[j + 1];
            default_array[j + 1] = default_array[j];
            default_array[j] = temp;
        }

        default_array[size() - 1] = null;
        size--;

        return null;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size(); i++) {
            if (default_array[i].equals(o))
                return i;
        }
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = size() - 1; i > 0; i--) {
            if (default_array[i].equals(o))
                return i;
        }
        return -1;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        int resultArrayIndex = 0;
        int resultArrayLength = 0;
        Object[] array2 = c.toArray();

        for (int i = 0; i < default_array.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (default_array[i] == array2[j]) {
                    resultArrayLength++;
                }
            }
        }

        Object[] resultArray = new Object[resultArrayLength];

        for (int i = 0; i < default_array.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (default_array[i] == array2[j]) {
                    resultArray[resultArrayIndex] = default_array[i];
                    resultArrayIndex++;
                }
            }
        }

        for (Object x : resultArray) {
            System.out.print(x + " ");
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    public Object[] makeCapacityBigger(Object[] o) {

        Object[] result = new Object[(initial_capacity * 3) / 2 + 1];

        for (int i = 0; i < size(); i++) {
            result[i] = o[i];
        }

        default_array = result;
        return default_array;
    }
}
