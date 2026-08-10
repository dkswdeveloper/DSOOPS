import java.util.Arrays;

class Student
{
	int roll;
	String name;
	int marks;
	public Student(int roll, String name, int marks)
	{
		this.roll = roll; this.name = name; this.marks = marks;
	}
	public String toString()
	{
		return "Student [" + roll  +"," + name + "," + marks + "]";
	}
}
interface StudentComparator
{
	int compare(Student s1, Student s2) ;
}
class RollComparator implements StudentComparator
{
	public int compare(Student s1, Student s2) { return s1.roll - s2.roll; }
}
class MarksComparator implements StudentComparator
{
	public int compare(Student s1, Student s2) { return s1.marks - s2.marks; }
}

public class SortingInterface
{
	public static void bubbleSort(Student a[], StudentComparator comp)
	{
		int n = a.length;
		for(int i = n-1; i>0; i--)
		{
			for(int j=0; j<i; j++)
			{
				if(comp.compare(a[j], a[j+1]) > 0 )
				{
					Student t = a[j]; a[j] = a[j+1]; a[j+1] = t;
				}
			}
		}
	}
	public static void main(String args[])
	{
		Student[] a = { new Student(101, "Dinesh", 67), new Student(121, "Aditya", 55),
		new Student(118, "Harshit", 87), new Student(105, "Krishan", 90) };
		//StudentComparator comp1 = new RollComparator();
		StudentComparator comp1 = new MarksComparator();
		bubbleSort(a,comp1);
		System.out.println(Arrays.toString(a));
	}
}


