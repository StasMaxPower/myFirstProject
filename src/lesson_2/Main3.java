package lesson_2;

public class Main3 {
    public static void main(String[] args) {
        // Даны 3 стороны треугольника. Вывести в консоль какой это треугольник: равносторонний, равнобедренный, разносторонний

        int sideA = 1;
        int sideB = 3;
        int sideC = 3;

        // равносторонний a==b, b==c;
        if ((sideA == sideB) && (sideB == sideC)) {
            System.out.println("Это равносторонний треугольник");
        } else if ((sideA != sideB)
                && (sideB != sideC)
                && (sideA != sideC)) {
            System.out.println("Это разносторонний треугольник");
        } else {
            System.out.println("Это равнобедренный треугольник");
        }

        System.out.println("Конец программы");


/*        int a = 5;
        if (a > 10) {
            System.out.println("а больше 5");
        }
        */

/*        int a = -2;


        if (a == 0) {
            System.out.println("а равно 0");
        } else if (a > -1) {
            System.out.println("а больше 0");
        } else{
            System.out.println("а больше 0");
        }*/
    }


}
