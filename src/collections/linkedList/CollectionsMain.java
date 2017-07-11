package collections.linkedList;

import java.util.*;

/**
 * Created by bartek on 11.07.17.
 */
public class CollectionsMain {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.size());
        System.out.println(list.get(6));
    }
}
