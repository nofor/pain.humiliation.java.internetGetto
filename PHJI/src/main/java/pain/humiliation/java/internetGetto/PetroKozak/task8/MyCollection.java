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
        return indexOf(o) >= 0;
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
        boolean x;

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

        return true;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        Object[] array2 = c.toArray();

        for (int i = array2.length - 1; i >= 0; i--) {
            add(index, array2[i]);
        }

        return true;
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
        Object previous = default_array[index];

        for (int i = 0; i < size; i++) {
            if (i == index) {
                default_array[i] = element;
            }
        }

        return (E) previous;
    }

    @Override
    public void add(int index, Object element) {
        Object[] result = new Object[size() + 1];

        for (int i = 0; i < index; i++) {
            result[i] = default_array[i];
        }

        result[index] = element;
        size++;

        for (int j = index + 1; j < size; j++) {
            result[j] = default_array[j - 1];
        }

        default_array = result;
    }

    @Override
    public E remove(int index) {
        Object element = default_array[index];

        for (int j = index; j < size() - 1; j++) {
            Object temp = default_array[j + 1];
            default_array[j + 1] = default_array[j];
            default_array[j] = temp;
        }

        default_array[size() - 1] = null;
        size--;

        return (E) element;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size(); i++) {
            if (default_array[i].equals(o))
                return i;
        }

        return -1;
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
        Object[] result = new Object[toIndex - fromIndex];
        int count = 0;

        for (int i = fromIndex; i < toIndex; i++) {
            result[count] = default_array[i];
            count++;
        }

        return Arrays.asList(result);
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

        default_array = resultArray;
        size = resultArrayLength;

        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        Object[] array2 = c.toArray();

        for (int i = 0; i < size(); i++) {
            for (int k = 0; k < array2.length; k++) {
                if (default_array[i] == array2[k]) {
                    remove(indexOf(array2[k]));
                } else {
                    continue;
                }
            }
        }

        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        int resultArrayLength = 0;
        boolean contain;
        Object[] array2 = c.toArray();

        for (int i = 0; i < default_array.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (default_array[i] == array2[j]) {
                    resultArrayLength++;
                }
            }
        }

        if (resultArrayLength == c.size()) {
            contain = true;
        } else {
            contain = false;
        }

        return contain;
    }

    @Override
    public Object[] toArray(Object[] a) {
        Object[] result = new Object[a.length];

        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }

        return result;
    }

    public Object[] makeCapacityBigger(Object[] o) {

        Object[] result = new Object[(initial_capacity * 3) / 2 + 1];

        for (int i = 0; i < size(); i++) {
            result[i] = o[i];
        }

        default_array = result;
        return default_array;
    }

    @Override
    public String toString() {
        String result = "";

        for (int i = 0; i < size(); i++) {
            result = result + get(i) + ", ";
        }

        return "[" + result + "]";
    }
}
