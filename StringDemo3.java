import java.util.Scanner;
import java.util.Arrays;

public class StringDemo3
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		String line = sc.nextLine();
		String word = sc.next();
		System.out.println(line.contains(word) );
		char[] ar = line.toCharArray();
		for(char ch : ar) { System.out.print(ch); }
		System.out.println();
		System.out.println(line.indexOf("is"));
		System.out.println(line.lastIndexOf("is"));

		// Integer to string
		System.out.println("enter integer");
		int x= sc.nextInt();
		String xAsStr = ""+x;
		System.out.println(xAsStr);
		// String to Integer
		int y = Integer.parseInt(xAsStr);
		System.out.println("value in string =" + y);

		//Reverse string
		System.out.println("enter word to reverse ");
		word = sc.next();
		StringBuilder sb = new StringBuilder(word);
		sb.reverse();
		System.out.println(sb);
}



}


