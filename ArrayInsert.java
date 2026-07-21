import java.util.Scanner;

public class ArrayInsert {
    public static void main(String[] args) {
        int n;
        System.out.println("enter number of integers");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int index, x;
        System.out.println("enter index and number to enter");
        index = sc.nextInt();
        x = sc.nextInt();
        // YOUR LOGIC HERE
        for (int i = n; i > index; i--) {
            a[i] = a[i - 1];
        }
        a[index] = x;

        n++;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("enter the index to delete");
        index = sc.nextInt();
        // your logic to delete the element at index
        for (int i = index; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        n--;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("how many numbers");
        n = sc.nextInt();
        System.out.println("enter n sorted integers");
        a = new int[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter number to insert in sorted array");
        x = sc.nextInt();
        // your logic here to insert the number in sorted array
        n++;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        // int [] ar = { 2,3,5,7,11,13, 0,0,0,0,0,0,0};
        // appendPrime(ar);
        // { 2,3,5,7,11,13, 17,0,0,0,0,0,0};
    }
}