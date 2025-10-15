
public class ExtendThread {

    public static void main(String[] args) {
        Thread t1 = new MyThread();
        Thread t2 = new MyThread2();
        t1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Valar Mogulis");
        }
        t2.start();
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println("In my thread : " + i);
        }
    }
}

class MyThread2 extends Thread {

    @Override
    public void run() {
        
        for (int i = 10; i < 25; i++) {
            System.out.println("In my thread 2 : " + i);
        }
    }
}
