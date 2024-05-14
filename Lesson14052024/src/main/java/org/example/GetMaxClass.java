package org.example;

public class GetMaxClass {
    public static void main(String[] args) {
        int[] arr = {0, -5, 7};
        System.out.println(findMax(arr));
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }
}
