package collections.linkedList;

/**
 * Created by bartek on 11.07.17.
 */
public class LinkedList<E> implements List<E> {

    private Node<E> first;
    private Node<E> last;
    private static int size = 0;

    private static class Node<E> {
        private E e;
        private Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }
    }

    @Override
    public boolean add(E e) {
        Node<E> l = last;
        Node<E> newNode = new Node<>(e, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
        return true;
    }

    @Override
    public boolean addFirst(E e) {
        if (first == null) {
            Node<E> newNode = new Node<>(e, null);
            first = newNode;
            last = newNode;
            return true;
        } else {
            Node<E> newNode = new Node<>(e, first);
            first = newNode;
            return true;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int i) {
        checkElementIndex(i);
        if (i == 0) {
            return first.e;
        } else if (i == size - 1) {
            return last.e;
        } else {
            Node<E> result = first;
            for (int j = 0 ; j < i ; j++) {
                result = result.next;
            }
            return result.e;
        }
    }

    private void checkElementIndex(int index) {
        if (!isElementIndex(index)) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

}
