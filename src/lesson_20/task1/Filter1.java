package lesson_20.task1;

import java.util.function.Predicate;

public class Filter1 implements Predicate<Student> {
    @Override
    public boolean test(Student student) {
        return student.getName().startsWith("I");
    }
}
