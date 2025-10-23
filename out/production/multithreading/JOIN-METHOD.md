# The join() Method

---

## Overview of join()

### What is the join() Method?

- The `join()` method in Java is used to pause the execution of the current thread until
  another thread has completed its execution.

### Why Use join()?

- It is useful when you want to ensure that a particular thread has finished before
  proceeding with the execution of subsequent code.

### How to Use join()

- You can call the `join()` method on a thread instance. This will make the current
  thread wait until the thread on which `join()` was called has finished executing.

### Example of join() Method

```java
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        try {
            thread.join(); // Main thread waits for MyThread to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("MyThread has finished execution.");
    }
}
```

### Output of the Example

```bash
1
2
3
4
5
MyThread has finished execution.
```

### Important Notes

- The `join()` method can throw an `InterruptedException`, so it must be called within a try-catch block.
- If the thread that is being joined is interrupted while waiting, the current thread will also be interrupted.
- It is a good practice to handle interruptions properly, either by restoring the interrupted status or by handling the exception in a way that makes sense for your application.

### Variants of join()

- `join(long millis)`: Waits for the thread to die for a specified number of milliseconds.
- `join(long millis, int nanos)`: Waits for the thread to die for a specified number of milliseconds plus nanoseconds.

### Summary

- The `join()` method is a powerful tool for managing thread execution order in Java, ensuring
  that one thread completes before another continues.
