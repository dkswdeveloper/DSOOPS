import java.util.Arrays;
public class GenericDemo {
    public static int search(int a[], int x) {
        for (int i = 0; i < a.length; i++) {
            if (x == a[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int search(double a[], double x) {
        for (int i = 0; i < a.length; i++) {
            if (x == a[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int search(char a[], char x) {
        for (int i = 0; i < a.length; i++) {
            if (x == a[i]) {
                return i;
            }
        }
        return -1;
    }

    public static <T> int search(T a[], T x) {
        if (a == null || x == null)
            return -1;
        for (int i = 0; i < a.length; i++) {
            // if (a[i]==x) { // it will not work bcoz it will compare
            // references not content
            if (a[i].equals(x)) { // it will compare content
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Double[] ar = { 4.5, 6.3, 3.0, 3.6, 34.64 };
        Double x = 3.6;
        int pos = search(ar, x);
        System.out.println(pos);
        class Customer {
            int custid;

            public Customer(int custid) {
                this.custid = custid;
            }

            @Override
            public boolean equals(Object ob) {
                // compare this and ob are equal or not
                if (!(ob instanceof Customer)) {
                    return false;
                }
                Customer c = (Customer) ob;
                if (this.custid == c.custid)
                    return true;
                else
                    return false;
            }
        }
        Customer[] customers = { new Customer(34), new Customer(445), new Customer(535), new Customer(304),
                new Customer(444), new Customer(535) };
        Customer oneCustomer = new Customer(444);
        int posCustomer = search(customers, oneCustomer);
        System.out.println(posCustomer);
        int[] a = { 3, 4, 5, 6, 4, 3, 2, 1, 7, 8 };
        int[] rev = reverse(a);
        System.out.println(Arrays.toString(rev));
        String[] names = { "Sachin", "akash", "rajan", "Harshit", "geeta", "Surekha" };
        String join = String.join(",", names);
        System.out.println(join);
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        String word = "Hello 87, =@#$ Good";
        String replace = word.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(replace);
    }

    public static int[] reverse(int[] a) {
        int[] rev = new int[a.length];
        // your logic
        return rev;
    }
}
