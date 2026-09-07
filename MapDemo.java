import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;
import java.util.List;
public class MapDemo {
    public static void main(String[] args) {
        // Storing similar data types array : int 23 34 34 34 34 6744 685
        // array of double 3.45 6.5
        // array of Object : any object work (not basic data type) Integer,
        // String
        // Box, Employee . . .
        // Collection : interface List interface extends Collection interface
        // List, Set array, linkedlist, hashtable , vector
        // List<String> list.add("Sumit") list.add(0, "Amit") ArrayList,
        // LinkedList
        // ArrayList<Employee> list.contains () : Override equals method in
        // Employee
        // Set<Integer> set : No duplicates allowed HashSet TreeSet
        // LinkedHashSet
        // set.contains 2 methods Override : euqals, hashCode()
        // Map<K,V> username : harjot23
        // email : <input type="text" name="useremail"
        Map<Integer, Integer> map = new HashMap<>();
        map.put(3245, 5);
        map.put(3246, 7);
        map.put(3247, 7);
        map.put(3248, 4);
        map.put(3249, 5);
        // value can repeate , not key
        Integer marks = map.get(3246);
        boolean containsKey = map.containsKey(3299);
        map.put(3247, 8); // overwrite the previous value
        System.out.println(map);
        Set<Integer> keySet = map.keySet();
        for (int roll : keySet) {
            int m = map.get(roll);
            System.out.println(roll + " : " + m);
        }
        Set<Entry<Integer, Integer>> entrySet = map.entrySet();
        // first entry there is static class named Entry in Map class key :
        // value
        for (Entry<Integer, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }
        String str = "aaabdbdbdbdababsbsbsdbdbdbdbccceeee";
        //Q1 a=10 b=12 c=4 d=4 s=2 e=4// create a frequency map for each character
        Map<Character, Integer> freqmap = new HashMap<>();
        //Q2 10 = a, 12=b 4=c,d,e 2=s
        // create map of frequency and then the list of character with that freq
        Map<Integer, List<Character>> mapFreqList = new HashMap<>();
        //Q3 Can I create a PALINDROME witht the characters of the given word.

        //Q4 Print a string that comes as a freq of each char scdeab
        // s comes 2 times, c d and e comes 4 times, a 10 times and b 12 times
        // so answer is scdeab
    }
}
