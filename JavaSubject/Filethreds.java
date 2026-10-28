import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
class WordCounter extends Thread {
    String file;
    int count = 0;

    public WordCounter(String file) {
        this.file = file;
    }

    public void run() {
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            int count = 0;
            while (line != null) {
                if (line.contains("System"))
                    count++;
                line = br.readLine();
            }
            this.count = count;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
public class Filethreds {
    public static void main(String[] args) {
        String names[] = { "ArrayQuestions.java", "CopyConstructor.java", "Filethreads.java" };
        List<WordCounter> list = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            WordCounter adder = new WordCounter(names[i]);
            adder.start();
            list.add(adder);
        }
        for (Thread thread : list) {
            try {
                thread.join(); // caller thread will wait for thread to finish
            } catch (InterruptedException e) {
            }
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(list.get(i).count);
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
