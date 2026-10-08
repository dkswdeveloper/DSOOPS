import java.util.Scanner;
public class FindDigitsString {
    public static void main(String[] args) {
        // Input: aba34 67bc df33d40 am2b4b5
        // Output : 185
        // Explanation : 34+67+33+40+2+4+5 = 185
        String str = "aba34 67bc df33d40 am2b4b5";
        String output = str.replaceAll("[^0-9]", " ");
        output = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                output = output + ch;
            } else
                output = output + " ";
        }
        System.out.println(output);
        Scanner sc = new Scanner(output);
        int s = 0;
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            s = s + x;
        }
        System.out.println(s);
        s = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                String numString = "" + ch;
                while (i + 1 < str.length() && Character.isDigit(str.charAt(i + 1))) {
                    numString += str.charAt(i + 1);
                    i++;
                }
                s = s + Integer.parseInt(numString);
            }
        }
        System.out.println(s);
        s = 0;
        sc.close();
        sc = new Scanner(str);
        String num = null;
        while ((num = sc.findInLine("\\d+")) != null) {
            s = s + Integer.parseInt(num);
        }
        sc.close();
        System.out.println(s);
        // First letter of first word and last word
        // Input : Amit Kumar Dhiman
        // Output : AD
        // ankit
        // AT
        // for single word first letter and last letter
    }
}
