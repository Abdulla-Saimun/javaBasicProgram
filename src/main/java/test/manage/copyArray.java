package test.manage;

public class copyArray {
    public static void main(String[] args) {
        int newArr[] = {2, 5, 2, 65};
        int arr2[] = new int[newArr.length];
        for(int i = 0; i< newArr.length; i++) {
            arr2[i] = newArr[i];
        }

        for(int i = 0; i<arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
