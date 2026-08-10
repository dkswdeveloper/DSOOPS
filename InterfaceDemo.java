interface PasswordHasher {
    public String hash(String text);

    public boolean match(String hash, String newPass);
}
interface Picture {
    public void show();
}
interface Calc {
    String type = "simple"; // this data is public static and final [SHARED
                            // CONSTANT]

    int add(int a, int b);

    int multiply(int a, int b);
}
class IntCalc implements Calc, Picture {
    int digitsSupported = 12;

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public void show() {
        System.out.println("Intcals with " + digitsSupported);
    }

    public String toString() {
        return "IntCalc object";
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Calc calc; // reference declaration is allowed
        // calc = new Calc(); // not allowed
        IntCalc obj = new IntCalc();
        calc = obj; // LHS : superclass var = subclass object
        Calc calc2 = new IntCalc();
        IntCalc calc3 = new IntCalc();
        // calc2.digitsSupported = 14; // error
        calc3.digitsSupported = 15;
        System.out.println(calc.add(5, 6));
        System.out.println(calc.multiply(5, 6));
        // calc.show(); // will not work : clac interface does not havve method
        // show()
        Picture pic = obj;
        pic.show();
        System.out.println(pic); // it will call pic.toString()
        System.out.println(pic.toString()); // it will call pic.toString()
    }
}
