package lesson_5;

public class Main5 {


    public static void main(String[] args) {
        // b = sum(b);

        Cat cat = new Cat("Мурзик");
        cat.changeCat(cat);
        System.out.println(cat.name);


        Integer b = 10;
        System.out.println(b);
        b = sum1(b);
        System.out.println(b);

    }


    static int sum(int a) {
        a = a + 5;
        System.out.println(a);
        return a;
    }

    static int sum1(Integer a) {
        return a + 1;
    }

}
