package arrays;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1, 0};
//        int[][] matrix = new int[3][3];
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = (i + 1) * (j + 1);
//            }
//        }
//
//        for (int i = 0; i < matrix.length; i++) {
//            System.out.println(Arrays.toString(matrix[i]));
//        }

//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();

//        System.out.println(Arrays.toString(arr));

        int[] arrNew = Arrays.copyOf(arr, 5);

//        System.out.println(Arrays.toString(arrNew));

//        arrNew[2] = 10;
//        arr[0] = 100;

//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arrNew));
//
//        Arrays.sort(arrNew);
        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arrNew));

        int[] arr2 = Arrays.copyOfRange(arr, arr.length - 2, arr.length);
        System.out.println(Arrays.toString(arr2));





    }
}
