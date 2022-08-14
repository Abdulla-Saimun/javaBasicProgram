package constractor.chaining;

class Employee {
    int id;
    String name, address;
    Employee(int id) {
        this.id = id;
    }
    Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;

    }

    Employee(int id, String name) {
        this.id = id;
        this.name = name;


    }
}

public class Student {
    public static void main(String[] args) {
        Employee e1 = new Employee(234);
        Employee e2 = new Employee(45, "Rahim");
        Employee e3 = new Employee(63, "jashim", "dhaka");
        System.out.println(e1.id);
    }
}
