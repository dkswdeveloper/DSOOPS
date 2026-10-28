// Method 1 : Extend the Thread class
class ChildThread extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("child " + i);
        }
    }
}
// Implement Runnable interface
class Childthread2 implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("child2 " + i);
        }
    }
}
public class MultiThreading {
    public static void main(String[] args) {
        System.out.println("current Thread:" + Thread.currentThread());
        ChildThread obj = new ChildThread();
        // obj.run() ; no advantage of multi threading
        obj.start(); // it will call run() in new thread and return
        Childthread2 runnableObj = new Childthread2();
        // runnableObj.run(); // not adv
        Thread t2 = new Thread(runnableObj);
        t2.start();
        for (int i = 1; i <= 100; i++) {
            System.out.println("main " + i);
        }
    }
}
