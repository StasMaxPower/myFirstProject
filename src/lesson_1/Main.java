package lesson_1;

public class Main {

    /**
     * это мой первый метод
     *
     * @param args
     */
    public static void main(String[] args) {
        //это мой комментарий
        System.out.println("Привет мир");
        int a;
        a = 100000;

        double d = 1.6;

        /* задача
         * длина комнаты - 12 метров , ширина комнаты - 7 метров
         * длина стола 3 метра, ширина стола - 2 метра
         * сколько столов войдет в комнату
         */

        int roomLength = 12;
        int roomWidth = 7;
        int tableLength = 3;
        int tableWidth = 2;

        int tablesAtLength = roomLength / tableLength;
        int tablesAtWidth = roomWidth / tableWidth;
        int tablesCount = tablesAtLength * tablesAtWidth;
        String s = "Всего в комнату войдет " + tablesCount + " столов";
        System.out.println(s);

        boolean b = false;
        System.out.println(b);

        char c = 'a';
        char cc = 3456;
        System.out.println(c);
        System.out.println(cc);

        User user = new User();
        System.out.println(user);
    }

}

