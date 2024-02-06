package lesson_1.homeworks;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int money = 1000; // задали кол-во изначальной суммы.
        int pricePizza = 230; // задали сумму пиццы.
        int priceChoco = 22; // задали сумму шоколадки.
        double priceCandy = 2.5; // задали сумму конфетки.

        int quantityPizza = money / pricePizza; // вычисляем кол-во пицц 1000/230=4
        int moneyAfterPizza = money - quantityPizza * pricePizza; // вычисляем сдачу после пиццы 1000-4*230=80

        int  quantityChoco = moneyAfterPizza / priceChoco; // вычисляем кол-во шоколадок 80/22=3
        int moneyAfterChoco = moneyAfterPizza - quantityChoco * priceChoco; // вычисляем сдачу после пиццы 80-3*22=14

        int quantityCandy = (int)(moneyAfterChoco / priceCandy); // тут я долго думал как преобразовать дробное число в целое, в итоге нашёл такой способ. вычисляем кол-во шоколадок 14/2.5=5
        double changeAfterBuy = moneyAfterChoco - quantityCandy * priceCandy; // ну и считаем сдачу 14-5*2.5



        System.out.println("На эти день мы можем купить:");
        System.out.println(" - Пицца - " + quantityPizza + " шт.");
        System.out.println(" - Шоколадки - " + quantityChoco + " шт.");
        System.out.println(" - Конфеты - " + quantityCandy + " шт.");
        System.out.println(" Сдача: " + changeAfterBuy + " руб.");


    }
}
