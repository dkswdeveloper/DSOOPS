public class Kaprekar {
    public static void main(String[] args) {
        int n = 703;
        System.out.println(n + ":" + isKaprekar(n));

    }

    public static boolean isKaprekar(int n) {
        int sq = n * n;
        int div = 10;
        while (true) {
            int rem = sq % div;
            int quot = sq / div;
            if (quot + rem == n)
                return true;
            div = div * 10;
            if (quot == 0)
                break;
        }
        return false;
    }
}
