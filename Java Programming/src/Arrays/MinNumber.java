package Arrays;

public class MinNumber {
    public static void main(String[] args) {
        int[] arr = {-10,-40,-90,-20,-50,-40,-74,-39,-28};
        int min= arr[0];
        for(int i=0; i<arr.length; i++){
            int curr = arr[i];
            if(min < curr){
                min = curr;
            }
        }
        System.out.println(min);
    }
}
