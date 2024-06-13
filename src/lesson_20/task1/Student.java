package lesson_20.task1;

public class Student {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAverageRate(double averageRate) {
        this.averageRate = averageRate;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    private String surname;
    private int age;
    private double averageRate;
    private int course;

    public Student(String name, String surname, int age, double averageRate, int course) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageRate = averageRate;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getAverageRate() {
        return averageRate;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", averageRate=" + averageRate +
                ", course=" + course +
                '}';
    }
}
