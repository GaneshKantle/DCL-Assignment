package Arrays;

//write a program to find the avg of all the even numbers frmo given array
public class OddSum {
    public static void main(String[] args) {
        int[] arr = {10,40,90,20,50,67,93,40,74,39,28};
        float sum=0;
        int count =0;
        for(int i=0; i<arr.length; i++){
            int even = arr[i];
            if(even%2!=0){
                sum+=even;
                count++;
            }
        }
        System.out.println("Count of the numbers that are odd: "+count);
        System.out.println("Sum of the numbers that are odd: "+sum);
        System.out.println("Average of the numbers that are odd: "+sum/count);
    }
}
