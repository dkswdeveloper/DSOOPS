import java.util.ArrayList;
import java.util.List;
public class CollectionListDemo {
    public static void main(String[] args) {
        // Generics
        List<String> list = new ArrayList<>(); // new LinkedList<>();
        // ArrayList<String> list2 = new ArrayList<>(); // bad code
        System.out.println(list.size());
        list.add("Amit");
        list.add("Sumit");
        list.add("Rajan");
        list.add("Rajan");
        list.add("Geeta");
        list.add("Simran");
        list.add("Harjot");
        list.add("Harjot");
        System.out.println(list.size());
        System.out.println(list.contains("Rajan"));
        System.out.println(list.indexOf("Rajan"));
        System.out.println(list.lastIndexOf("Rajan"));
        List<String> list2 = new ArrayList<>();
        list2.add("Sumit");
        list2.add("Rajan");
        System.out.println(list);
        list.removeAll(list2);
        System.out.println(list);
        list.clear();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list2.clear();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        list2.add("5");
        // 2 lists are there as a b c d e and 1 2 3 4 5
        // make the first list as a 1 b 2 c 3 d 4 e 5 by inserting elemnts from
        // 2nd list
        // reverse a list using list functions only
        // create a list of customer and seach a customer in the list by
        // overriding equals : DONE
        // print the common elements of both the lists
        // Sort a list using comparator : DONE
        // Remove all elements from a list of integer that are less than 40
        // convert a list of customer to an array of objects / array of customer
        // Remove all duplicate elements from a list without changing the order
        // of elements
        // Change all odd elements of the list by its double value
        // Change a list of string such that each element is concatenation of 2
        // elements
        // a b c d e f g h i => a,b c,d e,f g,h i
        //
    }
}
