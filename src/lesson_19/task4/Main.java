package lesson_19.task4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ivan", "Ivanov", 20 , 3.5, 1));
        studentList.add(new Student("Petr", "Petrov", 26 , 4, 2));
        studentList.add(new Student("Max", "Maximov", 20 , 4.9, 3));
        studentList.add(new Student("Sidor", "Sidorov", 30 , 4.1, 5));

        StudentUtils.filter(studentList, new IFilter() {
            @Override
            public boolean test(Student student) {
                return student.getName().startsWith("I");
            }
        });
    }

}
