package lesson_22;

public class DeadlockExample {
    private static final int TRIES = 100;

    public static void main(String[] args) {
        Object chest = new Object();
        Object key = new Object();

        Thread jack = new Thread(() -> {
            for (int i = 0; i < TRIES; i++) {
                synchronized (chest) {
                    System.out.println("Джек захватил сундук");
                    synchronized (key) {
                        System.out.println("Джек захватил ключ");
                        System.out.println("Джек: йо-хо-хо, сокровище теперь моё!");
                        System.out.println("---");
                    }
                }
            }
        });
        Thread bill = new Thread(() -> {
            for (int i = 0; i < TRIES; i++) {
                synchronized (chest) {
                    System.out.println("Билл захватил ключ");
                    synchronized (key) {
                        System.out.println("Билл захватил сундук");
                        System.out.println("Билл: йо-хо-хо, сокровище теперь моё!");
                        System.out.println("---");
                    }
                }
            }
        });

        jack.start();
        bill.start();
    }
}