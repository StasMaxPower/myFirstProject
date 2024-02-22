package lesson_5;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        int[] a = new int[10];
        int[][] b = new int[8][8];

        int[][] c = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        for (int i = 0; i < c.length; i++) {
            int[] d = c[i];
            for (int j = 0; j < d.length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }


        //написать программу , которая должна работать 10 лет
        // при этом должна отображатт сколько прошло секунд с момента запуска
        // лет, месяцев  дней и часов

        for (int year = 0; year <= 10; year++) {
            for (int month = 0; month <= 12; month++) {
                for (int day = 0; day <= 30; day++) {
                    for (int hour = 0; hour <= 24; hour++) {
                        for (int min = 0; min <= 60; min++) {
                            for (int sec = 0; sec <= 60; sec++) {
                                System.out.printf("С момента запуска программы прошло " +
                                                "%d лет, %d месяцев, %d дней, %d часов, %d минут, %d секунд\n",
                                        year, month, day, hour, min, sec);
                            Thread.sleep(1000);
                            }
                        }
                    }
                }
            }
        }
    }
}
