import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
public class RemoveDuplicate {
    public static void main(String[] args) {
        Integer[] a = { 1, 2, 3, 4, 1, 2, 3, 4, 6, 7, 8, 4, 10 };
        List<Integer> reverseList = new LinkedList<>();
        for(int x: a)
        {
            reverseList.add(0,x);
        }
        
        List<Integer> list = new ArrayList<>();
        Set<Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.addAll(list); 
        System.out.println(linkedSet);
        for(int x : linkedSet) { System.out.print(x + " ");}

        list.addAll(Arrays.asList(a));
        Set<Integer> set = new HashSet<>();
        for(int x : list)
        {
            if(!set.contains(x))
            {
                System.out.print(x + " ");
                set.add(x);
            }
        }

    }
}
