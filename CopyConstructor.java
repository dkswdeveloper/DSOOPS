import java.util.Arrays;
class Student {
    int roll;
    String name;
    int[] marks = new int[5];

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
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = marks[i];
        }
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
        int[] marks = { 56, 67, 66, 49, 22 };
        Student s1 = new Student(123, "Harjot", marks);
        Student s2 = new Student(124, "Avni", marks);
        // Shallow Copy , Deep Copy
        System.out.println(Arrays.toString(s1.getMarks()));
        System.out.println(Arrays.toString(s2.getMarks()));
        marks[4] = 52;
        s1.setMarks(marks);
        System.out.println(Arrays.toString(s1.getMarks()));
        System.out.println(Arrays.toString(s2.getMarks()));
        System.out.println(s1);
        System.out.println(s1.toString());
        System.out.println(s2);
    }
}
