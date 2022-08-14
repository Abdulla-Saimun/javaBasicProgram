package Super;

class Person {
    int id;
    String name;
    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Emp extends Person {
    float salary;
    Emp(int id, String name, float salary) {
        super(id, name);
        this.salary = salary;
    }

    String display() {
        return "id: "+id+" ,name: "+name+" ,salary "+salary;
    }
}

public class Company {
    public static void main(String[] args) {
        Emp e1 = new Emp(23, "karim", 32325);
        System.out.println(e1.display());
    }
}
