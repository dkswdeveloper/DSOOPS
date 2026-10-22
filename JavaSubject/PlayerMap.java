import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class PlayerMap {
    public static void main(String[] args) {
        TreeMap<Integer, List<String>> map = new TreeMap<>();
        map.put(12, List.of("Hardik", "Akshar"));
        map.put(30, List.of("Sachin", "Virat"));
        map.put(22, List.of("Rohit", "Dhoni"));
        map.put(10, List.of("Raina", "Jadeja"));
        System.out.println(map);>
        // Find the next series of players after Hardik
        // map of performance score and list of players name is given
        Set<Entry<Integer, List<String>>> set = map.entrySet();
        for (Entry<Integer, List<String>> entry : set) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        for (int score : map.keySet()) {
            System.out.println(score + ":" + map.get(score));
        }
    }
}
