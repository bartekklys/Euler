package collections.linkedList;

/**
 * Created by bartek on 11.07.17.
 */
public interface List<E> {

    boolean add(E e);

    boolean addFirst(E e);

    int size();

    E get(int i);
}
