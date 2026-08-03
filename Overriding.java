class Box {
    protected double len, wid, ht;
    public Box(double len, double wid, double ht) {
        this.len = len;
        this.wid = wid;
        this.ht = ht;
    }
    public double volume() {
        return len * wid * ht;
    }
    public void show() {
        System.out.println("Box  " + len + "," + wid + "," + ht);
    }
    public double surfaceArea() {
        return 2 * (len * wid + wid * ht + ht * len);
    }
}
class OpenBox extends Box {
    String color;
    public OpenBox(double len, double wid, double ht) {
        // call super class constructor
        super(len, wid, ht); this.color = "blue";
    }
    public String getColor() { return color;}
    public void setColor(String color) { this.color = color;}
    public double surfaceArea() {
        // openbox :
        return len * wid + 2 * (wid * ht + ht * len);
    }
    public void show()
    {
        System.out.println("OpenBox  " + len + "," + wid + "," + ht);
    }
}
public class Overriding {
    public static void main(String[] args) {
        Box b1 = new Box(6, 5, 4);
        System.out.println("volume =" + b1.volume());
        b1.show(); // superclass

        OpenBox ob = new OpenBox(4, 4, 4);
        System.out.println("volume " + ob.volume());
        b1 = ob; 
        System.out.println(b1.volume());
        // b1.getColor(); // ERROR : subclass functions not accessible
        b1.show(); // will be called from Subclass 
        b1.surfaceArea();// will be called from subclass 


    }
}
