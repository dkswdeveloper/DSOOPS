package Questions;
import java.util.Scanner;

public class DigitSort {
    public static int firstDigit(int n) {
        while (n > 9) {
            n = n / 10;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < a.length; j++) {
                if (firstDigit(a[j]) == i)
                    System.out.print(a[j] + " ");
            }
        }
        sc.close();
    }
}
