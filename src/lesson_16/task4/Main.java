package lesson_16.task4;

import lesson_16.task4.Info;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //<?> - любой тип
        //<? extends X> - метод может работать с любым типами- наследниками X
        //<? super X> - метод может работать с любым типами- предками X
        //<T extends Animal> - метод может работать с любым типами- предками X

        Info<String> infoString = new Info<>();
        List<String> listString = new ArrayList<>();
        listString.add("Hi");
        listString.add("Hello");
        listString.add("Hello world");

        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(2);

        infoString.printElements(listInteger);
        infoString.printElements(listString);

        infoString.sumElements(listInteger);






    }
}
