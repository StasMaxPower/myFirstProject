package lesson_9.task1;

public class Main {

/*    Применить принципы наследования к сервису расчёта площади фигур, который писали ранее.
    Подумать, какой класс нужно ещё создать, что он должен содержать.
    Для каждой фигуры сделать расчёт периметра.*/

    public static void main(String[] args) {
        //Figura figura = new Figura();
        Krug krug = new Krug(5);
        krug.printPerimetr();

        Oval oval = new Oval(4,5);
        oval.printPerimetr();

    }

}
