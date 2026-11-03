import java.util.Random;
class Q {
    int value;
    boolean valueSet = false;

    synchronized public void put(int x) {
        if (valueSet) { // value is already there
            try {
                wait(); // leaves the monitor and blocks untill consumer wakes
                        // it
                        // up
                System.out.println("producer wakes up");
            } catch (InterruptedException e) {
            }
        }
        value = x;
        valueSet = true;
        System.out.println("PUT " + x);
        notify();
    }

    synchronized public void get() {
        if (!valueSet) { // q is empty
            try {
                wait(); // consumer will sleep until producer wakes it up
                System.out.println("consumer wakes up");
            } catch (InterruptedException e) {
            }
        }
        System.out.println("GOT " + value);
        valueSet = false;
        notify();
    }
}
class Producer extends Thread {
    Q q;

    public Producer(Q q) {
        this.q = q;
    }

    public void run() {
        int i = 1;
        while (true) {
            int time = new Random().nextInt(5000) + 1000;
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
            }
            System.out.println("Produer going to put");
            q.put(i++);
        }
    }
}
class Consumer extends Thread {
    Q q;

    public Consumer(Q q) {
        this.q = q;
    }

    public void run() {
        while (true) {
            System.out.println("Consumer waiting to get ");
            q.get();
            int time = new Random().nextInt(5000) + 3000;
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
            }
        }
    }
}
class ProducerConsumer {
    public static void main(String[] args) {
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
        p.start();
        c.start();
    }
}