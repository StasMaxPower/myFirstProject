package lesson_16.task6;

import lesson_14.task2.Student;
import lesson_3.Cat;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(new Cat());
        list.add("Hello");
        for (Object o : list) {
            System.out.println(o);
        }
        String s = (String) list.get(0);
    }
}
