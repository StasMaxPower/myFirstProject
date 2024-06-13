package lesson_19.task1;

import java.util.HashMap;
import java.util.Map;

public class Main {

    //1. Обычный класс
    //2. Nested - вложенный
    //3. Static nested - статический вложнный класс
    //4. Local nested - локально вложенный класс
    //5. Anonimous - анонимный


    public static void main(String[] args) {
/*        Car car = new Car("Honda", "Black");
        Car.Engine engine = car.new Engine(100, "Diesel");
        car.setEngine(engine);*/

        System.out.println();
       // car.printInfo();

      //  engine.printInfo();

        Car.Engine engine = new Car.Engine(100, "Black");

        for (String arg : args) {
            int x = 0;

        }


    }

}
