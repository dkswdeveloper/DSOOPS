import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionBaiscs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x / y;
            System.out.println("quotient = " + z);
            try {
                System.out.println("enter a password");
                String pwd = sc.next();
                if (pwd.length() < 6) {
                    Exception obj = new Exception("short password");
                    throw obj;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero not allowed. Please give nonzeoro value");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("please enter integers only ");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("some exception occured");
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        } finally {
            System.out.println("closing the scanner");
            sc.close();
        }
        System.out.println("after catch continue with program");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public int linearSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x)
                return i;
        }
        return -1;
    }

    public static void dummyThrows() throws ClassNotFoundException, SQLException, Exception {
        ClassNotFoundException clEx = new ClassNotFoundException();
        if (Math.random() < 0.3)
            throw clEx;
        SQLException sqlEx = new SQLException();
        if (Math.random() < 0.5)
            throw sqlEx;
        Exception ex = new Exception();
        if (Math.random() < 0.5)
            throw ex;
        if (Math.random() < 0.5) throw new NullPointerException();
        if(Math.random() < 0.5) throw new InputMismatchException();
    }

    // throws
    public static void printFile(String fileName) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader(fileName); // it throws
                                                  // FileNotFoundException
        Scanner sc = new Scanner(fr);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
        fr.close();
    }
}
