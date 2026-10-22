import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
interface Calc {
    int add(int a, int b);

    int subtract(int a, int b);
}
class MyCalc implements Calc {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
public class SortArray {
    public static void main(String[] args) {
        Calc cal1 = new MyCalc();
        Calc cal2 = new Calc() {
            public int add(int a, int b) {
                return a + b;
            }

            public int subtract(int a, int b) {
                return a - b;
            }
        };
        // read a line and print the words in sorted order of length
        // input : this is a line of words
        // output : a is of this line words
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] words = line.split(" ");
        int n = words.length;
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    String t = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(words));
        Arrays.sort(words); // alphabetically sort
        Comparator<String> comparator = new Comparator<>() {
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };
        Arrays.sort(words, comparator);
        System.out.println(Arrays.toString(words));
        // Read a line and print the integers in sorted order
        // 23 45 77 11 30 60
        // 11 23 30 45 60 77
        line = sc.nextLine();
        words = line.split(" ");
        int[] nums = new int[words.length];
        for(int i = 0 ;i<words.length; i++)
        {
            nums[i] = Integer.parseInt(words[i]);
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
