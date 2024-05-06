package new_javaAdvance;

public class MyRunnable implements Runnable {
 // override run
	
    @Override
    public void run() {
        // logic
        // 1/5

        for (int i = 1; i <= 5; i++) {
            System.out.println("thread: "+Thread.currentThread().getID + " count: " + i);
        }
    }
}


