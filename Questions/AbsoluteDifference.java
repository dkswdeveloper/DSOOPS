package Questions;
import java.util.Scanner;

class Employee {
    int empid;
    int experience;
    String name;

    public Employee() {

    }
}

public class AbsoluteDifference {
    public static void main(String[] args) {
        int x;
        int y = 0;
        for (x = 1; x <= 10; x++) {
            y++;
        }
        System.out.println(x + y);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = sc.nextInt();
        int maxdiff = 0;
        for (int i = 1; i < n; i++) {
            int next = sc.nextInt();
            int diff = Math.abs(prev - next);
            if (diff > maxdiff)
                maxdiff = diff;
            prev = next;
        }
        System.out.println(maxdiff);
        sc.close();
    }
}
