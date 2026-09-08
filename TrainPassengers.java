import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrainPassengers {
    public static void main(String[] args) {
        
    }
    public static List<Integer> addRemovePassengers(List<Integer> list, int[] cancelled, int[] added)
    {
        List<Integer> cancelList = new ArrayList<>();
        for(int x : cancelList) cancelList.add(x);

        list.removeAll(cancelList);
        for(int x : added)
        {
            if(! list.contains(x))
                list.add(x);
        }
        return list;

    }
}
