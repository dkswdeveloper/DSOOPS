import java.util.Arrays;
class Student {
    private int roll;
    private String name;
    private int marks;
    public Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
    public String toString() {
        return "Student [" + roll + "," + name + "," + marks + "]";
    }
}
class ParttimeStudent extends Student {
    String[] classDays;
}
public class ParttimeStudentDemo2 {
    public static void main(String[] args) {
        String[] days = { "Saturday", "Sunday" };
        Student[] a = { new Student(101, "Dinesh", 67), new Student(121, "Aditya", 55), new Student(118, "Harshit", 87),
                new Student(105, "Krishan", 90), new ParttimeStudent(156, "Sachin", 55, days) };
        System.out.println(Arrays.toString(a));
    }
}
