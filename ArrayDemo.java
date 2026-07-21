import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int a[] = new int[10];
        int[] b = new int[5];
        int[] c = { 1, 2, 3, 4, 5 };
        System.out.println("enter 10 elements");
        readArray(a);
        printArray(a);

        // readArray(a);
        // printArray(a);
        int max = findMax(a);
        System.out.println(max);
        int countzero = countZeros(a);
        System.out.println(countzero);
        // in one line all odds and in one line all evens are printed
        printOddsAndEvens(a);
        // 1 2 3 8 5 89 5 6 4 87
        // 1 3 5 89 5 87
        // 2 8 6 4

        // shift all zeros to the end of the array
        // 1 0 5 8 0 2 5 6 0 4
        // 1 5 8 2 5 6 4 0 0 0
        shiftZeros(a);
        printArray(a);

        int odds[] = new int[10];
        int evens[] = new int[10];
        // all odd elements in array odds, and even elements in array evens
        separate(a, odds, evens);
        int maxIndex = findMaxIndex(a);
        System.out.println("max element at index " + maxIndex);
        shiftOddsEvens(a);
        // 1 2 5 7 19 13 24 11 46 89
        // 1 5 7 19 13 11 89 2 24 46
        reverse(a);
        // 1 2 5 7 19 13 24 11 46 89
        // 89 46 11 24 13 19 7 5 2 1

    }

    private static void separate(int[] a, int[] odds, int[] evens) {
    }

    private static int findMaxIndex(int[] a) {
        return 0;
    }

    private static void shiftOddsEvens(int[] a) {
    }

    private static void reverse(int[] a) {
    }

    public static void shiftZeros(int[] a) {
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[j] = a[i];
                j++;
            }
        }
        for (int k = j; k < a.length; k++) {
            a[k] = 0;
        }
    }

    private static int countZeros(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0)
                count++;
        }
        return count;
    }

    private static int findMax(int[] a) {
        int maximum = a[0];
        for (int i = 1; i < a.length; i++) {
            if (maximum < a[i]) {
                maximum = a[i];
            }
        }
        return maximum;
    }

    public static void readArray(int[] a) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void printOddsAndEvens(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0)
                System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                System.out.print(a[i] + " ");
        }
        System.out.println();

    }

}
