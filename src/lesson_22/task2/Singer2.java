package lesson_22.task2;

public class Singer2 extends Thread {

    @Override
    public void run() {
        while (true) {
            synchronized (Monitor.MICROPHONE) {
                try {
                    Monitor.MICROPHONE.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }


                for (int i = 0; i < 3; i++) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("++++++++++++++++++++++++++++");
                }

                synchronized (Monitor.MICROPHONE) {
                    Monitor.MICROPHONE.notify();
                }

            }


        }
    }
}
