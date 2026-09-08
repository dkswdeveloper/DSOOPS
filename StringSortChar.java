import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Order {
    int orderno;
    double value;
    int custid;
    String address;

    public Order(int orderno, double value, int custid, String address) {
        this.orderno = orderno;
        this.value = value;
        this.custid = custid;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Order [orderno=" + orderno + ", value=" + value + ", custid=" + custid + ", address=" + address + "]";
    }
}
public class StringSortChar {
    public static void main(String[] args) {
        Order o1 = new Order(123, 454.3, 12, "Chandigarh");
        Order o2 = new Order(173, 454.3, 16, "Chandigarh");
        Order o3 = new Order(128, 464.3, 14, "Chandigarh");
        Order o4 = new Order(153, 854.3, 12, "Chandigarh");
        Order o5 = new Order(103, 154.3, 17, "Chandigarh");
        Order o6 = new Order(168, 450.6, 16, "Chandigarh");
        Order o7 = new Order(102, 785.3, 14, "Chandigarh");
        Order[] ar = { o1, o2, o3, o4, o5, o6, o7, };
        // sort the array by orderno
        // sort the array by value in descending order
        List<Order> list = new ArrayList<>();
        list.addAll(Arrays.asList(ar));
        // Sort the list as per orderno
        // sort this list as per ordervalue in descending order
        // Question 1
        // Read a line from keyboard
        // Remove all characaters that are not small case alphabets
        // Sort the chacters in alpbabetically and Print it
        // Input : 
        // this is a line of 45 words ?
        // Step 1 output : thisisalineofwords
        // Step 2 output : adefhiiilnoorssstw
        // question 2
        // An array of n elements initialized with 0's
        // Read the operation number 1 for add and element to add and number of
        // times
        // to add like 1 3 5 , delete 2 2 : delete all 2's from the list
        // Read n,print n 0's read operation 1 for add or 2 for delete or 3 for
        // exit
        // 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        // 1 3 5
        // 3 3 3 3 3 0 0 0 0 0 0 0 0 0 0
        // 1 2 3
        // 3 3 3 3 3 2 2 2 0 0 0 0 0 0 0
        // 1 4 4
        // 3 3 3 3 3 2 2 2 4 4 4 4 0 0 0
        // 2 2 // all 2 to be deleted
        // 3 3 3 3 3 0 0 0 4 4 4 4 0 0 0
        // 1 6 6
        // -1 // as no 6 spaces are available contiguously
    }
}