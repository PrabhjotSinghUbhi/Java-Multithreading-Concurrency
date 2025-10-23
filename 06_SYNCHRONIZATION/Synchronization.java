
class Synchronization {

    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.print("Counter Value : " + counter);

    }

    public synchronized static  void increment() {
        counter++;
    }
}

/*
 * Inconsistency due to race conditions.
 * That is causing the inconsistency in the value of counter.
 */

 /*
  * increment is a shared resource both the threads are accessing it in the same time.
  * These kind of scenarios cause inconsistencies. -> Race Condition.
 */

 /*
 * Solution to this kind of problem is Synchronized Keyword of block.
 * -> this block restrict the access of the recourse to only one thread at a time.
 * -> meaning only one thread can access this resource.
 */
