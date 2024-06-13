package lesson_19.task1;

public class Car {

    private String vendor;
    private String color;
    private Engine engine;

    public Car(String vendor, String color, int horsePower, String type) {
        this.vendor = vendor;
        this.color = color;
        engine = new Engine(horsePower, type);
    }
    public Car(String vendor, String color) {
        this.vendor = vendor;
        this.color = color;
    }

    public  void printInfo(){
        System.out.println("Характеристики автомобиля");
        System.out.println("Производитель " +vendor);
        System.out.println("Цвет "+color);
        System.out.println("Мощность " + engine.horsePower);
    }

    public void setEngine(Engine engine) {
        this.engine=engine;
    }


    public static class Engine{
        private int horsePower;
        private String type;

        public Engine(int horsePower, String type) {
            this.horsePower = horsePower;
            this.type = type;
        }


        public void printInfo(){
          //  System.out.println("Цвет" + color);
        }
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vendor='" + vendor + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
