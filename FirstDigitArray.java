import java.util.Scanner;

public class FirstDigitArray {
    public static void main(String[] args) {
        // read n
        // create an array of n integers
        // read n integers from scanner over system.in
        // print the first digit of every element
        String str = "Hello";
        // in java string object are IMMUTABLE
        str = str.concat("Everyone");
        System.out.println(str);
        String value = 4 + 5 + "";
        value = "" + 4 + 5; // "45"
        System.out.println(value);
        int len = str.length();
        // in array length is data member
        // in string length is method (function)
        // char ar[] = "Hello";
        // ar[0] allowed in c
        String greet = "Hello";
        for (int i = 0; i < greet.length(); i++) {
            System.out.print(greet.charAt(i) + " ");
        }
        // strlen, strcmp, strcpy, strcat substring
        len = str.length();
        // apple aptech
        // int = diff of ascii value where first char differs
        int diff = "apple".compareTo("aptech");
        System.out.println(diff);
        // diff -ve : first one is small : in dictionary order
        // diff +ve : first one is large in dictionary order
        // diff = 0 : both strings are same
        // Read a string from scanner,
        // Read another string from scanner
        // if both are same print "same" else print "different"
        Scanner sc = new Scanner(System.in); // sc.nextLine();
        System.out.println("enter 2 strings");
        String firstStr = sc.next();
        String secondStr = sc.next();
        if (firstStr == secondStr)
            System.out.println("same");
        else
            System.out.println("different");

        if (firstStr.compareTo(secondStr) == 0)
            System.out.println("same");
        else
            System.out.println("different");
        if (firstStr.equals(secondStr) == true)
            System.out.println("same");
        else
            System.out.println("different");

        //read n and then read n strings and print the 
        // one that has maximum length 

    }
}
