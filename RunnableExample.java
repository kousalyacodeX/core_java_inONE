package new_javaAdvance;

public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create a thread
		MyRunnable runnableobj = new MyRunnable();

		Thread thread1 = new Thread(runnableobj);
		Thread thread2 = new Thread(runnableobj);

        thread1.start();
        thread2.start();
	}

}
