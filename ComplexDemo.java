class Complex {
    double real, img;
    public Complex(double rl, double im) {
        System.out.println("Parameterized Constructor");
        real = rl;
        img = im;
    }
    public Complex(double rl) {
        System.out.println("Parameterized Constructor with 1 arg");
        real = rl;
    }
    public Complex() {
        System.out.println("Default Constructor");
        real = 0;
        img = 0;
    }
    public void show() {
        System.out.println(real + "+" + img + " i");
    }

    public void addReal(double r) {
        real = real + r;
    }

    public void setReal(double r) {
        real = r;
    }

    public void addImg(double im) {
        img = img + im;
    }

    public void setImg(double im) {
        img = im;
    }
}

public class ComplexDemo {
    public static void main(String[] args) {
        Complex c1 = new Complex(5, 6);
        c1.show();
        c1.addReal(4);
        c1.show();
        c1.setReal(6);
        c1.show();
        Complex c2 = new Complex();
        c2.real = 7;
        c2.img = 8; // or
        c2.setReal(7);
        c2.setImg(8);
        Complex c3 = new Complex(10);

    }
}
