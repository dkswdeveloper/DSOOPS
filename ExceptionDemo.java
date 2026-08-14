import java.util.Scanner;
public class ExceptionDemo {
    public static void main(String[] args) {
        // String first = "aaabbcmma";
        // int[] freq = new int[26];
        // for(int i =0; i<first.length(); i++)
        // {
        // char ch = first.charAt(i);
        // freq[ch - 'a']++;
        // }
        // read a valid integer from system.in
        // sample input
        // abd 45ab ab56
        // 45
        // Ouput: 45
        // wrong right
        // java
        // 56 hello
        // Output : 56
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt() == false) {
            sc.next(); // read a string and discard it as it is not integer
        }
        int x = sc.nextInt();
        System.out.println(x);
        sc.close();
    }
}
