import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
class Student implements Iterable<Object> {
    int roll;
    String name;
    String branch;
    List<Object> list = new ArrayList<>();

    public Student(int roll, String name, String branch) {
        this.roll = roll;
        this.name = name;
        this.branch = branch;
        list.add(roll);
        list.add(name);
        list.add(branch);
    }

    public Iterator<Object> iterator() {
        return list.iterator();
    }
}
class MyData implements Iterator<Integer>, Iterable<Integer> {
    private int[] items = new int[10];
    private int size = 0;
    private int current = 0;

    public void add(int x) {
        items[size] = x;
        size++;
    }

    @Override
    public boolean hasNext() {
        return current < size;
    }

    @Override
    public Integer next() {
        int x = items[current];
        current++;
        return x;
    }

    @Override
    public Iterator<Integer> iterator() {
        current = 0;
        return this;
    }
}
class MyData2 implements Iterable<Integer> {
    int[] items = new int[10];
    int size = 0;

    class IteratorImpl implements Iterator<Integer> {
        int current = 0;

        @Override
        public boolean hasNext() {
            return current < size;
        }

        @Override
        public Integer next() {
            return items[current];
        }
    }

    public void add(int x) {
        items[size] = x;
        size++;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new IteratorImpl();
    }
}
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
class AllOrders implements Iterable<Order> {
    List<Order> upcoming = new ArrayList<>();
    List<Order> completed = new ArrayList<>();

    public void addOrder(Order order) {
        upcoming.add(order);
    }

    public void complete(Order order) {
        upcoming.remove(order);
        completed.add(order);
    }

    public Iterator<Order> iterator() {
        return upcoming.iterator();
    }
}
public class IteratorDemo {
    public static void main(String[] args) {
        Order o1 = new Order(123, 454.3, 12, "Chandigarh");
        Order o2 = new Order(173, 454.3, 16, "Chandigarh");
        Order o3 = new Order(128, 464.3, 14, "Chandigarh");
        Order o4 = new Order(153, 854.3, 12, "Chandigarh");
        Order o5 = new Order(103, 154.3, 17, "Chandigarh");
        Order o6 = new Order(168, 450.6, 16, "Chandigarh");
        Order o7 = new Order(102, 785.3, 14, "Chandigarh");
        Order[] ar = { o1, o2, o3, o4, o5, o6, o7 };
        // List<Order> list = new ArrayList<>();
        // list.addAll(Arrays.asList(ar));
        AllOrders allOrders = new AllOrders();
        allOrders.addOrder(o1);
        allOrders.addOrder(o2);
        allOrders.addOrder(o3);
        allOrders.addOrder(o4);
        allOrders.addOrder(o5);
        allOrders.addOrder(o6);
        allOrders.addOrder(o7);
        allOrders.complete(o2);
        allOrders.complete(o4);
        allOrders.complete(o5);
        System.out.println("Next orders");
        for (Order o : allOrders) {
            System.out.println(o);
        }
        MyData data = new MyData();
        data.add(1);
        data.add(2);
        data.add(3);
        for (int x : data) {
            System.out.println(x);
        }
        Student s = new Student(234, "Amit", "CSE");
        for (Object prop : s) { // Student to implement Iterable
            System.out.println(prop);
        }
        Set<Integer> set = new HashSet<>();
        set.add(23);
        set.add(64);
        set.add(88);
        set.add(75);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (int x : set) {
            System.out.println(x);
        } // set implements Iterable
        MyData d = new MyData();
        d.add(4);
        d.add(2);
        d.add(0);
        for (int x : d) {
            System.out.println(x);
        }
    }
}
class Player {
    String name;
}
class Team implements Iterable<Player> {
    private List<Player> players = new ArrayList<>();

    public Iterator<Player> iterator() {
        return players.iterator();
    }
}
class Demo {
    {
        Team team = new Team();
        for (Player player : team) {
            System.out.println(player);
        }
    }
}
