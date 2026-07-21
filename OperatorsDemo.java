public class OperatorsDemo {
    public static void main(String[] args) {
        // Operators
        int x = 10, y = 3;
        int z;
        z = x + y;
        z = x - y;
        int val = x / y;
        System.out.println(val);
        double quot = (double) x / y;
        System.out.println(quot);

        int rem = x % y;
        double db = 10.5;
        double remDouble = db % 3.1;
        System.out.println(remDouble);

        x = 5;
        y = x++;
        y = x;
        x = x + 1;
        System.out.println(x + " , " + y);

        // // 5 5
        // // 5 6
        // // 6 6
        // // 6 5
        x = 5;
        y = ++x;
        System.out.println(x + "," + y);
        x = 1;
        y = 0;
        z = -1;
        if (x++ == 1 && y-- == 0 && z++ == -1)
            System.out.println("yes");
        else
            System.out.println("not");
        System.out.println(x + "," + y + "," + z);

        x = 1;
        y = 0;
        z = -1;
        if (x++ == 2 && y-- == 0 && z++ == -1)
            System.out.println("yes");
        else
            System.out.println("not");
        System.out.println(x + "," + y + "," + z);
        x = 1;
        y = 0;
        z = -1;
        if (x++ == 2 || y-- == -1 && z++ == -1)
            System.out.println("yes");
        else
            System.out.println("not");
        System.out.println(x + "," + y + "," + z);

        // // True || not execution
        // // False && NO execution
        x = 22;
        y = 12;
        z = x | y;
        System.out.println(z);

        z = x & y;
        System.out.println(z);
        z = x ^ y;
        System.out.println(z);
        x = 10;
        z = ~x;
        System.out.println(z);

        x = 5;
        z = x << 1;
        // LEFT SHIFT OPERATOR Shift each bit once to left

        x = 15 * 100 * 1000 * 1000;
        System.out.println(x);
        x = x << 1;
        System.out.println(x);

        int b = 26; // 0001 1010, b = 10; 0000 1010,
        // make 5 bit from right to 1
        int n = 5;
        z = 1 << (n - 1);
        b = b | z;
        // make the nth bit 0
        


    }
}
