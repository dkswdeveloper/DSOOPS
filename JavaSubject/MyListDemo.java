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
    int[] a = new int[10];
    int num = 0;
    public void add(int x)
    {
        if(num == a.length)
        {
            a = Arrays.copyOf(a,num*2);
        }
        a[num] = x;
        num++;
    }
    public void add(int index, int x)
    {
        // check index is in limits
        if(index < 0 || index > num) 
        {
            throw new IndexOutOfBoundsException();
        }
        // check there is space in array
        if(num == a.length) { a = Arrays.copyOf(a,num*2);}
        // shift elements from last to index : one step right
        for(int i = num-1; i>=index; i--) 
        {
            a[i+1] = a[i];
        }
        // insert the element at index
        a[index] = x;
    }
    @Override
    public void remove(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }
    @Override
    public int get(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }
    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }
}
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