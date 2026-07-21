package Questions;
import java.util.Scanner;

public class LargerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int max = (x > y ? x : y);
        int sum = x + y;
        int ans = max > sum ? max + 10 : sum + 10;
        System.out.println(ans);
        sc.close();
    }
}
