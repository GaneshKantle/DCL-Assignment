package Arrays;

import java.util.Arrays;

// ---- METHOD 1 OF ANTI-CLOCKWISE. MOVE THE INDEX 0 TO LAST------------------------------------------
//public class ReverseAntiClock {
//    public static int[] rotate(int[] arr) {
//        int temp = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            arr[i - 1] = arr[i];
//        }
//        arr[arr.length - 1] = temp;
//        return arr;
//    }
//    public static void main(String[] args) {
//        int[] arr = {10, 20, 30, 40, 50, 60, 70};
//        int[] res = rotate(arr);
//        System.out.println(Arrays.toString(res));
//    }
//}


// ---- METHOD 2 OF ANTI-CLOCKWISE. MOVE THE INDEX 0 TO LAST------------------------------------------
//public class ReverseAntiClock {
//    public static int[] rotate(int[] arr) {
//        int temp = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            arr[i - 1] = arr[i];
//        }
//        arr[arr.length - 1] = temp;
//        return arr;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {10, 20, 30, 40, 50, 60, 70};
//        int count = 0;
//        for(int i=1; i<=4201%arr.length; i++){
//            rotate(arr);
//            count++;
//        }
//        System.out.println(count);
//        System.out.println(Arrays.toString(arr));
//    }
//    OUTPUT:
//    1
//    [20, 30, 40, 50, 60, 70, 10]
//}

//Write a program in clock wise direction for time or right shift all the elements.
public class ReverseAntiClock {
    public static int[] rotate(int[] arr) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = temp;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int[] res = rotate(arr);
//        int count = 0;
//        for (int i = 1; i <= 4201 % arr.length; i++) {
//            rotate(arr);
//            count++;
//        }
//        System.out.println(count);
        System.out.println(Arrays.toString(arr));
    }
}

//write a program, in clockwise direction for 4200 times