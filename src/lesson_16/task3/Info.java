package lesson_16.task3;

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
}

