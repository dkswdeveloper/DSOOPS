import java.util.Arrays;
import java.util.Scanner;
class Solution 
{
 public static long getMinInteger(long n) {
        if (n == 0) {
            return 0;
        }

        // Count frequency of each digit (0-9)
        int[] count = new int[10];
        String s = String.valueOf(n);
        for (char c : s.toCharArray()) {
            count[c - '0']++;
        }

        StringBuilder sb = new StringBuilder();

        // 1. Find the smallest non-zero digit to place first (avoids invalid leading zeros)
        for (int i = 1; i <= 9; i++) {
            if (count[i] > 0) {
                sb.append(i);
                count[i]--;
                break;
            }
        }
        // 3. Append the remaining digits in ascending order
        for (int i = 0; i <= 9; i++) {
            while (count[i] > 0) {
                sb.append(i);
                count[i]--;
            }
        }

        return Long.parseLong(sb.toString());
    }
}
public class MinimumIntegerFromDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part 1: Interactive input from Scanner
            long inputNum = scanner.nextLong();
           
                long result = Solution.getMinInteger(inputNum);
                System.out.println(result);
        
        scanner.close();
    }
}


// Part 2: Test the function on 7 different integers
        // long[] testCases = { 5032, 205, 90812, 4005, 7, 34201, 52910 };

        // System.out.println("Running tests on 7 different integers:");
        // for (int i = 0; i < testCases.length; i++) {
        //     long testVal = testCases[i];
        //     long minVal = getMinInteger(testVal);
        //     System.out.println("Test " + (i + 1) + ": Original = " + testVal + " --> Minimum Integer = " + minVal);
