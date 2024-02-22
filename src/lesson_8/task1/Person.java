package lesson_8.task1;

public class Person {

    static String pol;
    public String name;
    public int age;

     void printInfo(){
        System.out.println(name);
    }

    public static void Info(String info){
        System.out.println(info);
    }

    public Person(String name, int age) {
        this.name = "Максим";
        this.age = age;
    }

    public Person(){};
}
