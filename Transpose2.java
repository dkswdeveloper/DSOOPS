import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows and columns");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        // read the matrix and print transpose of the matrix;
        // int[][] a = new int[rows][cols];
        // System.out.println("enter matrix ");
        // readMatrix(a, sc);

        // // a[i][j]
        // // a[j][i]
        // for (int i = 0; i < cols; i++) {
        // for (int j = 0; j < rows; j++) {
        // System.out.print(a[j][i] + " ");
        // }
        // System.out.println();
        // }

        int[][] a = new int[rows][cols];
        int[][] b = new int[cols][rows];
        readMatrix(a, sc);
        // tranpose(a, b);
        transpose(a);
        System.out.println("answer");
        printMatrix(a);
        sc.close();
    }

    public static void transpose(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int t = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = t;
            }
        }

    }

    public static void tranpose(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                b[j][i] = a[i][j];
            }
        }
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
        int cols = a[0].length;
        int rows2 = cols; // int rows2 = b.length;
        int cols2 = b[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols2; j++) {
                int s = 0;
                for (int k = 0; k < rows2; k++) {
                    s = s + a[i][k] * b[k][j];
                }
                c[i][j] = s;
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
