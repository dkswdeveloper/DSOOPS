class Box {
    private double len, wid, ht;

    // Write 3 constructors for the class
    // Default Constructor : 0 arguments that makes unit cube
    public Box() {
        len = 1;
        wid = 1;
        ht = 1;
    }

    // Parameterized constructor : 1 argument that makes
    // a cube with same len, wid,ht
    public Box(double side) {
        len = side;
        wid = side;
        ht = side;
    }

    // Parameterized constructor : 3 arguments that makes
    // a box with given len, wid,ht
    public Box(double len, double wid, double ht) {
        this.len = len;
        this.wid = wid;
        this.ht = ht;
    }

    // Write a method volume() that returns the volume of the box
    public double volume() {
        return len * wid * ht;
    }

    // Write a method show() that prints the len, wid and ht
    public void show() {
        // this is a keyword used to refer "CURRENT OBJECT"
        System.out.println("this= " + this);
        System.out.println("Box[" + len + "," + wid + "," + ht + "]");
    }
}

public class ThisDemo {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(4);
        Box b3 = new Box(5, 4, 3);
        System.out.println("b1= " + b1);
        System.out.println("b2= " + b2);
        System.out.println("b3= " + b3);
        b1.show();
        b2.show();
        b3.show();
        System.out.println("vol of b1 " + b1.volume());
        System.out.println("vol of b2 " + b2.volume());
        System.out.println("vol of b3 " + b3.volume());

    }

}
