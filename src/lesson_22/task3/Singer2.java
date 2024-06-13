package lesson_22.task3;

public class Singer2 extends Thread {

    @Override
    public void run() {

        synchronized (Monitor.MICROPHONE){
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("++++++++++++++++++++++++++++");
            }

        }
        /*

        while (true) {
            synchronized (Monitor.MICROPHONE) {
                try {
                    Monitor.MICROPHONE.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }




                synchronized (Monitor.MICROPHONE) {
                    Monitor.MICROPHONE.notify();
                }

            }


        }*/
    }
}
