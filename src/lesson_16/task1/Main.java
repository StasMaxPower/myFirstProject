package lesson_16.task1;

public class Main {

    public static void main(String[] args) {

        Info<Integer> infoInteger = new Info<>(1);
        Info<String> infoString = new Info<>("Hi");

        Integer value = infoInteger.getValue();

        String a = "Hello";
        String b = "Hello world";
        a = b;

       // infoInteger = infoString;

        Cat cat = new Cat();
        LandAnimal landAnimal = cat;

        Info<LandAnimal> landAnimalInfo= new Info<>();
        Info<Cat> catInfo= new Info<>();

       // landAnimalInfo = catInfo;






    }

}
