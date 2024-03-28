package lesson_15.task1;

public class Person {

    private int age;
    private String name;


    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person() {
    }

    public void setAge(int age) throws TooOldException {
        if (age == 0) {
            throw new RuntimeException();
        }

        if (age < 16) {
            throw new TooYoungException("Возраст сне может быть менее 16");
        }

        if (age > 100) {
            throw new TooOldException();
        }

        this.age = age;
    }
}
