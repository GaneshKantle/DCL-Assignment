package TimeComplexity;

import java.util.Arrays;

//Write a progam to implement bubble sort algorithm
public class BubbleSort {
    public static int[] check(int[] arr) {
        int count  = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count ++;
                }
            }
        }
        System.out.println(count);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {30, 40, 10, 60, 70, 27};
        int[] result = check(arr);
        System.out.println(Arrays.toString(result));
    }
}

//Write a program to implement merge sort algorithm
//Write a program to merge two sorted arrays in a sorted manner.(With TC of Big(O))
