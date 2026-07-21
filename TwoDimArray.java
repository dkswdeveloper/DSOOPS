import java.util.Scanner;

public class TwoDimArray {
    public static void main(String[] args) {
        // int[][] a = new int[3][4];
        // int b[][] = new int[3][4];
        // int[][] c = { { 4, 3, 6, 7 }, { 3, 7, 8, 0 }, { 2, 1, 7, 0 } };
        // read a matrix
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows and columns");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];
        int[][] c = new int[rows][cols];

        System.out.println("enter  matrix ");
        readMatrix(a, sc);
        System.out.println("enter matrix ");
        readMatrix(b, sc);
        addMatrices(a, b, c);
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
    public static void addMatrices(int[][] a, int[][] b, int[][] c) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
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