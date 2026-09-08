class Point1 {
    int x, y;

    public Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "My Point as string (" + x + "," + y + ")";
    }
}
class Box1 extends Object // Object class is super class of all classes
{
    public void finalize() {
        System.out.println("Box removed from memory");
    }
}
class OpenBox1 extends Box1 {
}
public class ObjectDemo {
    public static void main(String[] args) {
        Point1 p1 = new Point1(5, 6);
        p1.getClass(); // Point1
        Object object = new Point1(5, 5);
        object.getClass(); //
        int hash = p1.hashCode();
        System.out.println(p1);
        // will call p1.toString() from Object class Box1@hashCode
        Box1 b = new Box1();
        Box1 b2 = new OpenBox1();
        String str = "hello";
        Object obj = "Hello";
        printObjectDetails("Java");
        someMethod();
        System.gc();
        System.out.println("after collecting all garbage");
        System.out.println("after calling function that creates garbage");
        printObjectDetails(b);
    }

    public static void printObjectDetails(Object obj) {
        if (obj instanceof String) {
            System.out.println("You have given a string");
        } else if (obj instanceof Box1) {
            System.out.println("You have given a box1");
        }
        System.out.println(obj.getClass());
        System.out.println(obj.toString());
        System.out.println(obj.hashCode());
        // obj.finalize(); automatically called when obj is removed from memory
        System.out.println(obj.equals("Hello"));
    }

    public static void someMethod() {
        for (int i = 1; i <= 10; i++) {
            Box1 b = new Box1();
        }
    }
}