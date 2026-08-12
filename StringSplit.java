import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class StringSplit {
    public static void main(String[] args) {
        /*
         * Q1. Read a line with name:marks;name:marks;name:marks Print the nanme
         * with max marks sachin:34;geeta:85;rajesh:44;harshit:98;deepak:56
         * 
         * 
         * Q2. Sort an array of strings as per dictinary order this apple Is not
         * Good apple Good Is not this
         * 
         * Q3. From the digits of a given integer, create a smallest possible
         * integer e.g. 30540 => 30045 will be smallest 0 can not start the
         * integer
         * 
         * q4. Read a line and print each word reversed 
         * this is a good example
         * siht si a doog elpmaxe
         * 
         */
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String details[] = line.split(";");
        String maxName = "";
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < details.length; i++) {
            int index = details[i].indexOf(":");
            String name = details[i].substring(0, index).trim();
            String marks = details[i].substring(index + 1).trim();
            // sachin : 44 ;
            // String [] parts = details[i].split(":");
            // name = parts[0].trim();
            // marks = parts[1].trim();
            int m = Integer.parseInt(marks);
            if (m > max) {
                max = m;
                maxName = name;
            }
        }
        System.out.println(maxName);
        sc.close();
        // Method 1:
        String[] ar = { "harshit", "This", "is", "Not", "Fun", "practice" };
        for (int i = ar.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (ar[j].compareToIgnoreCase(ar[j + 1]) > 0) {
                    String t = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = t;
                }
            }
        }
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        // Method 2:
        class MyComparator implements Comparator<String> {
            public int compare(String s1, String s2) {
                return s1.compareToIgnoreCase(s2);
            }
        }
        Arrays.sort(ar, new MyComparator());
        System.out.println(Arrays.toString(ar));
        // Question 3
        int n = 9850027;
        String nAsString = "" + n;
        char[] digitsAr = nAsString.toCharArray();
        Arrays.sort(digitsAr);
        // SEARCH FOR FIRST NON ZERO ELEMENT
        int pos = 0;
        while (pos < digitsAr.length - 1 && digitsAr[pos] == '0') {
            pos++;
        }
        char temp = digitsAr[0];
        digitsAr[0] = digitsAr[pos];
        digitsAr[pos] = temp;
        String ans = new String(digitsAr);
        System.out.println(ans);
    }
}