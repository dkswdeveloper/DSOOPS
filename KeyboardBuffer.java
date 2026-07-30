import java.util.Scanner;

public class KeyboardBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st integer ");
        int x = sc.nextInt();
        System.out.println("enter 2nd integer ");
        int y = sc.nextInt();
        System.out.println("You entered " + x + "," + y);
        sc.close();
    }
}
