package lesson_16.task4;

import java.util.List;

public class Info<E> {

    private E value;

    public Info(E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    public Info() {
    }

    public void setValue(E value) {
        this.value = value;
    }

    public void printElements(List<?> list) {
        for (Object object : list) {
            System.out.println(object);
        }

    }

    public void sumElements(List<? extends Number> list) {
        double sum = 0;
        for (Number object : list) {
            sum = sum + object.doubleValue();
        }
        System.out.println(sum);

    }

}

