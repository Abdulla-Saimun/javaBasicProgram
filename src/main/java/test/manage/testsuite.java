package test.manage;
public class testsuite {
    public int id;
    public String name;
    public testsuite(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return "my name is "+name;
    }

    public static void main(String[] args) {
        testsuite firstOne = new testsuite(2523, "salman");
        System.out.println(firstOne.getName());
        int newArray[] = {34, 52,63, 632};
        int count = 0;
        for(int value: newArray) {
            System.out.println("value is "+value+" and index is "+count);
            count++;
        }

        System.out.println("while loop");
        int it = 0;
        while (it<newArray.length) {
            if(newArray[it]==63) {
                System.out.println("found");
                break;
            }
            it++;
        }
    }
}