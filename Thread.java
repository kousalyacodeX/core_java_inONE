package new_javaAdvance;

public class Thread {

    public static void main(String[] args) {
        // Create instances of MyThread
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
