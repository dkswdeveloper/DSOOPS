import java.util.Scanner;
import java.util.Stack;

// 0 0 0 1 0 0 1 0
// 0 0 1 1 1 0 1 0
// 0 0 0 1 1 0 1 1
// 0 0 0 1 1 0 1 0
// 0 0 0 0 0 0 0 0 
// 0 0 0 0 0 0 1 1
// 0 0 0 0 0 0 0 0 
// 0 0 0 0 1 0 0 0 

// 1,3
// 1,2 no new addition
// 0,3  no new addition
// 1,4 done
// 2,3 done
// 2,4 no new addition done
// 3,4
// 3,3 

// i ,j 
// list.add([i,j]);
// int current = 0;
// while(!list.empty())
// {
//     si, sj = list.get(current);
//     if(a[si, sj-1] != 0 and [si,sj-1] is not in the list ) list.add [si, sj-1] 
//     if(a[si-1, sj] != 0 and [si-1,sj] is not in the list ) list.add [si-1 , sj] 
//     if(a[si, sj+1] != 0 and [si,sj+1] is not in the list ) list.add [si , sj+1 ] 
//     if(a[si+1 , sj] != 0 and [si+1 ,sj] is not in the list ) list.add [si+1  , sj ]
//     current++;
// }


// A student informs any passed information to left, right, front and back student.
// If I inform the student (1,3), how many students will get the information ? 
// 1 means student is sitting, 0 means no student is sitting there


public class PriorityQueueDemo {
    public static void main(String[] args) {

        // 3 4 5 2 7 8 9  List, Stack, Queue, PriorityQueue
        // 
        // (()())()
        Stack<Integer> stk = new Stack<>();
        int n ;
        Scanner sc =new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("from file " + n);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        stk.push(2);
        stk.push(7);
        stk.push(8);
        while(!stk.isEmpty())
        {
            int x = stk.pop();
            System.out.println(x);
        }
        String str = "(()())()"; // "(()))"  ")("
        str= "a + (b-c) - [a + b+c + {a*b} ]";
        // (()(
        Stack<Character> s = new Stack<Character>();
        for(int i = 0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == '(')
            {
                s.push(ch);
            }
            else if(ch == ')')
            {
                s.pop();
            }
        }


    }
}
