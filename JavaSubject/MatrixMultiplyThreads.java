import java.util.ArrayList;
import java.util.List;
class RowAdder extends Thread {
    int[][] a, b, c;
    int row;
    public RowAdder(int[][] a, int[][] b, int[][] c, int row) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.row = row;
    }
    public void run() {
        // add only one row and put answer in c
        Thread thread = Thread.currentThread();
        thread.setPriority(6);
        thread.setName("Thread" + row);
        System.out.println(getName() + " thread is running with priority " +
        getPriority());
        System.out.println();
        for (int j = 0; j < 4; j++) {
            c[row][j] = a[row][j] + b[row][j];
        }
    }
}
public class MatrixMultiplyThreads {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread);
        mainThread.setName("Main Thread");
        System.out.println(mainThread);
        int[][] a = { { 1, 2, 3, 4 }, { 2, 3, 1, 0 }, { 1, 2, 3, 4 }, { 4, 3, 2, 1 } };
        int[][] b = { { 2, 3, 4, 5 }, { 2, 3, 0, 2 }, { 1, 2, 3, 1 }, { 4, 3, 2, 6 } };
        int[][] c = new int[4][4];
        int r1 = 4, c1 = 4;
        int r2 = 4, c2 = 4;
        List<RowAdder> list = new ArrayList<>();
        for (int i = 0; i < r1; i++) {
            RowAdder adder = new RowAdder(a, b, c, i);
            adder.start();
            list.add(adder);
        }
        for (RowAdder adder : list) {
            while (adder.isAlive()) {
                // do nothing
                Thread.yield(); // static method that leaves processor once
            }
        }
        for (RowAdder adder : list) {
            // caller thread blocks and waits for the thread to finish
            try {
                adder.join();
            } catch (InterruptedException e) {
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*
 * String[] names = { "Hello.java", "Box.java", "Inheitance.java",
 * "MultiThread.java"}; CounteThread counter = new CounterThread(names[i]);
 * counter.start(); // it will open the file using BR and count the word
 * "System" Then print total number of times System occurs in the files
 * 
 */
