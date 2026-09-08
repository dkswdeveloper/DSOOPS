import java.util.Scanner;
public class ThrowThrows {
    public static void main(String[] args) throws Exception {
        int x;
        Scanner sc = new Scanner(System.in);
        x = readInt(sc);
        System.out.println(x);
    }

    private static int readInt(Scanner sc) throws Exception {
        try {
            while (!sc.hasNextInt()) {
                sc.next();
            }
            int x = sc.nextInt();
            return x;
        } catch (Exception e) {
            throw e;
        }
    }
}
