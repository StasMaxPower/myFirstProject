package lesson_8.task1;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Иван", 20);
        SchoolKids kids = new SchoolKids("Петр", 10, "СОШ 74", 4.9);
        Student student = new Student();

        person.printInfo();
        student.printInfo();
        kids.printInfo();
        System.out.println(Student.pol);

        Person.Info("Привет");
        Student.Info("Hello");
        System.out.println();

        kids.printInfo();


    }

}
