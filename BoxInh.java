class Box {
    protected double len, wid, ht;

    // private members can be accessed in class only
    // protected members : same package + subclass (derived class)
    public Box(double len, double wid, double ht) {
        this.len = len;
        this.wid = wid;
        this.ht = ht;
    }

    public double volume() {
        return len * wid * ht;
    }

    public void showBox() {
        System.out.println("Box  " + len + "," + wid + "," + ht);
    }
}

class OpenBox extends Box {
    public OpenBox(double len, double wid, double ht) {
        // call super class constructor
        super(len, wid, ht);
    }

    public double surfaceArea() {
        // openbox :
        return len * wid + 2 * (wid * ht + ht * len);
    }
}

public class BoxInh {
    public static void main(String[] args) {
        Box b1 = new Box(6, 5, 4);
        System.out.println("volume =" + b1.volume());

        OpenBox ob = new OpenBox(4, 4, 4);
        System.out.println("volume " + ob.volume());
        System.out.println("surface area  " + ob.surfaceArea());

    }
}
