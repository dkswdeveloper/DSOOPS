import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
// interface without methods : Marker Interface
// converting object to bytes : Serialization 
// bytes to object : De serialization 
class Student implements Serializable {
    int roll;
    String name;
    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
    public String toString() {
        return "Student [" + roll + "," + name + "]";
    }
}
public class SerializationDemo {
    public static void main(String[] args) {
        try {
            Student s = new Student(456, "Harmanpreet");
            FileOutputStream fout = new FileOutputStream("emp.data");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeInt(5);
            oos.writeInt(1);
            oos.writeObject(s);
            oos.close();
            fout.close();
            FileInputStream fis = new FileInputStream("emp.data");
            ObjectInputStream ois = new ObjectInputStream(fis);
            int x = ois.readInt();
            int y = ois.readInt();
            Student studentFromFile = (Student) ois.readObject();
            System.out.println(x + "," + y);
            System.out.println(studentFromFile);
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
