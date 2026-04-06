package Arrays;


import java.util.Arrays;

//write a program to check whether the given two arrays are same or not
public class SameArray {
    public static boolean check(int[] arr, int[] brr) {
        if(arr.length != brr.length){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != brr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        int[] arr = {12, 23, 34, 45, 56, 67, 78, 89};
        int arr [] = {1,2,3,4,5};
        int brr [] = {1,2,3,4,5};
        boolean result = check(arr, brr);
        System.out.println(result);
        System.out.println(Arrays.equals(arr, brr));
    }
}
