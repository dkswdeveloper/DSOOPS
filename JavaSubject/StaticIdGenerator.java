class Employee {
    int empid;
    String name;
    static int nextEmpid = 101;
    public Employee(String name) {
        this.name = name;
        empid = nextEmpid;
        nextEmpid++;
    }
    public void show() {
        System.out.println("Employee " + empid + ":" + name);
    }
}
class StaticIdGeenerator {
    public static void main(String[] args) {
        System.out.println("Hello Word");
        Employee e1 = new Employee("Simranjot");
        Employee e2 = new Employee("Ashish");
        Employee e3 = new Employee("Kartik");
        e1.show();
        e2.show();
        e3.show();
    }
}