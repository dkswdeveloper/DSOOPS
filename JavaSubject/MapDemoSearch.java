import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class MapDemoSearch {
    public static void main(String[] args) {
        // read n
        // read n keys and product name
        // read k : key
        // print the products with key <= k
        // Example
        /*
         * 6 34 Pen Drive 23 Laptop 82 Tablet 33 Mobile 12 Glasses 10 Watch
         * 
         * 23 10 Watch 12 Glasses 23 Laptop Print all items with key <= 23 in
         * sorted order of key
         * 
         * 
         * 
         * 
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Integer, String> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            String name = sc.nextLine().trim();
            map.put(key, name);
        }
        int searchkey = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        list.addAll(map.keySet());
        Collections.sort(list);
        for (int key : list) {
            if (key <= searchkey)
                System.out.print(key + " ");
            System.out.println(map.get(key));
        }
        map.ceilingKey(40); // give me the key either 40 or greater than 40
        map.floorKey(40); // give me key either 40 or less than 40 
        map.subMap(12, 50);
        map.tailMap(7);
        map.headMap(6);
        map.higherKey(7); 
        map.lowerKey(6); 
        





        // map.tailMap(40); // all items >= 40
        // map.headMap(searchkey); // all items <= searchkey
        // map.ceilingKey(40); // 40 or above
        // map.higherKey(40); // key > 40
        // map.ceilingEntry(40); // one entry whose marks are 40 or 39 or 38 or
        // 37
        // map.higherEntry(40); // the students who just passed the exam
        // 40 : 123, 3456, 643
        // 49 : 34,555, 564
        // 64 : 23457, 8765, 5446
        // 72 : 3939 , 6949, 69396
        // Map<Integer, List<Integer>>
        // 64 : 23457, 8765, 5446,
    }
}
