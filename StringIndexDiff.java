public class StringIndexDiff {
    public static void main(String[] args) {
        String str = "this is a string";
        char first = 'a';
        char second = 't';
        boolean found = false;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == first && str.charAt(i + 3) == second) {
                System.out.println("found at " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("not found");
        }

    }
}
