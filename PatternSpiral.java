import java.util.Scanner;

public class PatternSpiral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        // The total size of the grid is (2 * n - 1) x (2 * n - 1)
        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Find the minimum distance from any of the four borders
                int minDistance = Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));

                // Value increases as we move deeper into the center
                int value = minDistance + 1;

                System.out.print(value + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

}
