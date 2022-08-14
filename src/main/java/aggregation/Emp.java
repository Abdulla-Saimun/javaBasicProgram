package aggregation;

public class Emp {
    int id;
    String name;
    Address add;
    public Emp(int id, String name, Address add) {
        this.id = id;
        this.name = name;
        this.add = add;
    }
    public void display() {
        System.out.println("name is "+name+" and district is "+add.district);
    }
}
