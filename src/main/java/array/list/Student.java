package array.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {
    int rollNo;
    String name;
    int age;
    Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }
}

class Another {
    public static void main(String[] args) {
        Student s1 = new Student(35, "Jashim", 16);
        Student s2 = new Student(65, "karim", 23);
        Student s3 = new Student(12, "Aftab", 26);

        ArrayList <Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

     /*   for(Student s: list) {
            System.out.println(s.rollNo+", "+s.name);
        } */

        Iterator itr = list.iterator();

        while (itr.hasNext()) {
            Student st = (Student)itr.next();
            System.out.println(st.rollNo+", "+st.name);
        }
    }
}
