package pain.humiliation.java.internetGetto.Pbahher.task8;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by pbahher on 1/30/18.
 */
public class ArrayIterator<E> extends MyArray implements Iterator {


    public int index;
    public E[] values;

    ArrayIterator(E[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public E next() {
        return values[index++];
    }

    @Override
    public void remove() {
    }

    /*public void subListRangeCheck(int fromIndex, int toIndex, int size) {
        if (fromIndex < 0)
            throw new IndexOutOfBoundsException("fromIndex = " + fromIndex);
        if (toIndex > size)
            throw new IndexOutOfBoundsException("toIndex = " + toIndex);
        if (fromIndex > toIndex)
            throw new IllegalArgumentException("fromIndex(" + fromIndex +
                    ") > toIndex(" + toIndex + ")");
    }

    public String outOfBoundsMsg(int index){
        return "Index: " +index+" , Size: "+size();
    }

    public void rangeCheckForAdd(int index) {
        if (index < 0 || index > size())
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }*/

}
