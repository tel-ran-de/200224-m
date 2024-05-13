package searchArray;

import java.util.Arrays;
import java.util.Objects;

public class SearchArray {
    public static void main(String[] args) {
        int num = 10;
        int[] arr = {3, 5, 10, 1, 0, 22, 50};
//       1) [0, 1, 3, 5, 10, 22, 50]
//        indx = arr.length / 2 = 3
//        num == arrr[indx]
//        2) [0, 1, 3] [5] [10, 22, 50]
//        3) [10, 22, 50] => indx = 1
//        4) [10] [22] [50]
//        indx = 4

//        System.out.println(linearSearch(arr, num));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr, num));
    }

    public static int linearSearch(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int num) {
        int firstIdx = 0;
        int lastIdx = arr.length - 1;

        while(firstIdx <= lastIdx) {
            int midIdx = (lastIdx + firstIdx) / 2;
            if (arr[midIdx] == num) {
                return midIdx;
            } else if (arr[midIdx] < num) {
                firstIdx = midIdx + 1;
            } else if (arr[midIdx] > num) {
                lastIdx = midIdx - 1;
            }
        }
        return -1;
    }

}
