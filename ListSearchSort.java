import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Customer {
    int custid;
    String name;
    double rating;

    public Customer(int custid, String name, double rating) {
        this.custid = custid;
        this.name = name;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Customer [custid=" + custid + ", name=" + name + ", rating=" + rating + "]";
    }

    @Override
    public boolean equals(Object ob) {
        if (!(ob instanceof Customer)) {
            return false;
        }
        Customer cust = (Customer) ob;
        if (this.custid == cust.custid && this.name.equals(cust.name))
            return true;
        return false;
    }
}
class CustomerComparatorId implements Comparator<Customer> {
    public int compare(Customer c1, Customer c2) {
        // if c1 > c2 return +ve, c2 > c1 return -ve else return 0
        // if(c1.custid > c2.custid) return 1;
        // else if(c1.custid < c2.custid) return -1;
        // return 0;
        return c1.custid - c2.custid;
    }
}
class CustomerComparatorName implements Comparator<Customer> {
    public int compare(Customer c1, Customer c2) {
        return c1.name.compareToIgnoreCase(c2.name);
    }
}
public class ListSearchSort {
    public static void main(String[] args) {
        Object obj = "Hello";
        obj = new Customer(1, "A", 4.4);
        obj = 34;
        Object[] ar = new Object[5];
        ar[0] = "Hello";
        ar[1] = 45;
        ar[2] = new Customer(3, "A", 4.4);
        ar[3] = "Java";
        ar[4] = 5.6;
        List<Customer> list = new ArrayList<>();
        list.add(new Customer(113, "Amit", 4.5));
        list.add(new Customer(105, "Rajan", 3.1));
        list.add(new Customer(118, "Deepak", 4.3));
        list.add(new Customer(181, "Sumit", 4.4));
        list.add(new Customer(101, "Rakesh", 4.0));
        list.add(new Customer(161, "Geeta", 3.8));
        list.add(new Customer(142, "Simran", 4.1));
        Customer customer = new Customer(105, "Rajan", 3.1);
        boolean contains = list.contains(customer);
        System.out.println(contains);
        System.out.println(list.indexOf(customer));
        Comparator<Customer> comparatorObject = new CustomerComparatorId();
        Collections.sort(list, comparatorObject);
        System.out.println(list);
        Collections.sort(list, new CustomerComparatorName());
        System.out.println(list);
    }
}
