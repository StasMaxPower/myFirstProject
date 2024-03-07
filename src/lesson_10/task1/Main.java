package lesson_10.task1;

public class Main {

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.swim();

        Swim duck1 = new Duck();
        duck1.swim();
        
        Swim car = new Car();
        car.swim();
        int wheelsCount = ((Car) car).wheelsCount;


        Swim lebed = new Lebed();
         lebed.swim();

        Swim[] array = {car, duck, lebed};
        
    }

}


