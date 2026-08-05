abstract class Figure {
    public abstract double area();
    // subclass will complete it
    public  void draw(){ System.out.println("Figure drawn");}
}
class Rectangle extends Figure {
    private double length, width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double area() {
        return length * width;
    }
    public void draw() {
        System.out.println("Rectangle is drawn");
    }
}
class Circle extends Figure {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
    public void draw() {
        System.out.println("Circle is drawn");
    }
}
class FigureAbstract {
    public static double sum(Figure f1, Figure f2) {
        return f1.area() + f2.area();
    }

    public static void main(String args[]) {
        // Figure f = new Figure(); // abstract class can not be instantiated
        Figure f = null;
        Rectangle r = new Rectangle(5, 4);
        Circle c = new Circle(7);
        // sum(f, r);
        sum(c, r);
        sum(r, r);
        System.out.println(f.area());
        f = r;
        System.out.println(f.area());
        f = c;
        System.out.println(f.area());
    }
}
