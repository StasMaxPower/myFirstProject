package lesson_8.task1;

public class SchoolKids extends Person{

    private String schoolName;
    private double averageRate;

    public String name;

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println(name);
    }

    public SchoolKids(String name, int age) {
        super(name, age);
    }

    public SchoolKids(String name, int age, String schoolName, double averageRate) {
        super(name, age);
        System.out.println(super.name);
        this.schoolName = schoolName;
        this.averageRate = averageRate;
        System.out.println(this.name);
    }
}
