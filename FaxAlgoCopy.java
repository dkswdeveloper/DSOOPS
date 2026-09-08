public class FaxAlgo {
    public static void main(String[] args) {
        // Write your code here
        String str = "aaabcdddddeeeaa";
        // a3bcd5e3a2
        String ans = faxEncrypt(str);
        System.out.println(ans);
        System.out.println(faxDecrypt(ans));
    }

    public static String faxEncrypt(String str) {
        char ch = str.charAt(0);
        int freq = 1;
        String ans = "";
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                freq++;
            } else {
                ans = ans + ch + (freq == 1 ? "" : freq);
                ch = str.charAt(i); // new char is b
                freq = 1;
            }
        }
        ans = ans + ch + (freq == 1 ? "" : freq);
        return ans;
    }

    public static String faxDecrypt(String str) {
        String ans = "";
        for (int i = 0; i < str.length();) {
            char ch = str.charAt(i);
            i++;
            int freq = 1;
            if (i < str.length() && Character.isDigit(str.charAt(i))) {
                String freqStr = "";
                while (i<str.length() && Character.isDigit(str.charAt(i))) {
                    freqStr = freqStr + str.charAt(i);
                    i++;
                }
                freq = Integer.parseInt(freqStr);
            }
            for (int j = 0; j < freq; j++) {
                ans = ans + ch;
            }
        }
        return ans;
    }
}