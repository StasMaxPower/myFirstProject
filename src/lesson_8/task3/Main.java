package lesson_8.task3;

public class Main {

    public static void main(String[] args) {
        Cofee cofee = new Latte();
        Latte latte = new Latte();
        latte.sugar = 50;
        System.out.println(latte.sugar);
        System.out.println();
        System.out.println(((Latte)cofee).sugar);


    }
}
