class Value {
    int x;
}

public class MethodDemo {
    public static void main(String[] args) {
        int x = 5;
        increment(x);
        System.out.println(x);
        Value obj = new Value();
        obj.x = 5;
        increment(obj);
        System.out.println(obj.x);
        changeObject(obj);
        System.out.println(obj.x);
    }

    public static void changeObject(Value obj) {
        obj = new Value();
        obj.x = 10;
    }

    public static void increment(int x) {
        x = x + 1;
    }

    public static void increment(Value obj) {
        obj.x = obj.x + 1;
    }
}
