package lesson_5;

public class Main1 {
    public static void main(String[] args) {
        //с помощью 2-мерного массива нарисовать шахматную доску
        // чернные клеточки нарисовать с помощью 1, белые с помощью 0

        int[][] c = new int[8][8];

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    c[i][j] = 1;
                }
            }
        }


        for (int i = 0; i < c.length; i++) {
            int[] d = c[i];
            for (int j = 0; j < d.length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}
