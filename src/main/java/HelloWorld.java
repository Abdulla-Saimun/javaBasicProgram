public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("hello world");
        String name = "salam kahn";
        System.out.println(name);
        int arr[] = {234, 452, 552, 52};
        for(int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        int doubleArray[][] = {{235432, 5523, 523, 52}, {153, 3, 25}};
        System.out.println("array value is "+ doubleArray[0][1]);
    }
}
