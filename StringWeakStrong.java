public class StringWeakStrong {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "this is a string";
        String s3 = "Java Programming";
        // if a string contains a capital letter is it weak else strong
        boolean result = findWeak(s2);
    }
    static boolean findWeak(String s) {

        for (int i = 0; i < s.length(); i++) {
            char ch = su.charAt(i);
            if ('A' <= ch && ch <= 'Z') {
                return true;
            }
        }
        return false;
    }
}
