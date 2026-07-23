import java.util.Scanner;

public class MaxLenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        String maxStr = null;
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            if (word.length() > max) {
                maxStr = word;
                max = maxStr.length();
            }
        }
        System.out.println(maxStr);
        sc.close();

    }
}

// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// String[] ar = new String[n];
// for (int i = 0; i < n; i++) {
// ar[i] = sc.next();
// }
// int max = 0;
// String maxStr = null;
// for (int i = 0; i < n; i++) {
// if (ar[i].length() > max) {
// maxStr = ar[i];
// max = maxStr.length();
// }
// }
// System.out.println(maxStr);
// sc.close();
