import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
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
    public int hashCode() {
        return custid;
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
public class CollectionSetDemo {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>(); // TreeSet, LinkedHashSet,
                                                 // HashSet
        set.add("collection");
        set.add("java");
        set.add("string");
        set.add("collection");
        set.add("static");
        set.add("string");
        System.out.println(set.size());
        // print each element of the set using an iterator.
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(set);
        for (String word : set) {
            System.out.print(word + " ");
        }
        Object objArr[] = set.toArray();
        String stringArray[] = set.toArray(new String[1]);
        List<Customer> list = new ArrayList<>();
        list.add(new Customer(113, "Amit", 4.5));
        list.add(new Customer(105, "Rajan", 3.1));
        list.add(new Customer(118, "Deepak", 4.3));
        list.add(new Customer(181, "Sumit", 4.4));
        list.add(new Customer(101, "Rakesh", 4.0));
        list.add(new Customer(161, "Geeta", 3.8));
        list.add(new Customer(142, "Simran", 4.1));
        Customer customer = new Customer(105, "Rajan", 3.1);
        Set<Customer> customerSet = new HashSet<>();
        customerSet.addAll(list);
        System.out.println("Rajan in list : " + list.contains(customer));
        System.out.println("Rajan in set : " + customerSet.contains(customer));
        Set<String> linkedHashSet = new LinkedHashSet<>(); // maintains
                                                           // insertion order
        linkedHashSet.add("java");
        linkedHashSet.add("hello");
        linkedHashSet.add("apple");
        // System.out.println(linkedHashSet);
        // Read a line from keyboard and find how many different words are
        // there.
        // Example:
        // this is set in java java uses hashset for set implementation
        // Total words : 11 Different words : 9
        // read the integers from input till the user enters a zero.
        // the integer must be 0 to 100 else throw
        // java.lang.IllegalArgumentException
        // print the numbers in sorted order. Each number must be printed once
        // only (repated elements not to be printed)
        Scanner sc = new Scanner(System.in);
        // Create a set of Employee(class with data empid, name, designation)
        // add 10 elements to set. Create new employee and search it in the set
        // For search to be successful, override hashCode and equals methods in
        // the
        // class Employee
        // Create a LinkedHashSet and add 10 strings to it some of the strings
        // are
        // repeated. print the set using iterator. Ensure that the elements are
        // printed in the order they were eneted.
    }
}
// Set<Integer> set2 = new TreeSet<>();
// int x = sc.nextInt();
// while (x != 0) {
// set2.add(x);
// x = sc.nextInt();
// }
// System.out.println(set2);