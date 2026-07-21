import java.util.Scanner;

public class Hello {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter int double and string ");
        int value = scanner.nextInt();
        double dbl = scanner.nextDouble();
        String name = scanner.next();
        System.out.println("values entered " + value + "," + dbl + "," + name);
        System.out.println("enter 1 more integer for even checking");
        int x = scanner.nextInt();
        boolean result = isEven(x);
        System.out.println("x is even " + result);
        System.out.println("new value of x " + x);

        scanner.close();
    }

    public static boolean isEven(int x) {
        x = x + 10;
        if (x % 2 == 0)
            return true;
        else
            return false;
    }

}