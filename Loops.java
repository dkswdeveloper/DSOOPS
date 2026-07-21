import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		/*
		 * 1. Write a function to print 1 to 10 in a single line
		 * 2. Write a function to print table of 7
		 * 3. Write a function to print table of given integer
		 * 4. Wrtie a function to print
		 * 3 5 6 10 9 15 12 20 15 25 ... (21 terms in total)
		 * 5. Fibbonic
		 */
		// print10();
		// table7();
		System.out.println("enter number for table ");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();

		table(x);
		input.close();

	}

	public static void table(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
		}
	}

	public static void print10() {
		for (int i = 1; i <= 9; i++) {
			System.out.print(i + " ");
		}
		System.out.print(10);
		System.out.println();
		for (int i = 1; i <= 10; i++) {
			if (i == 10)
				System.out.print(i);
			else
				System.out.print(i + " ");
		}
	}

	public static void printCounting(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
	}

	public static void table7() {
		for (int x = 7; x <= 70; x = x + 7) {
			System.out.println(x);
		}
		for (int x = 1; x <= 10; x = x + 1) {
			System.out.println(7 * x);
		}
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		for (int i = 1; i <= 10; ++i) {
			System.out.println(i);
		}
		int i = 5;
		int j;
		j = i++; // j =i; i = i + 1;
		System.out.println(i + "," + j);
		i = 5;
		j = ++i; // i= i+1; j = i;
		System.out.println(i + "," + j);

	}

}
