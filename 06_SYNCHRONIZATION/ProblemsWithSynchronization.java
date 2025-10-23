
public class ProblemsWithSynchronization {

    public static void main(String[] args) {

    }
}
/*
 * Monitor Lock / Intrinsic Lock
 * -> Each Object in java is associated with a monitor -> which is mutual exclusion mechanism used to achieve synchronization
 * -> when a thread tries to access the synchronized block or method it tries to access monitor lock associated with object.
 */

 /*
  * Since it blocks any other thread to access it, it causes concurrency issues and performance bottlenecks.
  * When you need to just synchronize some section of the code not the whole methods.
  * when a sub class is 
 */
