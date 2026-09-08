import java.util.Scanner;

public class MagicSquare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an odd number (1 to 9): ");
        int n = scanner.nextInt();

        // Input validation
        if (n < 1 || n > 9 || n % 2 == 0) {
            System.out.println("Invalid input! Please enter an ODD number between 1 and 9.");
            scanner.close();
            return;
        }

        // Generate the magic square
        int[][] magicSquare = generateMagicSquare(n);

        // Display the matrix
        System.out.println("\nMagic Square of size " + n + "x" + n + ":");
        printMatrix(magicSquare, n);

        // Calculate and display the constant magic sum
        int magicSum = n * (n * n + 1) / 2;
        System.out.println("\nMagic Constant (Sum of rows, cols, diagonals) = " + magicSum);

        scanner.close();
    }

    /**
     * Generates an odd-ordered magic square using the Siamese Method.
     */
    public static int[][] generateMagicSquare(int n) {
        int[][] square = new int[n][n];

        int row = 0;
        int col = n / 2;

        for (int num = 1; num <= n * n; num++) {
            square[row][col] = num;

            // Store current position in case the next calculated cell is occupied
            int nextRow = row - 1;
            int nextCol = col + 1;

            // Wrap around row boundary
            if (nextRow < 0) {
                nextRow = n - 1;
            }

            // Wrap around column boundary
            if (nextCol == n) {
                nextCol = 0;
            }

            // If the target cell is already filled, step down 1 row from the original cell instead
            if (square[nextRow][nextCol] != 0) {
                row = row + 1; // Move directly down from previous position
            } else {
                row = nextRow;
                col = nextCol;
            }
        }

        return square;
    }

    /**
     * Helper method to print the matrix in a clean formatted grid.
     */
    public static void printMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}