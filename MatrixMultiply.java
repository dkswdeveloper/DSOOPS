import java.util.Scanner;

public class MatrixMultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows and columns");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        System.out.println("enter number of rows and columns 2nd Matrix");
        int rows2 = sc.nextInt();
        int cols2 = sc.nextInt();
        if (cols != rows2) {
            System.out.println("error : cant multiply");
            return;
        }

        int[][] a = new int[rows][cols];
        int[][] b = new int[rows2][cols2];
        int[][] c = new int[rows][cols2];

        System.out.println("enter  matrix ");
        readMatrix(a, sc);
        System.out.println("enter 2nd matrix ");
        readMatrix(b, sc);
        multiplyMatrices(a, b, c);
        System.out.println("answer");
        printMatrix(c);
        sc.close();
    }

    public static void readMatrix(int[][] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    public static void multiplyMatrices(int[][] a, int[][] b, int[][] c) {
        int rows = a.length;
        int cols = a[0].length; // int cols = b.length;
        int rows2 = cols; // int rows2 = b.length;
        int cols2 = b[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols2; j++) {
                // cij = ai0*b0j + ai1 * b1j + ai2*b2j+ai3*b3j
                int s = 0;
                for (int k = 0; k < rows2; k++) {
                    s = s + a[i][k] * b[k][j];
                }
                c[i][j] = s;

                // one row of A X one column of B and add all
            }
        }
    }

    public static void printMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

}
