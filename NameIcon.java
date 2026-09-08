import java.util.Scanner;
public class NameIcon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String[] words = name.split("\\s+");
        if (words.length == 1) {
            String ans = "" + words[0].charAt(0);
            ans = ans + words[0].charAt(words[0].length() - 1);
            System.out.println(ans.toUpperCase());
            sc.close();
            return;
        }
        String first = words[0];
        String last = words[words.length - 1];
        String ans = "" + first.charAt(0) + last.charAt(0);
        System.out.println(ans.toUpperCase());
        sc.close();
    }
}
