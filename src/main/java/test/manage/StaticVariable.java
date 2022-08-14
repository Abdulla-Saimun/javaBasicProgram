package test.manage;

public class StaticVariable {
    int idNo;
    String name;
    static String college = "Daffodil International University";
    StaticVariable(int id, String name) {
        this.idNo = id;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        StaticVariable s1 = new StaticVariable(323, "fahim");
        System.out.println(s1.name);
        System.out.println(s1.getName());
        System.out.println(s1.college);
    }
}
