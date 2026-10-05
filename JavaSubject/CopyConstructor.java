import java.util.Arrays;
class Student {
    int roll;
    String name;
    int[] marks = new int[5];
    static double totalMarks = 0;
    static int numberOfStudents = 0;
    // Create 2 constructors one with roll and name
    // one with roll,name, marks
    // Write getter and setter methods
    // write toString() method
    public Student(Student s) {
        this.roll = s.roll;
        this.name = s.name;
        // deep copy
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s.marks[i];
        }
    }

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public Student(int roll, String name, int[] marks) {
        this.roll = roll;
        this.name = name;
        double s = 0;
        for(int i = 0; i<marks.length; i++)
        {
            this.marks[i] = marks[i];
            s += marks[i];
        }
        numberOfStudents++;
        totalMarks += s;
    }
    public static double findAverageMarks()
    {
        if(numberOfStudents == 0) return 0;
        return totalMarks/numberOfStudents; // divide by zero
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = marks[i];
        }
    }

    public String toString() {
        return "Student with roll:" + roll + " name:" + name;
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        // Use static members to find the average marks of students
        // so that when called
        double avg = Student.findAverageMarks();
        System.out.println("average =" + avg);
        // it returns the average marks of all students in all subjects
        // for 3 students with marks 300, 330 and 360 => avg = 330.0
        int[] marks = { 56, 67, 66, 49, 22 };
        Student s1 = new Student(123, "Harjot", marks);
        Student s2 = new Student(124, "Avni", marks);
        Student s3 = new Student(125, "Krishan", new int[] { 56, 78, 66, 88, 45 });
        // Shallow Copy , Deep Copy
        System.out.println(Arrays.toString(s1.getMarks()));
        System.out.println(Arrays.toString(s2.getMarks()));
        marks[4] = 52;
        s1.setMarks(marks);
        System.out.println(Arrays.toString(s1.getMarks()));
        System.out.println(Arrays.toString(s2.getMarks()));
        avg = Student.findAverageMarks();
        System.out.println("average =" + avg);
        System.out.println(s1);
        System.out.println(s1.toString());
        System.out.println(s2);
    }
}
