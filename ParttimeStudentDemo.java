import java.util.Arrays;
class Student {
    private int roll;
    private String name;
    private int marks;

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

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

    public ParttimeStudent(int roll, String name, int marks, String[] classDays) {
        // Write your code here
        super(roll, name, marks);
        this.classDays = classDays;
    }

    public String toString() {
        return "ParttimeStudent [" + getRoll() + "," + getName() + "," + getMarks() + Arrays.toString(classDays) + "]";
    }
}
public class ParttimeStudentDemo {
    public static void main(String[] args) {
        String[] days = { "Saturday", "Sunday" };
        Student[] a = { new Student(101, "Dinesh", 67), new Student(121, "Aditya", 55), new Student(118, "Harshit", 87),
                new Student(105, "Krishan", 90), new ParttimeStudent(156, "Sachin", 55, days) };
        System.out.println(Arrays.toString(a));
    }
}
