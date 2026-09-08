import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class FlipHalfQueue {
    public static void main(String[] args) {
        // Queue<Integer> q = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Queue<Integer> q = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        flipHalfQueue(q);
        showq(q);
    }

    static void showq(Queue<Integer> q) {
        while (q.peek() != null) {
            System.out.print(" " + q.remove());
        }
    }

    static void flipHalfQueue(Queue<Integer> q) {
        Queue<Integer> q2 = new LinkedList<>();
        Stack<Integer> stk = new Stack<>();
        int n = q.size();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                q2.add(q.remove());
            else
                stk.push(q.remove());
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                q.add(q2.remove());
            else
                q.add(stk.pop());
        }
    }
}
