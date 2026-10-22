import java.util.Arrays;
import java.util.Scanner;
class WrongInputException extends Exception {
}
public class ExceptionDemo {
    public static void main(String[] args) {
        // Write a function that read 3 integers from the
        // given scanner and returns them
        // on failure : throws WrongInputException (new user defined exception)
        Scanner sc = new Scanner(System.in);
        try {
            int[] a = read3Integers(sc);
            for (int x : a) {
                System.out.println(x);
            }
        } catch (WrongInputException e) {
            System.out.println("WrongInputException");
        }
        // print 3 integers that the function has read
    }
    // if a function throws Checked Exception , then there must be throws list
    public static int[] read3Integers(Scanner sc) throws WrongInputException {
        int[] a = new int[3];
        try {
            a[0] = sc.nextInt();
            a[1] = sc.nextInt();
            a[2] = sc.nextInt();
            return a;
        } catch (Exception e) // NullPointerException, NoSuchElement,
        {
            throw new WrongInputException();
        }
    }
}
