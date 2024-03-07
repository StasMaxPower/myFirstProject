package lesson_11.task2;

import java.util.*;

public class Main4 {

    public static void main(String[] args) {
        List<Integer> listA = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> listB = new ArrayList<>(List.of(4, 5, 6, 7));

        CollectionUtils utils = new CollectionUtilsImpl();

        Collection<Integer> union = utils.union(listA, listB);
        System.out.println(union);

        HashSet<Integer> set = new HashSet<>();


    }

}
