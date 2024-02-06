package lesson_2;

public class Main {
    public static void main(String[] args) {

/*        Даны переменные:
        - деньги, которые у нас есть - 1000 рублей
                - стоимость пиццы - 230 рублей
                - стоимость шоколадки - 22 рубля
                - стоимость конфеты - 2,5 рубля
        Задача: представим себе, что мы зашли в магазин, и наша задача: купить максимальное количество пиццы,
        затем на сдачу купить максимальное количество шоколадок, затем на оставшуюся сдачу купить максимальное количество конфет.
                В результате нам нужно сделать математический просчет и вывести на консоль информацию в таком формате:
        На эти деньги мы можем купить:
        - пицца - х шт.
                - шоколадки - х шт.
                - конфеты - х шт.
                Сдача: х руб.
        Примечание: код должен быть универсальным и корректно работать, даже если мы поменяем первоначальные
        данные на какие-то другие.*/

        double money = 1000;
        double pizzaPrice = 230;
        double chocolatePrice = 22;
        double candyPrice = 2.5;

        //количество пиццы
        int pizzaCount = (int) (money / pizzaPrice);
        //System.out.println(pizzaCount);
        money = money % pizzaPrice;
        int chocolateCount = (int) (money / chocolatePrice);
        money = money % chocolatePrice;
        int candyCount = (int) (money / candyPrice);
        money = (money % candyPrice);


        String s = String.format("На эти деньги мы можем купить: \n" +
                "- пицца - %d шт. \n" +
                "- шоколадки - %d шт. \n" +
                "- конфеты - %d шт. \n" +
                "Сдача: %.2f руб.", pizzaCount, chocolateCount, candyCount, money);

        System.out.printf(s);

/*        byte i = 123;
        int a = 127;
        //a = i;
        i = (byte) a;
        System.out.println(i);*/
    }
}
