import java.util.Arrays;
public class ArrayQuestions {
    public static void main(String[] args) {
        // Find kth minimum of the array
        // k = 1 : min, k=2 : 2nd min , k = 3, 3rd min
        // check given array is sorted or not
        // Find position of given element x in array a of n elements
        // Find length of max sorted portion of the array
        // 1 2 9 5 6 7 8 9 4 5
        // answer : 5
        // Shift all zeros to the end of the array
        // 0 1 2 3 4 5 6 7 8 9
        // 1 0 2 5 8 4 0 0 2 3
        // 1 2 5 8 4 2 3 0 0 0
        // copy all non zero elements to the 2nd array
        int[] a = { 1, 0, 2, 5, 8, 4, 0, 0, 2, 3 };
        int[] b = new int[a.length];
        int n = a.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                a[j] = a[i];
                j++;
            }
        }
        for (; j < a.length; j++) {
            a[j] = 0;
        }
        System.out.println(Arrays.toString(a));
        // for(i = 0 ; i<n; i++,j++)
        // { a[j] = a[i]
        // if(a[j] == 0) j-- ;
        // }
    }
}