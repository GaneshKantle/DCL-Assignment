package Arrays;
//write a program max element from the given array
public class MaxArray {
    public static void main(String[] args) {
        int[] arr = {10,40,90,20,50,40,74,39,28};
        int max = arr[0];
//        int max = arr[5];
//        int max = arr[2];
//        int max = arr[arr.length-1];
        for(int i=0; i<arr.length; i++){
            int curr = arr[i];
            if(curr > max){
                max = curr;
            }
        }
        System.out.println(max);
    }
}
