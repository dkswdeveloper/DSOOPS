import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        String str1 = "abcccd";
        String str2 = "badccc";
        String str3 = "abcd";
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        System.out.println(Arrays.toString(charArray1));
        System.out.println(Arrays.toString(charArray2));
        boolean equals = Arrays.equals(charArray1, charArray2);
        System.out.println(equals);
        int[] freq1 = getFreqArray(str1);
        int[] freq2 = getFreqArray(str2);
        boolean equalArray = true;
        for (int i = 0; i < freq1.length; i++) {
            if (!(freq1[i] == freq2[i])) {
                {
                    equalArray = false;
                    break;
                }
            }
        }
    }

    public static int[] getFreqArray(String str) {
        // lowercase chars
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }
        return freq;
    }
}
