package Lesson_7;

public class Main1 {

    public static void main(String[] args) {
        Cat cat = Cat.getInstance();
        Cat cat1 = Cat.getInstance();
        System.out.println(cat == cat1);
    }


}
