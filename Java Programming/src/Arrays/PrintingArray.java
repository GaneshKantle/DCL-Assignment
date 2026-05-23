package Arrays;

import java.util.Arrays;

public class PrintingArray {
    public static void main(String[] args) {
        int [] arr = {12, 23, 34, 56, 67};
        System.out.println(arr.length);
        System.out.println(arr[arr.length-1]);
        System.out.println(Arrays.toString(arr));
        arr[0]=99;
        System.out.println(Arrays.toString(arr));
        arr[4]=109;
        System.out.println(Arrays.toString(arr));

    }
}


