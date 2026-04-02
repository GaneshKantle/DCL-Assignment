package Arrays;

import java.util.Arrays;

//wirte a program to reverse the given array
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] res = new int[arr.length];
        int k = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            res[k] = arr[i];
            k++;
        }
        System.out.println…(Arrays.toString(arr));
        System.out.println(Arrays.toString(res));
//        System.out.println(res);
    }
}
