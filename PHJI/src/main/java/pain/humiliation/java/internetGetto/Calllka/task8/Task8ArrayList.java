package pain.humiliation.java.internetGetto.Calllka.task8;

import java.io.Serializable;
import java.util.*;

//todo make flag as local variable DONE
//todo extra line DONE
//todo remove extra line DONE
public class Task8ArrayList<E> implements List<E>, RandomAccess, Cloneable, Serializable {  //todo add generic here. Collection must be generic DONE
    private static int MAIN_CAPACITY = 2;
    private static Object[] mainArray = new Object[MAIN_CAPACITY];
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
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
        Object[] tempArray = new Object[size()];

        for (int i = 0; i < size(); i++) {
            tempArray[i] = mainArray[i];
        }

        return tempArray;
    }

    @Override
    public boolean add(E e) {
        try {
            mainArray[size] = e;
        } catch (IndexOutOfBoundsException ex) {
            increaseArrayCapacity(mainArray, size * 2);
            mainArray[size] = e;
        }

        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        rangeCheck(indexOf(0)); //todo think why do you need it here DONE

        for (int i = 0; i < size(); i++) {
            if (mainArray[i].equals(o)) {
                remove(i);
                break;
            }
        }

        return true;
    }

    @Override
    public boolean addAll(Collection collection) {  //todo change it DONE
        for (Object temp : collection) {
            add((E) temp);
        }

        return collection.size() != 0;
    }

    @Override
    public boolean addAll(int i, Collection collection) {
        Object[] arrayCollection = collection.toArray();
        Object[] tempMainArray = new Object[0];
        int count = i;
        int shiftPosition = i + collection.size() - 1;
        int tempSize = size + collection.size();
        rangeCheckForAdd(i);

        if (mainArray.length < tempSize) {
            tempMainArray = increaseArrayCapacity(mainArray, tempSize + 1);
        }

        for (int j = shiftPosition; j < tempSize; j++) {
            tempMainArray[j + 1] = mainArray[count];
            count++;
        }

        for (int j = 0; j < collection.size(); j++) {
            tempMainArray[i++] = arrayCollection[j];
        }

        size = tempSize;
        return collection.size() != 0;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size(); i++) {
            mainArray[i] = null;  //todo this must be new empty array DONE
        }

        size = 0;
    }

    @Override
    public E get(int i) {
        rangeCheck(i);
        return (E) mainArray[i];
    }

    @Override
    public E set(int i, E e) {
        rangeCheck(i);
        Object oldElement = mainArray[i];

        mainArray[i] = e;
        return (E) oldElement;
    }

    @Override
    public void add(int i, E e) {
        rangeCheckForAdd(i);
        Object[] some = increaseArrayCapacity(mainArray, size + 1);
        Object[] some2 = increaseArrayCapacity(mainArray, size + 1);

        for (int j = i; j < size(); j++) {
            some[j + 1] = some2[j];
        }

        some[i] = e;
        mainArray = some;
        size++;
    }

    @Override
    public E remove(int i) {
        rangeCheck(i);
        Object var = mainArray[i];

        for (int j = i; j < size() - 1; j++) {
            mainArray[j] = mainArray[j + 1];
        }

        mainArray[size--] = null;
        return (E) var;
    }

    @Override
    public int indexOf(Object o) {
        int i;

        for (i = 0; i < this.size; ++i) {
            if (o.equals(mainArray[i])) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int i;

        for (i = size - 1; i >= 0; i--) {
            if (mainArray[i].equals(o)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int i) {
        return null;
    }

    @Override
    public List subList(int i, int i1) {
        checkRangeSubList(i, i1, size);
        Object[] resultArray = new Object[i1 - i];
        int count = 0;

        for(int j = i; j < i1; j++){
            resultArray[count++] = mainArray[j];
        }

        return Arrays.asList(resultArray);
    }

    @Override
    public boolean retainAll(Collection collection) {
        Object[] inputArray = collection.toArray();
        Object[] tempArray;
        int count = 0, elementPlace = 0;

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < size; j++) {
                if (mainArray[j].equals(inputArray[i])) {
                    count++;
                }
            }
        }

        tempArray = new Object[count];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < inputArray.length; j++) {
                if (mainArray[i].equals(inputArray[j])) {
                    tempArray[elementPlace++] = mainArray[i];
                }
            }
        }

        size = count;
        increaseArrayCapacity(mainArray, size);
        mainArray = tempArray;

        return collection.size() != 0;
    }

    @Override
    public boolean removeAll(Collection collection) {
        Object[] inputArray = collection.toArray();
        Object[] tempArray = mainArray.clone();
        int count = 0, elementPlace = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < inputArray.length; j++) {
                if (mainArray[i].equals(inputArray[j])) {
                    tempArray[i] = null;
                    count++;
                }
            }
        }

        size -= count;
        increaseArrayCapacity(mainArray, size);

        for (Object temp : tempArray) {
            if (temp != null) {
                mainArray[elementPlace++] = temp;
            }
        }

        return collection.size() != 0;
    }

    @Override
    public boolean containsAll(Collection collection) {
        Object[] inputArray = collection.toArray();
        int count = 0;
        boolean flag;

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < size; j++) {
                if (mainArray[j].equals(inputArray[i])) {
                    count++;
                }
            }
        }

        flag = count == collection.size();

        return flag;
    }

    @Override
    public Object[] toArray(Object[] objects) {
        return new Object[0];
    }

    private Object[] increaseArrayCapacity(Object[] arrayForIncrease, int tempSize) {
        Object[] tempArray = new Object[tempSize];

        for (int i = 0; i < size; i++) {
            tempArray[i] = arrayForIncrease[i];
        }

        mainArray = tempArray;
        return mainArray;
    }

    private void rangeCheckForAdd(int var1) {
        if (var1 > size || var1 < 0) {
            throw new IndexOutOfBoundsException("Index: " + var1 + ", Size: " + size);
        }
    }

    private void rangeCheck(int var1) {
        if (var1 >= size) {
            throw new IndexOutOfBoundsException("Index: " + var1 + ", Size: " + size);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilderVar = new StringBuilder();

        for (int i = 0; i < size; i++) {
            stringBuilderVar.append(mainArray[i]).append(" ");
        }

        return "Collection: " + stringBuilderVar.toString();
    }

    private void checkRangeSubList(int i, int i1, int size) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("fromIndex = " + i);
        } else if (i1 > size) {
            throw new IndexOutOfBoundsException("toIndex = " + i1);
        } else if (i > i1) {
            throw new IllegalArgumentException("fromIndex(" + i + ") > toIndex(" + i1 + ")");
        }
    }
}
