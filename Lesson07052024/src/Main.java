public class Main {
    public static void main(String[] args) {
//        int[] arr;
//        arr = new int[10];
//        for(int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        //array initialization
//        1
//        int[] arr = {1, 2, 3, 4, 5};
//        for(int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
        // 2
        int[] arr1 = new int[5];
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = i*2;
//            System.out.print(arr1[i] + " ");
        }
//        System.out.println(arr1[arr1.length]);
//        arr1[arr1.length] = 10;
        int[] arr2 = new int[arr1.length * 2];
        System.out.println(arr2.length);
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }



    }
}