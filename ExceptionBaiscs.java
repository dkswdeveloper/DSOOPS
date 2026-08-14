import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionBaiscs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("enter 2 integers");
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (y == 0) {
                Exception obj = new Exception("Take care:divisor is zero");
                throw obj;
            }
            int z = x / y;
            System.out.println("quotient = " + z);
        } catch (InputMismatchException e) {
            System.out.println("Please enter integers only ");
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero not allowed");
        } catch (Exception e) {
            System.out.println("some exception occured");
            System.out.println(e.getMessage());
            System.out.println(e);
        } finally {
            System.out.println("closing the scanner");
            sc.close();
        }
        System.out.println("After try catch let us continue");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        sc.close();
    }

    public int linearSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x)
                return i;
        }
        return -1;
    }
}
