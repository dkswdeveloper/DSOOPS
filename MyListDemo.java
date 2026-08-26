import java.util.Arrays;
interface MyList {
	public void add(int x); // adds an element at last
	// if the array size is small, create new larger array
	public void add(int index, int x); // shifts all elements from index
	// to last and then inserts new eleemnt at "index"
	public int size(); // returns the size of the list
	public void remove(int index); // removes element at "index" and
	// shifts all remaining elements ahead
	public int get(int index);
	public int indexOf(int x); // searches for x and returns index else -1
	public int lastIndexOf(int x); // searches for x from last and
	// returns index else -1
}
class MyListImpl implements MyList {
	private int[] a = new int[10];
	private int size = 0;
	@Override
	public void add(int x) {
		// if array contains some space
		if (size < a.length) {
			a[size] = x;
			size++;
		} else {
			// new array of some large size , copy the elemnts and insert x
			a = Arrays.copyOf(a, size * 2);
			a[size] = x;
			size++;
		}
	}

	@Override
	public void add(int index, int x) {
		// shifting logic
		if(index > size) throw new IndexOutOfBoundsException();
		add(0);
		for(int i = size -2; i>= index; i++)
		{
			a[i+1] = a[i];
		}
		a[index] = x;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void remove(int index) {
		// shifting logic
		if(index >= size) throw new IndexOutOfBoundsException();
		for(int i = index; i<size-1; i++)
		{
			a[i] = a[i+1];
		}
		size--;

	}

	@Override
	public int get(int index) {
		if (index < size) {
			return a[index];
		}
		throw new ArrayIndexOutOfBoundsException();
	}

	@Override
	public int indexOf(int x) {
		// search logic search x in the array and return index
		return -1;
	}

	@Override
	public int lastIndexOf(int x) {
		// search logic search x in the array and return index
		return -1;
	}
}
class MyListDemo {
	public static void main(String[] args) {

		

		MyList list = new MyListImpl();
		list.add(45);
		list.add(23);
		list.add(75);
		for (int i = 1; i <= 110; i++)
			list.add(i);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println("which element you want to print enter index");
		int index = sc.nextInt();
		try 
		{
		list.get(index); // might throw IndexOutOfBoundsException
		}
		catch(IndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
	}
}
/*
 * Implement the Comparator<Student> interface for a class Student with roll,
 * name, marks, cgpa as data memhers. Call the method Arrays.sort(studentsArray,
 * comparatorObject);
 * 
 * Implement the interface Comparable<Employee> for a class Employee with empid,
 * name, designation, dateOfJoining as data members. Call the method
 * Arrays.sort(employeesArray) ;
 * 
 * class Point { int x, y; public Point(int x, int y) { this.x = x; this.y = y;
 * } } class ComparableDemo { public static void main(String args[]) { Point[]
 * points = new Point[5]; points[0]=new Point(5,4)); points[1]=(new Point(2,4));
 * points[2]=(new Point(5,7)); points[3]=(new Point(5,9)); points[4]=(new
 * Point(10,4)); Arrays.sort(points); } }
 */