package lesson_5;

import lesson_6.House;

public class Main4 {
    public static void main(String[] args) {


        int b = 10;
        Integer a = b;

        Integer c = 10;
        int d = c;
        System.out.println(Integer.MAX_VALUE);

        String s = "123";

        int j = Integer.parseInt(s);
        System.out.println(j);

        c = null;
       // j = c;

        House house = new House();
        house.getInfo();
    }
}
