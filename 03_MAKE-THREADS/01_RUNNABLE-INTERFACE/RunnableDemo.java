
public class RunnableDemo {

    public static void main(String[] args) {
        //create the two threads.
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());

        Thread t3 = new Thread(() -> {
            for (int i = 100; i < 199; i++) {
                System.out.println("In Thread 3 : " + i);
            }
        });

        System.out.println("Starting the thread...");
        t1.start();
        t2.start();
        System.out.println("Ending the thread...");
        t3.start();

    }
}

//One of ways to create threads is to implement the run interface and override run method and then pass them into the thread constructor.
class Thread1 implements java.lang.Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("in 1 : " + i);
        }
    }

}

class Thread2 implements java.lang.Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("in 2 : " + i);
        }
    }
}
