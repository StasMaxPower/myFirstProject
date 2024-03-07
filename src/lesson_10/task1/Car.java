package lesson_10.task1;

public class Car implements Swim{

    public int wheelsCount = 4;
    @Override
    public void swim() {
        System.out.println("Машина плывет");
    }
}
