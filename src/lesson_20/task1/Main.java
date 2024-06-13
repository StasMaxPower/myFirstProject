package lesson_20.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ivan", "Ivanov", 20, 3.5, 1));
        studentList.add(new Student("Petr", "Petrov", 26, 4, 2));
        studentList.add(new Student("Max", "Maximov", 20, 4.9, 3));
        studentList.add(new Student("Sidor", "Sidorov", 30, 4.1, 5));

/*        StudentUtils.filter(studentList, new IFilter() {
            @Override
            public boolean test(Student student, Integer i) {
                student.setCourse(i);
                return student.getName().startsWith("I");
            }
        });*/




        Predicate<Student> predicate = new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                return student.getName().startsWith("I");
            }
        };

        Predicate<Student> predicate1 = x -> x.getAge() >= 30;
        Predicate<Student> predicate2 = x -> x.getName().startsWith("M");
        Predicate<Student> predicate3 = x -> x.getName().startsWith("M") && x.getAge() >= 30;

        StudentUtils.filter(studentList, (x) -> x.getName().startsWith("I"));

        studentList.removeIf(predicate1);

        System.out.println("После удаления");
        System.out.println(studentList);

        Consumer<Student> consumer = y -> System.out.println(y);
        Consumer<Student> consumer1 = y -> y.setAge(y.getAge() + 30);
        Consumer<Student> consumer3 = y -> {
            y.setAge(y.getAge() + 30);
            System.out.println(y);
        };

        System.out.println();
        studentList.forEach(consumer1.andThen(consumer));


    }

}
