class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person older(Person p) {
        if (this.age > p.age)
            return this;
        else
            return p;
    }
}

public class ThisPersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Tanishka", 20);
        Person p2 = new Person("Rajan", 21);
        Person p3 = new Person("Rakesh", 22);
        Person p4 = new Person("Krishan", 18);

        Person old = p1.older(p3);
        System.out.println(old.name);
        p4.older(p2);

    }
}
