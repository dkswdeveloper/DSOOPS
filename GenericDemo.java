class MyFileProcessor<T> 
{
    String file;
    public MyFileProcessor(String file) { this.file = file;}
    public T process()
    {
        return null;
    }
}
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

            public boolean equals(Object obj) {
                // this, obj
                if (obj instanceof Customer) {
                    Customer c = (Customer) obj;
                    if (c.custid == this.custid)
                        return true;
                    else
                        return false;
                }
                return false;
            }

            public Customer(int custid) {
                this.custid = custid;
            }
        }
        Customer[] customers = { new Customer(34), new Customer(445), new Customer(535), new Customer(304),
                new Customer(444), new Customer(535) };
        Customer oneCustomer = new Customer(444);
        int posCustomer = search(customers, oneCustomer);
        Customer first = new Customer(77);
        Customer second = new Customer(77);
        if (first == second)
            System.out.println("same");
        else
            System.out.println("different");
        if (first.equals(second))
            System.out.println("same");
        else
            System.out.println("different");
        System.out.println(posCustomer);
    }
}
