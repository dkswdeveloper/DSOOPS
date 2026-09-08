import java.util.Scanner;
import java.util.Arrays;

public class AlphabetReader
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String[] ar = new String[26];
		for(int i = 0; i<26; i++)
		{
			ar[i] = sc.next(".");
			sc.skip(" ");
		}
		System.out.println(Arrays.toString(ar));
		sc.skip("(\\s+\n)+");
		String line = sc.nextLine();
		System.out.println(line);
		
		sc.close();
	}
}

			
