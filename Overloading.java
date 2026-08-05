// Polymorphism : Same name different implementation 
// types : Compile time, run time 
// compile time polymorphism is implemented using OVERLOADING
// Also called : Static Binding, Early Bindiing, Compile time binding
public class Overloading {
    public static int sum(int a, int b) {        return a + b;    }
    public static int sum(int a, int b, int c) {        return a + b + c;    }
    public static double sum(double a, double b) {        return a + b;    }
    public static int sum(int a[]) {
        int s = 0;
        for (int x : a) {
            s = s + x;
        }
        return s;
    }
    public static int sum(int a[], int n) {
        // find sum of first n integers only
        int s = 0;
        for (int i = 0; i < n; i++) {
            s = s + a[i];
        }
        return s;
    }

    public static void main(String[] args) {
        int x = sum(4, 5);
        double s = sum(4.5, 3.4);
        x = sum(4, 5);
        System.out.println(sum(6, 4));
        System.out.println(sum(5, 5.5));

    }
}