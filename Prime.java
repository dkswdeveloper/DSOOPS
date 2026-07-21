import java.util.Arrays;
import java.util.Scanner;

public class Prime {
    // write a function to check given number is prime or not
    public static boolean isPrime(int n) {
        if (n % 2 == 0) {
            return false;
        }
        for (int div = 3; div < n / 2; div = div + 2) {
            if (n % div == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimes(int a, int b) {
        // print primes between [a,b] 5, 53
        for (int n = a; n <= b; n++) {
            if (isPrime(n))
                System.out.println(n);
        }
    }

    public static void appendPrime(int a[]) {
        // search for first zero in the array and replace it with next prime number
        int index;
        for (index = 0; a[index] != 0; index++) {
        }
        if (index == 0) {
            a[index] = 2;
            return;
        }
        if (index == 1) {
            a[index] = 3;
            return;
        }
        int lastPrime = a[index - 1]; // odd number
        for (int n = lastPrime + 2; true; n += 2) {
            boolean flag = true;
            for (int i = 0; i < index; i++) {
                if (n % a[i] == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                a[index] = n;
                break;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to check prime");
        int n = sc.nextInt();
        boolean result = isPrime(n);
        System.out.println(n + " is prime : " + result);
        sc.close();
        int a[] = { 2, 3, 5, 7, 11, 13, 17, 23, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        appendPrime(a);
        System.out.println(Arrays.toString(a));
        // { 2,3,5,7,11,13,17,23,29,0,0,0,0,0,0,0,0,0,0,0,0};
        appendPrime(a);
        System.out.println(Arrays.toString(a));
        // { 2,3,5,7,11,13,17,23,29,31,0,0,0,0,0,0,0,0,0,0,0};
        appendPrime(a);
        System.out.println(Arrays.toString(a));
        // { 2,3,5,7,11,13,17,23,29,31,37,0,0,0,0,0,0,0,0,0,0};

    }

}
