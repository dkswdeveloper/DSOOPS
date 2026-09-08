import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        String str = "abc45def8";
        Scanner sc = new Scanner(str);
        sc.useDelimiter("");
        while (sc.hasNext()) {
            String word = sc.next("[a-zA-Z]");
            String freq = "1";
            if (sc.hasNext("\\d"))
                freq = sc.findInLine("\\d+");   
            System.out.println(word + ":" + freq);
        }
    }
}
