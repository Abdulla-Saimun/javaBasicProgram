package test.manage;

public class MaxValueFromArray  {
    public static void main(String[] args) {
        int arr[] = {23, 500, 1, 52, 444, 9};
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("max value is: "+max);
        System.out.println("min value is: "+min);
    }
}
