package pain.humiliation.java.internetGetto.Pbahher.task8;

import java.util.Iterator;
/**
 * Created by pbahher on 1/23/18.
 */
public class ArrayIterator<E> implements Iterator<E> {  //todo better to remove it
    private int index = 0;
    private E[] values;

    ArrayIterator(E[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public E next() {
        return values[index ++];
    }
}
