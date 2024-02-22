package Lesson_7;

public class Cat {

   private static Cat instance;

    public static Cat getInstance() {
        if (instance == null) {
            instance = new Cat();
        }
        return instance;
    }

    private Cat() {
    }

}
