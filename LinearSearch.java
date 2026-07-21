import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        // Read n , the number of integers in array.
        // read n integers in the array
        // read x, the the number to search
        // print the index at which found else -1
        // Scanner sc = new Scanner(System.in);
        // System.out.println("ennter number of elements ");
        // int n = sc.nextInt();
        // int[] ar = new int[n];
        // System.out.println("enter elements ");
        // for (int i = 0; i < n; i++) {
        // ar[i] = sc.nextInt();
        // }
        // System.out.print("enter element to search : ");
        // int x = sc.nextInt();
        // int index = linearSearch(ar, x);
        // System.out.println(index);
        performLinearSearch();
    }

    public static void performLinearSearch() {
        int a[] = { 1, 2, 3, 1, 2, 3, 4 };
        int x = 3;
        int i;
        boolean flag = false;
        for (i = 0; i < a.length; i++) {
            if (a[i] == x) {
                System.out.println("Found at " + i);
                flag = true;
                break;
            }
        }
        if (flag == false)
            System.out.println("Not found");

    }

    public static int linearSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x)
                return i;
        }
        return -1;
        /*
         * Write a function to do linear search.
         * Function search(int a[], int x) which returns
         * the index on which x is found in array. Otherwise return -1.
         */
    }

    public static boolean checkSorted(int a[]) {
        // if sorted array : return true
        // else return false
        // 1 2 6 7 8 9 10 7 3 4
        // if( a0 < a1 ) OK else Not Sorted break the loop
        // if(a1 < a2) OK else finish
        // if(a2 < a3 ) OK else
        // .....
        // if(a[n-2] < a[n-1]) OK else not sorted
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] <= a[i + 1]) { // do nothing
            } else
                return false;
        }
        return true;
    }

    public static void replaceAllBothSides(int a[], int x, int y) {
        // replace all x with y and all y with x
        // 1 2 3 4 2 6 7 8 => replace 2 with 8
        // 1 8 3 4 8 6 7 2
    }

    public static void rotateArray(int a[]) {
        // 4 5 6 7 8 9 => right shift / Rotate
        // 9 4 5 6 7 8
    }
}
