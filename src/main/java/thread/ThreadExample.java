package thread;

public class ThreadExample {
    private static int sharedCounter = 0;

    public static void main(String[] args) {
        CustomThread thread1 = new CustomThread("Thread-1");
        CustomThread thread2 = new CustomThread("Thread-2");
        thread1.start();
        thread2.start();

        Thread runnableThread1 = new Thread(new CustomRunnable("Runnable-Thread-1"));
        Thread runnableThread2 = new Thread(new CustomRunnable("Runnable-Thread-2"));
        runnableThread1.start();
        runnableThread2.start();

        Counter counter = new Counter();
        Thread incrementThread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
            }
        });

        Thread incrementThread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
            }
        });

        incrementThread1.start();
        incrementThread2.start();

        try {
            incrementThread1.join();
            incrementThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Counter Value: " + counter.getCount());
    }


}
