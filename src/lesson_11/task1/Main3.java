package lesson_11.task1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main3 {

    public static void main(String[] args) {
        Set<String> words2 = new HashSet<>();
        words2.add("Привет");
        words2.add("Hello");
        words2.add("Hello world");
        words2.add("Hi");
        words2.add("Hi");
        System.out.println(words2);

        Set<String> words1 = new LinkedHashSet<>();
        words1.add("Привет");
        words1.add("Hello");
        words1.add("Hello world");
        words1.add("Hi");
        words1.add("Hi");
        System.out.println(words1);



    }

}
