package pain.humiliation.java.internetGetto.Pbahher.task8;

/**
 * Created by pbahher on 1/23/18.
 */
public interface My<E> extends Iterable<E> {  //todo remove this class and use Iterable in MyArray or remove class
    boolean add(E e);
    void delete(int index);
    E get(int index);
    int size();
    void update(int index, E e);
}
