package lesson_2;

public class Main2 {
    public static void main(String[] args) {

        //boolean b = true;

        //Математические опеаторы  + - * / %
        // Знак инвертирования !

/*        b = !(5 == 4);
        System.out.println(b);*/

        //System.out.println(0.0 / 0.0);
        //0.000000000000000000000000000000000000000000001

        //Дополнительные математичекие операторы
        // ++  --  +=  *=   -=   /=   %=
        int i = 10;
        //Постфиксная запись  i++
        //префиксная запись ++i

        //++i;
        // System.out.println(i++);
        // System.out.println(i);

        // i %= 3;//i = i % 3
        // System.out.println(i);

        // Логические операторы   ==  !=  <   <=   >  >=  |   &    !   ||   &&

        boolean b = 4 > 5;
        System.out.println(b);

        boolean a = true;
        b = false;
        boolean c = b && (4 / 0 == 1);
        System.out.println(c);


    }
}
