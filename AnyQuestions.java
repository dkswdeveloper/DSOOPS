import java.util.Scanner;

public class AnyQuestions {
    public static void main(String[] args) {

        int ar[] = { 33, 534, 64, 7 };
        int freq[] = new int[10]; // { 0 0 0 0 0 0 0 0 0 0 0 }
        for (int n : ar) {
            while (n > 0) {
                int rem = n % 10;
                freq[rem]++;
                n = n / 10;
            }
        }

        // Read n, read n integers and print the fiest digit of every integer
        // Read n, read n strings and print the palindromes from all of them
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            if (palindrome(a[i]))
                System.out.println(a[i]);
        }
    }

    public static void addOneEachDigit(int n) {
        int x = 345;
        String xAsStr = "" + x;
        int xBack = Integer.parseInt(xAsStr);

        String str = ""; // 4597 => 5608 (0032 => 1143 Not done)
        while (n > 0) {
            int rem = n % 10;
            rem = rem + 1;
            if (rem == 10)
                rem = 0;
            str = rem + str;
            System.out.print(rem);
            n = n / 10;
        }
    }

    public static boolean palindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) == str.charAt(n - 1 - i))
                continue;
            else
                return false;
        }
        return true;
    }

}
