public class CamelCase {
    public static void main(String[] args) {
        int[] a = { 34, 45, 56, 34, 67, 76, 54, 67, 89, 87, 56, 34, 657, 89, 87, 5 };
        // logic to find 2nd max
        java.util.Arrays.sort(a);
        System.out.println(a[1]);
        java.util.Set<Integer> set = new java.util.LinkedHashSet<>();
        for (int x : a) {
            set.add(x);
        }
        System.out.println(set);
        String[] names = { "a", "b", "c", "sldkfj", "lkj", "ee" };
        String joined = String.join(" ", names);
        System.out.println(joined);
        String ans = "";
        for (int x : a) {
            ans = ans + x + " ";
        }
        System.out.println(ans.trim());
        System.out.println("CaMeLcAsE");
        // program
        // PrOgRaM
        // sumit
        // SuMiT
        // rajan gupta
        // RaJaN gUpTa
    }
}
