package lesson_14.task2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(1, "Петр", "Петров", 1);
        Student student2 = new Student(2, "Иван", "Иванов", 3);
        Student student3 = new Student(3, "Сергей", "Сергеев", 4);
        Student student4 = new Student(4, "Александр", "Александров", 2);

        Map<Student, Double> averageMap = new TreeMap<>();
        averageMap.put(student1, 2.34);
        averageMap.put(student2, 3.55);
        averageMap.put(student3, 5.0);
        averageMap.put(student4, 4.22);

        System.out.println(averageMap);
        System.out.println(student1.hashCode());

        averageMap.put(student1, 100.0);
        System.out.println("После смены курса");
        student1.setCourse(2);
        System.out.println(averageMap.get(student1));
        System.out.println(averageMap);

        String name = "Alex";
        name = "Ivan";

        System.out.println("Способ 1. По ключу");
        for (Student student : averageMap.keySet()) {
            System.out.println(student);
        }

        System.out.println("Способ 2. По значению");
        for (Double value : averageMap.values()) {
            System.out.println(value);
        }

        System.out.println("Способ 3. По парам ключ-значение");
        for (Map.Entry<Student, Double> entry : averageMap.entrySet()){
            String name1 = entry.getKey().getName();
            Double value = entry.getValue();
            System.out.printf("\nСтудент с именем %s и средним баллом %.2f", name1, value);
        }


    }


}
