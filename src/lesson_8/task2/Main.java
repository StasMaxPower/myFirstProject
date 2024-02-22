package lesson_8.task2;

import lesson_8.task1.task2.Animal;

public class Main {

    public static void main(String[] args) {
        lesson_8.task1.task2.Animal[] animals = new lesson_8.task1.task2.Animal[10];
        Animal cat1 = new Cat();
        Animal cat2 = new Cat();
        Cat cat3 = new Cat();

        Animal dog1 = new Dog();
        Animal dog2 = new Dog();
        Dog dog3 = new Dog();

        //Animal animal = new Animal();
       // animal = new Cat();

        animals[0] = cat1;
        animals[1] = cat2;
        animals[2] = cat2;
        animals[3] = dog1;
        animals[4] = dog2;
        animals[5] = dog2;

        for (lesson_8.task1.task2.Animal animal1 : animals) {
            if(animal1 instanceof Cat){
                ((Cat)animal1).say();
            }
            if(animal1 instanceof Dog){
                ((Dog)animal1).say();
            }
        }



    }




}
