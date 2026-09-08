import java.util.Scanner;

public class CommonPrefixString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String line = sc.nextLine(); // this is split of string
        // your logic here to count the words 
        //sachin;suneeta;deepak arora; rajesh gupta; hina
        //geeta:65;sachin:85;rupesh:45;archit:77 
        String[] words = line.split(" ");
        // String[] words = line.split("\\s+");
        // This Is Split Of String
        String num = "65";
        int x = Integer.parseInt(num);
        // this is split of string
        // string of split is this

        sc.close();
    }
}
