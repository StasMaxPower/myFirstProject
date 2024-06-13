package lesson_22.task1;

public class MyThread2 implements Runnable{


    @Override
    public void run() {
        for (int i = 1000; i < 1010; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        Thread.currentThread().setName("Thread 2");

        System.out.println("Поток завершил работу "+Thread.currentThread().getName());

    }
}
