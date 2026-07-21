import java.util.Scanner;

public class Max {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 2 integers");
        int x = input.nextInt();
        int y = input.nextInt();
        if (x > y)
            System.out.println(x);
        else
            System.out.println(y);
        int result = max2(x,y);
        System.out.println("max = " + result);

    }
    public static int max2(int a, int b)
    {
		if(a > b) return a;
		else return b;
	}

}
