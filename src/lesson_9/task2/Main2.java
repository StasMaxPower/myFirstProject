package lesson_9.task2;

import lesson_9.task1.Oval;

import java.util.HashMap;
import java.util.Map;

public class Main2 {

    public static void main(String[] args) {
        Oval oval = new Oval(3, 4);
        Oval oval1 = new Oval(3, 4);
        System.out.println(oval.equals(oval1));

        System.out.println(oval.hashCode());
        System.out.println(oval1.hashCode());
        System.out.println(oval1);
        System.out.println();

    }
}
