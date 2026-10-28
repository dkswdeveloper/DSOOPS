// Thread Safe class 
class Printer {
    // synchronized
    public void print(String msg) {
        System.out.print("[");
        System.out.print(msg);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        System.out.print("]");
    }
}
class MessagePrinterThread extends Thread {
    String message;
    Printer printer;

    public MessagePrinterThread(Printer printer, String message) {
        this.printer = printer;
        this.message = message;
    }

    public void run() {
        // synchronized block
        synchronized (printer) {
            printer.print(message);
        }
    }
}
public class SyncDemo {
    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer();
        MessagePrinterThread t1 = new MessagePrinterThread(printer, "Java");
        MessagePrinterThread t2 = new MessagePrinterThread(printer, "DBMS");
        t1.start();
        t2.start();
        // wait for both the threads to finish
        // System.out.println("main waiting for threads to finish");
        t1.join();
        t2.join();
        // System.out.println("All done bye bye");
    }
}