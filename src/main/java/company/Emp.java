package company;

public class Emp {
    int id;
    String name;
    Address address;
    public Emp(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.division+" "+address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("Mohammadput", "Dhaka", "Bangladesh");
        Address address2 = new Address("oxygen", "Chittagong", "Bangladesh");

        Emp empOne = new Emp(1, "Hasan", address2);
        Emp empTwo = new Emp(2, "Mangta", address1);
        empOne.display();
        empTwo.display();
    }
}
