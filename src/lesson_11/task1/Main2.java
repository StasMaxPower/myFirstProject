package lesson_11.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        numbers.add(11);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
            if(numbers.get(i) == 7){
                numbers.remove(i);
            }
           // numbers.add(100);
        }

/*        for (Integer number : numbers) {
            System.out.println(number);
            numbers.remove(number);
        }*/

/*        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            System.out.println(number);
            if (number == 9) {
                iterator.remove();
            }
        }*/

        System.out.println(numbers);

    }

}
