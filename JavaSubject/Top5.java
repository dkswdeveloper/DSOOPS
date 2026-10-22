import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class Top5 {
    public static void main(String[] args) {
        
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(34);
        pq.add(12);
        pq.add(90);
        pq.add(55);
        pq.add(84);
        while(! pq.isEmpty())
        {
            int x= pq.remove();
            System.out.println(x);
        }

        // print top 5 elements of the given array whitout sorting it
        // read n, read n integers and print top 5 elements 

        // read an array and print the median of the array without sorting it
        // add 2 more elements to the array and print median again
        // 12 4 56 78 33 94 79 61 30 100
        // 4 12 30 33 56 61 78 79 94 100 
        pq max heap      pq min heap     median
        12                                      12
        4 12  
        4               12                 8
        4               12,  56               12
        4               12,  56 78               12
        4 12            56 78               12 + 56 /2= 34
        4 12 33         56 78               33
        4 12 33         56 78, 94           33 + 56 / 2 
        4 12 33         56 78, 79, 94        56
        4 12 30 33      56 78, 79, 94        33 + 56 / 2 











        // https://exam.testpad.chitkara.edu.in/test/21oct

        // code 3370

        https://exam.testpad.chitkara.edu.in/test/practice-1
        Code 1122
        



    }
}
