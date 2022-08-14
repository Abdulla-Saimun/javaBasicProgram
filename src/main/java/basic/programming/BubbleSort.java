package basic.programming;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {34, 52, 13, 12, 90, 81};
        // bubble sort
        for(int i = 0; i< arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // print sorted array
        for(int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }
}
