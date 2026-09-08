import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.nextLine();
        System.out.println(name);
        String str = sc.next();
        System.out.println(str.length());
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
        str = "Programming";
        System.out.println(str.substring(3));
        System.out.println(str.substring(3, 6));
        System.out.println(str.substring(str.length() - 1));
        System.out.println(str.substring(1, str.length() - 1));

        // Read an integer n, read n strings (next(), nextLine())
        // print the string with max length.

        int n = sc.nextInt();
        sc.nextLine(); // skip the line after n
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            System.out.println(line);
        }

        sc.close();
    }
}
