public class RotateMatrix90 {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int n = a.length;
        for (int j = 0; j < n; j++) {
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();
        }
    }
}
