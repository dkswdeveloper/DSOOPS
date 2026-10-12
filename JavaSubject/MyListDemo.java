import java.util.Arrays;
// 76 4 3 45 7 8 5 43 6 8 2 3 4 3  5 6 7 7 8
// 4 3 7 8 5 6 
// 3 4 5 6 7 8  
// TreeSet allElements  
// LinkedHashSet / TreeSet repeatedSet 
interface MyList {
    void add(int x);
    void add(int index, int x);
    void remove(int index);
    int get(int index);
    int size();
}
class MyArrayList implements MyList {
// take an array and num as data and implement the functions
// the array should automatically increase size when
// new element is added
}
// a = Arrays.copyOf(a, newLength);
// a[]
// int[] b = new int[a.length*2];
// copy all elements
// a = b;
class MyListDemo {
    public static void main(String[] args) {
        int[] a = { 23, 4, 543, 5676, 98, 76, 56, 43, 5, 865, 4, 5 };
        int[] b = new int[a.length];
        // b should contain only odd numbers from array a
        System.out.println(Arrays.toString(b));
        int i = 0;
        for (int x : a) {
            if (x % 2 == 1) {
                b[i] = x;
                i++;
            }
        }
        System.out.println(Arrays.toString(b));
        b = Arrays.copyOf(b, i); // copyOf(oldArray,newLength)
        System.out.println(Arrays.toString(b));
        b = Arrays.copyOf(b, 25); // copyOf(oldArray,newLength)
        System.out.println(Arrays.toString(b));
        // read a line from scanner that contains integers
        // store them in an array
        // read integers untill the user enters zero
        // unlimited array
        // search
        // get
        // delete
        // add
        // interface List
        // class : ArrayList, LinkedList, Stack, Vector
        // 3 4 5 6 7 5 34 5 7 6 53 6 8 6 4 7 9 85 3 56 8 865 4 3
    }
}