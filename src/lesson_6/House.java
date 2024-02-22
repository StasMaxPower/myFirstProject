package lesson_6;

public class House {

    // public - класс или метод может быть виден из любой точки нашей программы
    // private - метод (класс) виден только внутри класса
    // protected - метод (класс) будет виден только внутри нашего пакета и/ или в классах
    // наследниках
    // default (по умолчанию) - non - package - метод или класс ббудет доступен только в пределах
    // данного пакета
    // static - метод внутренний класс, поле
    // final - класс полем методом
    static int wallCount = 4;
    public int windowCount = 5;

    void changeWindowCount() {
        windowCount = 10;
    }

    public static void getInfo() {
        System.out.println("Этот дом из кирпича");
    }

    public int getWallCount() {
        return windowCount * 10;
    }

    void build() {
        System.out.println("Дом построен");
    }


    private class Room {
    }
}

