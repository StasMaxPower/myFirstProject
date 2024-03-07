package lesson_11.task1;

import lesson_3.Cat;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words = new LinkedList<>();
        ArrayList<Cat> cats = new ArrayList<>();
        words.add("Привет");
        words.add("Hello");
        words.add("Hello world");
        words.add("Hi");
        words.add(1,"аымив");

        System.out.println(words);

        List<Integer> words1 = Arrays.asList(1,2,3,4);
        words1 = new ArrayList<>(List.of(1,2,3,4));
        words1.add(10);
        Integer[] integers = words1.toArray(new Integer[]{});


        Set<String> words2 = new HashSet<>();
        words2.add("Привет");
        words2.add("Hello");
        words2.add("Hello world");
        words2.add("Hi");
        words2.add("Hi");
        System.out.println(words2);


    }




}
