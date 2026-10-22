import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
public class RepeatedElement {
    public static void main(String[] args) {
        // 2 1 3 4 5 3 1 6 3 8 7 1 2 3
        // print the first integer that occurs 3rd time
        Map<Integer, Integer> map = new HashMap<>();
        int[] a = { 2, 1, 3, 4, 5, 3, 1, 6, 3, 8, 7, 1, 2, 3 };
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else
                map.put(a[i], 1);
        }
        System.out.println(map);
        Set<Integer> set = new HashSet<>();
        Set<Integer> repeated = new TreeSet<>();
        for(int x : a)
        {
            boolean added = set.add(x);
            if(!added) // not added it is repeated
            {
                repeated.add(x);
            }
        }
        // print non repated elements 
        set.removeAll(repeated);
        // left with only non repeated
        // if you print random order (hashcode % 16 ) LinkedHashSet
        // same order in which added 
        
        
        // 3 : as 3 is the first number that occurs 3rd time in the list
        // print the numbers in order of the freqency in descending order
        // 3 3 3 3 1 1 1 2 2 4 5 6 8 7
        // print all non repeating elements in sorted order
        // 4 5 6 7 8
        // print repeated elements in the order they occur int the input
        // 2 1 3
    }
}
