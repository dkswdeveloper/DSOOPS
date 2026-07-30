class Data {
    // access modifiers public private protected
    // total types of access = 4
    private int pri = 1; // accessible only in class
    int def = 2; // only in same package (like a folder)
    protected int prot = 3; // same package + subclasses
    public int pub = 4; // accessible everywhere
}

public class AccessDemo {
    public static void main(String[] args) {
        Data d = new Data();
        // d.pri = 44; // error private data not accessible outside class
        d.def = 22; // accessible as i am in same package
        d.prot = 33; // accessible as i am in same package
        d.pub = 44; // accessible everywhere
        Box b = new Box();
        // b.len = 5; // yes public, default, protected ,

    }

}
