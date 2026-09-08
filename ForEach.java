public class ForEach {
    public static void main(String[] args) {
        int[] ar = { 3, 4, 5, 6, 7, 9 };
        for (int i = 0; i < ar.length; i++)
            System.out.print(ar[i] + " ");
        System.out.println();
        for (int x : ar) {
            System.out.println(x + " ");
        }
        System.out.println();
        String[] names = { "Sumit", "Rajan", "Harshit" };
        for (String name : names) {
            System.out.println(name);
        }
        int[][] a = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        for (int[] sub : a) {
            for (int x : sub)
                System.out.println(x + " ");
        }

    }
}
