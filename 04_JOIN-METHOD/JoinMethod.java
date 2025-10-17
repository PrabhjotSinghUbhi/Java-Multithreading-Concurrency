
public class JoinMethod {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("its t1");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Its t2");
            }
        });

        /* 
        the main thread is the parent thread, the output of the following code is that the starting and ending statements will be printed first and then the t1 and t2 will start. Why is that, it is because the main thread , t1 thread and t2 thread are running independent of each other, when t1.start() and t2.start() is called both threads come in running state, but the main thread has the highest priority right now so the first and last statement run first followed by  t1 and t2. 
         */
 /*
            System.out.println("Starting the thread...");
            t1.start();
            t2.start();
            System.out.println("Ending the thread execution...");
         */
        //using join method on t2, the main thread will wait till the t2 thread is completed execution.
            System.out.println("Starting the thread...");
            t1.start();
            t2.start();
            try {
                t1.join();
                t2.join();
            } catch (InterruptedException ie) {
                throw new Error("Got interrupted again.." + ie.getMessage());
            } catch (Exception e) {
                throw new Error("Other Exception Occurred.");
            } finally{
                System.out.println("Not Problem Occurred.");
            }

            System.out.println("Ending the thread execution...");

    }
}
