package Numbers;
import java.util.*;

public class FactorsOfNumbers {
//    public static void main(String[] args) {
//
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the value of N: ");
//        int n = s.nextInt();
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                System.out.println(i+" ");
//            }
//        }
//    }

    //Write a program to count total factors of given number
    public static void main(String[] args) {
        int count=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = s.nextInt();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
//Enter the value of N: 12
//        1
//        2
//        3
//        4
//        6
//        12


//Write a prgam first 50 palindrome