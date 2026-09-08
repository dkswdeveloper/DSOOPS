public class SpiralMatrix {
    public static void main(String[] args) {
        // int[][] a = {
        // { 1, 2, 3, 4, 5, 6 },
        // { 1, 2, 3, 4, 5, 6 },
        // { 1, 2, 3, 4, 5, 6 },
        // { 1, 2, 3, 4, 5, 6 },
        // { 1, 2, 3, 4, 5, 6 },
        // { 1, 2, 3, 4, 5, 6 } };
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int n = a.length;
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        while (true) {
            printRow(a, top, left, right, top, bottom);
            top++;
            System.out.println();
            printCol(a, right, left, right, top, bottom);
            right--;
            System.out.println();
            printRowRev(a, bottom, left, right, top, bottom);
            bottom--;
            System.out.println();
            printColRev(a, left, left, right, top, bottom);
            left++;
            System.out.println();
            if (left > right && top > bottom)
                break;
        }
    }

    private static void printCol(int[][] a, int num, int left, int right, int top, int bottom) {
        for (int i = top; i <= bottom; i++) {
            System.out.print(a[i][num] + " ");
        }
    }

    private static void printColRev(int[][] a, int num, int left, int right, int top, int bottom) {
        for (int i = bottom; i >= top; i--) {
            System.out.print(a[i][num] + " ");
        }
    }

    private static void printRow(int[][] a, int num, int left, int right, int top, int bottom) {
        for (int j = left; j <= right; j++) {
            System.out.print(a[num][j] + " ");
        }
    }

    private static void printRowRev(int[][] a, int num, int left, int right, int top, int bottom) {
        for (int j = right; j >= left; j--) {
            System.out.print(a[num][j] + " ");
        }
    }
}
