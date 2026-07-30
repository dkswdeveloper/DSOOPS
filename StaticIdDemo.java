class Student {
    private static int nextRoll = 101;
    private int roll;
    private String name;
    private String address;
    // ANONYMOUS CONSTRUCTOR
    {
        System.out.println("this is anonymous constructor");
        System.out.println("it is part of every constructor");
        System.out.println("it will always run for every object");
    }

    // one more constructor with 1 argument : name
    public Student(String name, String address) {
        this.roll = nextRoll;
        nextRoll++;
        this.name = name;
        this.address = address;
    }

    public Student(String name) {
        this.roll = nextRoll;
        nextRoll++;
        this.name = name;
        this.address = "";
    }

    public void show() {
        System.out.println("Student with " + roll + "," + name + "," + address);
    }
}

public class StaticIdDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Harshdeep", "Rajpura");
        Student s2 = new Student("Harjot", "Chandigarh");
        Student s3 = new Student("Simran", "Chandigarh");
        Student s4 = new Student("Simran");
        s1.show();
        s2.show();
        s3.show();

    }
}
