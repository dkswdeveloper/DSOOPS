class Point {
    int x, y;
    public void show()
    {
        System.out.println("in point object x and y " + x + "," + y);
    }
}
public class ObjectBasics {
    public static void main(String[] args) {
        Point p;
        p = new Point();
        p.x = 4;
        p.y = 8;
        System.out.println("values " + p.x + "," + p.y);
        Point p2 = new Point();
        p2.x = 8;    p2.y = 4;
        Point p3;
        p3 = p2;
        p3.x = 66;    p3.y = 77;
        System.out.println(p2.x + "," + p2.y);
        p.show();
        p2.show();
        p3.show();
    }
}
