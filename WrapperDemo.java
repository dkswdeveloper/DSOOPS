// super
// final
// wrapper
// generics
class Base {
    int x;
    public Base(int x) {
        this.x = x;
    }
    @Override
    public String toString() {
        return "Base with " + x;
    }
    final public void show() { // no one can override
        System.out.println("Base with " + x);
    }
}
final class Derived extends Base // if class is final, you can not extend it
{
    int y;

    public Derived(int x, int y) {
        super(x);
        this.y = y;
    }

    @Override
    public String toString() {
        String fromSuper = super.toString();
        return fromSuper + " with " + y;
    }
    // public void show(){ // no one can override because it is final
    // System.out.println("Base with " + x);
    // }
}
// class Derived2 extends Derived // final class can not be extended
// {
// }
public class WrapperDemo {
    public static void main(String[] args) {
        final int value = 5;
        // value++;
        int x = 5;
        int a; // default value 0 in objects. here no default value
        Integer y = 8; // default value of y is null
        String str = ""; // empty string
        String str2 = null; // length NullPointerException
        Integer obj = 10;
        Character ch = 'a';
        Float fObj = 4.5f;
        Double db = 3.4;
        Boolean bool = true;
        Byte btObj = 5;
        Short shortObj = 98; // WRAPPER CLASS OBJECTS ARE IMMUTABLE
        x = 5;
        y = 6; // y = new Integer(6); AUTO BOXING
        if (x == y) {
            System.out.println("equals");
        } else
            System.out.println("Not equal");
        x = y; // AUTO UNBOXING
        // AUTO BOXING
        // AUTO UNBOXING
        String octString = "0451";
        int octValue = Integer.parseInt(octString, 16);
        System.out.println(octValue);
        x = 1105;
        String hexString = Integer.toHexString(x);
        System.out.println(hexString);
        ch = 'a';
        System.out.println(Character.isAlphabetic(ch));
        ch = '$';
        System.out.println(Character.isAlphabetic(ch));
    }
}
