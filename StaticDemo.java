class Point {
    int x, y; // for every object
    static int orgx, orgy; // shared by all objects, for class one copy
    static {
        System.out.println("static block EXECUTED ONCE FOR EACH CLASS");
        System.out.println("TO ININTIALIZE THE STATIC DATA ");
    }
    public void show() {
        System.out.println(x + "," + y);
        System.out.println("print the orings");
        showOrigins();
    }
    public static void showOrigins() {
        System.out.println(orgx + "," + orgy);
    }
    public static int getOrgx() { return orgx; }
}

public class StaticDemo {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();
        p1.x = 1;
        p1.y = 2;
        Point.orgx = 10;
        Point.orgy = 10;
        p2.x = 11;
        p2.y = 12;
        Point.orgx = 20;
        Point.orgy = 20;
        System.out.println(p1.x + "," + p1.y + "," + Point.orgx + "," + Point.orgy);
        System.out.println(p2.x + "," + p2.y + "," + Point.orgx + "," + Point.orgy);
        Point.showOrigins();

    }
}

// static {
// System.out.println("this is static block ");
// orgx = 30; orgy = 30; // Scanner , file, database calculate
// // random data calculation
// }
// public static void printOrigins() {
// System.out.println(orgx + "," + orgy);
// // System.out.println(x + "," + y); // error
// }
// public static int getOrgx() {
// return orgx;
// }
// public void show() {
// System.out.println(x + "," + y);
// System.out.println(orgx + "," + orgy);
// }