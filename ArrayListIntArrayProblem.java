import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class ArrayListIntArrayProblem {
    public static void main(String[] args) {
        Integer[] a = { 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 10 };
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(a));
        System.out.println(list);
        list.remove(7);
        System.out.println(list);
        Integer y = 7;
        list.remove(y);
        System.out.println(list);
        list.remove(list.indexOf(8));
        System.out.println(list);
        int min = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                second = min;
                min = a[i];
            } else if (a[i] < second) {
                second = a[i];
            }
        }
        System.out.println(min + " , " + second);
    }
}
