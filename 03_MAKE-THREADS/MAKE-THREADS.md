# Making Threads in Java

In Java, you can create threads in two primary ways: by extending the `Thread` class or by implementing the `Runnable` interface. Below are examples of both methods.

## Method 1: Extending the Thread Class

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}


public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
```

## Method 2: Implementing the Runnable Interface

```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
```
