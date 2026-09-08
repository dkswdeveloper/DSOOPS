import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class MyAlgo
{

}
public class StackQueue {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        removeDuplicates(list);
        MyAlgo.removeDuplicates(list);
        MyAlgo obj = new MyAlgo();
        obj.removeDuplicates(list);


        // Print the sum of integers of each line (blank line is end of input)
        // 1 2 3 41
        // 3 4
        // 10 20
        // 5 6 6
        //
        // 47
        // 7
        // 30
        // 17
        // Ravjot
        // First Name : Ravjot
        // Middle Name :
        // Last Name :
        // Amit Sharma
        // First Name : Amit
        // Middle Name :
        // Last Name : Sharma
        // Geeta Kumari Rajan Negi
        // First Name : Geeta
        // Middle Name : Kumari Rajan
        // Last Name : Negi
        Scanner sc = new Scanner(System.in);
        String line = "";
        line = sc.nextLine().trim();
        List<String> list = new ArrayList<>();
        while (line.length() > 0) {
            list.add(line);
            line = sc.nextLine().trim();
        }
        System.out.println(list.size() + " lines are read " + list);
        for (String numLine : list) {
            System.out.println(calcuateSum(numLine));
        }
        System.out.println();
        for (String numLine : list) {
            System.out.println(calcuateSum2(numLine));
        }
    }

    private static int calcuateSum(String numLine) {
        // "3 4 5 60"
        String[] words = numLine.split(" ");
        int s = 0;
        for (String word : words) {
            s = s + Integer.parseInt(word);
        }
        return s;
    }
    private static int calcuateSum2(String numLine) {
        // "3 4 5 60"
        Scanner sc = new Scanner(numLine);
        int s = 0;
        while (sc.hasNextInt()) {
            s = s + sc.nextInt();
        }
        sc.close();
        return s;
    }
    // a+*(8+5-(4-6)) + [(a+b)-(c*8)] )(a+b)(
    // for every char in the string
    // if(ch is opening ( { [ ) then add to list
    // else if(ch is closing ) } ] then { match it with top of list
    // if match found remove top of list () {} [] else error
    // }
    // if list is not empty error
    // else ok
}
// public static boolean validBrackets(String str)
// {
// List<Character> list = new ArrayList<>();
// for(int i = 0 ; i<str.length(); i++)
// {
// char ch = str.charAt(i);
// if(ch == '(' || ch == '[' || ch == '{')
// list.add(ch);
// else if (ch == ')' || ch == ']' || ch == '}')
// {
// if(list.isEmpty()) return false;
// char top = list.get(list.size() -1);
// if(ch == ')') { if(top == '(') list.remove(list.size() -1); else return
// false;}
// if(ch == ']') { if(top == '[') list.remove(list.size() -1); else return
// false;}
// if(ch == '}') { if(top == '{') list.remove(list.size() -1); else return
// false;}
// }
// }
// if(!list.isEmpty()) return false;
// return true;
// }
