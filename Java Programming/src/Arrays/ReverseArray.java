package Arrays;

import java.util.Arrays;

//wirte a program to reverse the given array
//METHOD 1 OF REVERSING AN ARRAY ------------------------------------------------------------------------
//public class ReverseArray {
//    public static void main(String[] args) {
//        int[] arr = {10, 20, 30, 40, 50};
//        int[] res = new int[arr.length];
//        int k = 0;
//        for (int i = arr.length - 1; i >= 0; i--) {
//            res[k] = arr[i];
//            k++;
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(res));
//        System.out.println(res);
//    }
//}

//Write a program to reverse the given array without using resultant i
//METHOD 2 OF REVERSING AN ARRAY -------------------------------------------------------------------------
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 90, 100, 70};
//        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
