package lesson_23.task2;

public class Calculator {

    public double div(int a, int b){
        if (b==0){
            throw  new RuntimeException("Делимое не может быть 0");
        }
        return a/b;
    }


    public static void main(String[] args) {
        System.out.println(new Calculator().div(10, 0));
    }
}
