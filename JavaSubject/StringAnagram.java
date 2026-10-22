class StringAnagram {
    public static void main(String[] args) {
        // Write a program to find if the given string contains 3 continuous
        // characters like abc lmn xyz
        // if yes, print the index of starting letter else print -1
        // input: abbdefabma
        // output : 3
        // At 3 there is def
        String str = "abbdefabma";
        boolean flag = false;
        for (int i = 0; i < str.length() - 2; i++) {
            int x = str.charAt(i);
            int y = str.charAt(i + 1);
            int z = str.charAt(i + 2);
            if (y - x == 1 && z - y == 1) {
                flag = true;
                System.out.println(i);
                break;
            }
        }
        if (!flag)
            System.out.println(-1);
        //
        // Read 2 strings of small alphabets only,
        // find how many characters to be deleted to make them anagram
        // aabb bbaa
        // aabbcd
        // abbde
        // Output : 3
        String first = "aabbcd";
        String second = "abbde";
        int[] freq = new int[26];
        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);
            freq[ch - 'a']++;
        }
        // a b c d e f g h i j
        // 2 2 1 1 0 0 0 0 0 0 0 0
        // 1 2 0 1 1 0 0 0 0 0 0 0
        // Write a program to find the value of nCr = n!/(r! X (n-r)!)
    }
}
