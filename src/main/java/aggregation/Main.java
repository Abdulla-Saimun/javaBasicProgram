package aggregation;
import java.io.FileInputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();

        Address a1 = new Address("mohammadpur", "dhaka", "bangladesh");
        Emp emp = new Emp(23, name, a1);
        emp.display();
    }
}
