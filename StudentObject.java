
class Student {
    int roll;
    int marks;
    String name;

    public void show() {
        System.out.println("Student " + roll + "," + name + "," + marks);
    }
    /*
     * 4 constructors
     * roll name
     * name
     * roll name and marks
     * name and marks
     * to set roll, name and marks : 3 methods
     * in main call all these methods to test
     */
}

public class StudentObject {
    public static void main(String[] args) {
        int i, j, k = 0;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 3; j++) {
                k++;
            }
        }
        System.out.println(k);
        Student s = new Student();
        s.roll = 13;
        s.marks = 66;
        s.name = "Arshdeep";
        s.show();
    }
}
