
public class BoxInh {
    public static void main(String[] args) {
        Box b1 = new Box(6, 5, 4);
        System.out.println("volume =" + b1.volume());

        OpenBox ob = new OpenBox(4, 4, 4);
        System.out.println("volume " + ob.volume());
        System.out.println("surface area  " + ob.surfaceArea());

    }
}
