package arrays;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = new int[50];

        for (int i = 0; i < arr.length; i++) {
            arr[i] =  i + 1;
        }

        System.out.println(Arrays.toString(arr));

        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
