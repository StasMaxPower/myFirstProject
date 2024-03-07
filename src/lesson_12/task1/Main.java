package lesson_12.task1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Coin coin1 = new Coin(10, 1921, 15, "Золото");
        Coin coin2 = new Coin(15, 1931, 10, "Бронза");
        Coin coin3 = new Coin(20, 1950, 15, "Сталь");
        Coin coin4 = new Coin(12, 1901, 7, "Платина");
        Coin coin5 = new Coin(125, 1911, 22, "Олово");
        Coin coin6 = new Coin(10, 1921, 15, "Золото");

        Set<Coin> coins = new HashSet<>();

        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        coins.add(coin6);

        for (Coin coin : coins) {
            System.out.println(coin);
        }

        System.out.println("Лист после сортировки");
        List<Coin> listCoin = new ArrayList<>(coins);
        for (Coin coin : listCoin) {
            System.out.println(coin);
        }
          listCoin.sort(new ByMetalAscComparator());
        Collections.sort(listCoin);
         //listCoin.sort();

        System.out.println("Сет после сортировки");
        Set<Coin> coinTreeSet = new TreeSet<>(coins);
        for (Coin coin : coinTreeSet) {
            System.out.println(coin);
        }
        System.out.println("Макс элемент");
        System.out.println(Collections.max(coins));

        //  CoinSortUtils.printCoinByMetalAsc(coins);
       // CoinSortUtils.printCoinByMetalDesc(coins);

    }


}
