package pain.humiliation.java.internetGetto.Calllka.task8;

import java.io.Serializable;
import java.util.*;
//todo make flag as local variable
public class Task8ArrayList implements List, RandomAccess, Cloneable, Serializable {  //todo add generic here. Collection must be generic
    private static int MAIN_CAPACITY = 2;
    private static Object[] mainArray = new Object[MAIN_CAPACITY];
    private int size = 0;
    private boolean flag;

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
        for (int i = 0; i < size; i++) {
            if (mainArray[i].equals(o)) {
                flag = true;
                break;
            } else {
                flag = false;
            }
        }

        return flag;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] tempArray = new Object[size()];
        //todo extra line
        for (int i = 0; i < size(); i++) {
            tempArray[i] = mainArray[i];
        }
        //todo extra line
        return tempArray;
    }

    @Override
    public boolean add(Object o) {
        //todo remove extra line
        try {
            mainArray[size] = o;
            flag = true;
        } catch (IndexOutOfBoundsException ex) {
            increaseArrayCapacity(mainArray, size * 2);
            mainArray[size] = o;
            //todo remove extra line
            flag = true;
        }

        size++;
        return flag;
    }

    @Override
    public boolean remove(Object o) {
        if (contains(o)) {  //todo think why do you need it here
            for (int i = 0; i < size(); i++) {
                if (mainArray[i].equals(o)) {
                    for (int j = i; j < size() - 1; j++) {
                        mainArray[j] = mainArray[j + 1];
                    }
                    mainArray[size--] = null;
                    //todo remove extra line
                    break;
                }
            }

            flag = true;
        } else {
            flag = false;
        }

        return flag;
    }

    @Override
    public boolean addAll(Collection collection) {  //todo change it
        int sumSizeArray = size + collection.size();
        Object[] collectionArray = collection.toArray();

        increaseArrayCapacity(mainArray, sumSizeArray);

        for (int i = 0; i < collection.size(); i++) {
            mainArray[size++] = collectionArray[i];
            flag = true;
        }

        size = mainArray.length;

        return flag;
    }

    @Override
    public boolean addAll(int i, Collection collection) {
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size(); i++) {
            mainArray[i] = null;  //todo this must be new empty array
        }

        size = 0;
    }

    @Override
    public Object get(int i) {
        return mainArray[i];
    }

    @Override
    public Object set(int i, Object o) {
        for(int position = 0; position < size(); position++){
            if (i == position){
                mainArray[position] = o;
            }
        }

        return null;
    }

    @Override
    public void add(int i, Object o) {
        Object[] some = increaseArrayCapacity(mainArray, size + 1);

        for(int position = 0; position < size(); position++){
            if (position == i) {
                for (int j = position; j < size(); j++){

                    Object temp = mainArray[j];
                    mainArray[j] = some[j + 1];
                    some[j + 1]= temp;
                    some[i] = o;
                }
            }
        }

        mainArray = some;

    }

    @Override
    public Object remove(int i) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
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
        return null;
    }

    @Override
    public boolean retainAll(Collection collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection collection) {
        return false;
    }

    @Override
    public boolean containsAll(Collection collection) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] objects) {
        return new Object[0];
    }

    private Object[] increaseArrayCapacity(Object[] arrayForIncrease, int increaseSize) {
        Object[] tempArray = new Object[increaseSize];

        for (int i = 0; i < size(); i++) {
            tempArray[i] = arrayForIncrease[i];
        }

        mainArray = tempArray;
        //todo remove extra line
        return mainArray;
    }
}
