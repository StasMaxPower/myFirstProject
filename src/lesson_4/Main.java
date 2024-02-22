package lesson_4;

public class Main {

    public static void main(String[] args) {

        //вывести в консоль элементы массива в обратном порядке перескакивая через ячейку
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        for (int i = array.length - 1; i >= 0; i -= 2) {
            System.out.println(array[i]);
        }
        System.out.println();


        //создать массив символов и вывести в консоль только гласные буквы
        char[] glasnye = "аоиуеёю".toCharArray();
        char[] symbols = {'в', 'а', 'п', 'о', 'е', 'к', 'у', 'и',};
        for (int i = 0; i < symbols.length; i++) {
            for (int j = 0; j < glasnye.length; j++) {
                if (glasnye[j] == symbols[i]) {
                    System.out.println(symbols[i]);
                }
            }
            // System.out.println(symbols[i]);


        }

        System.out.println();


        //задать массив чисел .вывести поочередно для каждого элемента сумму его значения
        // и соседних элементов справа и слева

        int[] arrayInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arrayInt.length; i++) {
            if (i == 0) {
                System.out.println(arrayInt[i] + arrayInt[i + 1]);
            } else if (i == arrayInt.length - 1) {
                System.out.println(arrayInt[i] + arrayInt[i - 1]);
            } else {
                System.out.println(arrayInt[i] + arrayInt[i - 1] + arrayInt[i + 1]);
            }
        }


        //есть массив содержащий символы q w e r и массив  a b c d
        //обьединить 2 массива в один

        char[] qwer = "qwer".toCharArray();
        char[] abcd = "abcd".toCharArray();
        char[] result = new char[qwer.length + abcd.length];

        for (int i = 0; i < qwer.length; i++) {
            result[i] = qwer[i];
        }

        for (int i = 0; i < abcd.length; i++) {
            result[i+ qwer.length] = abcd[i];
        }
        System.out.println();



    }
}
