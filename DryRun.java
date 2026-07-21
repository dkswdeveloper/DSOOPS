public class DryRun {
	public static void main(String args[]) {
		// Write a function to print the series 1 2 4 7 11 16 22 29 .... (25 terms)
		int n = 21;
		for (int i = 1; i <= 10; i++) {
			System.out.print(3 * i + " ");
			System.out.println(5 * i + " ");
		}
		if (n % 2 == 1) {
			System.out.print(3 * (n + 1) / 2);
		}

		System.out.println();

		int m = 1;
		int t = 1;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				System.out.print(3 * m + " ");
				m++;
			} else {
				System.out.print(5 * t + " ");
				t++;
			}
		}
		System.out.println();
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				System.out.print(3 * ((i + 1) / 2) + " ");
			} else {
				System.out.print(5 * (i / 2) + " ");
			}
		}
		System.out.println();

		/*
		 * int s = 0;
		 * for(int i = 1; i<= 3; i++)
		 * {
		 * for(int j = 1; j<= 2; j++)
		 * {
		 * for(int k= 1; k<= 3; k++)
		 * {
		 * s = s + i + j + k;
		 * }
		 * }
		 * }
		 * System.out.println(s);
		 */
	}
}