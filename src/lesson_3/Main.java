package lesson_3;

public class Main {

    public static void main(String[] args) {

        /*        int a = -1;*/

/*        if (a == 0) {
            System.out.println("а равно 0");
        } else if (a > -1) {
            System.out.println("а больше 0");
        } else {
            System.out.println("а больше 0");
        }*/

/*        int b = a > 0 ? 1 : 2;
        System.out.println(b);*/

        //вывести в консоль все четные числа от 10 до 20
/*        for (int i = 10; i <= 20; i += 2) {
            System.out.println(i);

        }*/

        //посчитать количество денег, если их положить в банк на 5 лет под 7% годовых. Капитализация ежемесячная

        double money = 1_000_000;
        int year = 5;
        int rate = 7;

        for (int i = 0; i < year * 12; i++) {
            money = money + money * ( rate / 00);
        }
        System.out.printf("%.2f\n", money);

        //посчитать сумму чисел от a до b которые делятся нацело на 2 и на 3
        int a = 1;
        int b = 30;
        int sum = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                sum = sum + i;
            }

        }
        System.out.println(sum);


    }


}

