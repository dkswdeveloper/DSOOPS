import java.util.Scanner;
import java.util.Arrays;

public class StringDemo2
{
	public static void main(String args[])
	{
		String some = "thisa;slkdjf";
		char[] array = some.toCharArray();
		
		Scanner sc =new Scanner(System.in);
		String line = sc.nextLine();
		String word = sc.next();
		System.out.println(line.contains(word) );// "this".contains("is")
		System.out.println(line.startsWith(word)); // "this".startsWith("th")
		System.out.println(line.endsWith(word)); // "this".endsWith("hello") False 
		System.out.println(word.toLowerCase()); // "tHIs".toLowerCase() "this"
		System.out.println(line.toUpperCase() ); 
		System.out.println(line.charAt(1));
		System.out.println(line.toLowerCase().contains(word.toLowerCase()) );
		System.out.println(line.indexOf(word) ); // "this".indexOf("ise")
		// Capitalize each word
		String[] words = line.split(" "); // "\\s+" one or more spaces
		System.out.println("line contains " + words.length + " words");
		for(int i = 0; i<words.length; i++)
		{
			char first = words[i].charAt(0);
			String fstr = ""+first;
			fstr = fstr.toUpperCase();
			String sub = words[i].substring(1);
			String ans = fstr + sub;
			System.out.print(ans + " ");
		}

		// find common prefix of all strings
		/* int n = sc.nextInt();
		String[] wordsAr = new String[n];
		for(int i= 0; i<n; i++)
		{
			wordsAr[i] = sc.next();
		}
		*/
		String[] wordsAr = words;
		System.out.println(Arrays.toString(wordsAr));
		String common = wordsAr[0];
		for(int i = 1; i<wordsAr.length; i++)
		{
			System.out.println("common:" + common);
			common = findCommonPrefix(common, wordsAr[i]);
		}
		System.out.println(common);
	}
	static String findCommonPrefix(String s1, String s2)
	{
		String ans = "";
		int i = 0;
		while(i<s1.length() && i<s2.length())
		{
			if(s1.charAt(i) == s2.charAt(i) )
			{
				ans = ans + s1.charAt(i);
				i++;
			}
			else break;
		}
		return ans;
	}
}


