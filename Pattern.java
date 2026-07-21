public class Pattern {
    public static void main(String[] args) {
        pattern2();
    }

    public static void pattern1() {
        int x = 1;
        for (int j = 1; j <= 5; j++) {
            
            for (int i = 1; i <= j; i++) {
                System.out.print(x + " ");
                if (x < 10)
                    System.out.print(" ");
                x++;
            }
            System.out.println();
        }
    }

    public static void pattern2() {
        int numbersPrinted = 0;
        int newlineToPrint = 1;
        for (int n = 1; n <= 15; n++) {
            System.out.print(n + " ");
            numbersPrinted++;
            if (numbersPrinted == newlineToPrint) {
                System.out.println();
                newlineToPrint++;
                numbersPrinted = 0;
            }
        }
    }
}
/*
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 * 
 * 
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 * 
 * 5
 * 5 4
 * 5 4 3
 * 5 4 3 2
 * 5 4 3 2 1
 * 
 * 1 1
 * 1 2 2 1
 * 1 2 3 3 2 1
 * 1 2 3 4 4 3 2 1
 * 1 2 3 4 5 5 4 3 2 1
 * 
 * 
 * A
 * A B
 * A B C
 * A B C D
 * A B C D E
 * 
 * 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 * 5 5 5 5 5
 * 
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 * 
 * 
 * 
 * 
 * 
 */