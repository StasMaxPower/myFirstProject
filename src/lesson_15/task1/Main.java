package lesson_15.task1;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();

        try {
            person.setAge(20);
            System.out.println("Возраст корректно установлен");

        } catch (NumberFormatException e) {
            System.out.println();
          //  System.out.println("Возраст не может быть более 100");
        } catch (Throwable e) {
            System.out.println("Возраст не может быть менее 16");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("Внутри блока finally");
        }

        //1. Если в блоке try-catch есть команда Sstem.exit();
        //2. Аварийное завершение работы программы
        //3. Если программа попала в бесконечный цикл в блоке try
        //4. Когда в try выполняется фоновый поток, при этом программа завершается в основном потоке

/*        }


/*        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("Возраст не может быть менее 16");
            e.printStackTrace();*/
/*        } catch (ArithmeticException e) {
            System.out.println("Возраст не может быть более 100");
        }*/

        System.out.println("После блока catch");
    }

}
