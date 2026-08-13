import java.util.Arrays;
class Student {
    int roll;
    String name;
    int[] marks;

    public Student(int roll, String name, int[] marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public void show() {
        // which prints the roll,name and totalMarks;
        int s = 0;
        for (int x : marks) {
            s = s + x;
        }
        System.out.println(roll + "," + name + ":" + s);
    }
}
public class ConstructorDemo {
    public static void main(String[] args) {
        int roll = 234;
        String name = "Anshuman";
        int marks[] = { 34, 24, 65, 43 };
        Student s = new Student(roll, name, marks);
        s.show();
        marks[0] = 84;
        s.show();
        int[] a = { 234, 67, 34, 567, 304, 45 };
        int[] b = { 67, 234, 34, 45, 567, 304 };
        Arrays.sort(a);
        Arrays.sort(b);
        String str = "aaabcddcc";
        // a3bcd2c2
        String ans = "";
        char ch = str.charAt(0);
        int freq = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                freq++;
            } else { // will not add last character
                ans = ans + ch + (freq == 1 ? "" : freq);
                freq = 1;
                ch = str.charAt(i);
            }
        }
        ans = ans + ch + (freq == 1 ? "" : freq); // for last char
        System.out.println(ans);
        // String word= "monmond";
        // int charFreq[] = new int[26];
        // char ch = str.charAt(0);
        // charFreq[ch - 'a']++; // for 'a'
        // 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        // 2 1 1 1
    }
}
