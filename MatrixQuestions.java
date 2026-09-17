import java.util.Scanner;
public class MatrixQuestions {
    public static void main(String[] args) {
        int[][] a = new int[3][4];
        readArray(a);
        printArray(a);
        printPostionOfMax(a);
        // a[0] : it is 1 dimensional array of 4 integers
        // a[1] : it is 1 dimensional array of 4 integers
        // a[2] : it is 1 dimensional array of 4 integers
        // a[0][0] a[0][1] a[0][2] a[0][3]
        // a[1][0] a[1][1] a[1][2] a[1][3]
        // a[2][0] a[2][1] a[2][2] a[2][3]
        // a.length : number of rows
        // a[0].length : number of cols in first array
    }

    public static void readArray(int[][] a) {
        Scanner sc = new Scanner(System.in);
        int rows = a.length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    public static void printArray(int[][] a) {
        int rows = a.length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void multiply(int[][] a, int[][] b, int[][] c) {
        // find 1 element c[i][j]
        int m = a.length;
        int n = a[0].length;
        int n2 = b.length;
        int p = b[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                int s = 0;
                for (int k = 0; k < n; k++) {
                    s = s + a[i][k] * b[k][j];
                }
                c[i][j] = s;
            }
        }
    }

    public static void printPostionOfMax(int[][] a) {
        // 2 3 4 1
        // 4 5 7 9
        // 1 2 3 1
        // 1 1 1 1
    }
}
