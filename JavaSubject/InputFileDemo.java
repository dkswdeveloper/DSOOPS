import java.util.Scanner;

public class InputFileDemo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 0 ; i<n; i++)
        {
            int x = sc.nextInt();
            System.out.println(x);
        } 
    }
}
