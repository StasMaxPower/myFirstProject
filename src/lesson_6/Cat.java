package lesson_6;

public class Cat {

    private int legsCount = 4;

    private void sayMeow(){
        System.out.println("Мяу!");
    }

    public String feedCat(int feed) {
        if (feed < 10) {
            return "Котик голоден";
        } else {
            return "Котик сытый";
        }

    }

}
