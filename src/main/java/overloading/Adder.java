package overloading;

class OverloadingCls {
    static int add(int a, int b) {
        return a+b;
    }

    static int add(int a, int b, int c) {
        return a+b+c;
    }

}

public class Adder {
    public static void main(String[] args) {
        System.out.println(OverloadingCls.add(7, 53, 50));
        System.out.println(OverloadingCls.add(23, 53));
    }

}
