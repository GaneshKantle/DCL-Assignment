package Numbers;

import java.util.Scanner;
//
//public class PrimeNumber {
//    public static int prime(int num) {
//        int count = 0;
//        for (int i = 1; i <= num; i++) {
//            if (num % i == 0) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//        int num = 7;
//        int res = prime(12);
//        if (res == 2) {
//            System.out.println("It's Prime");
//        } else {
//            System.out.println("It's not prime");
//        }
//    }
//}


//Write a program to print all the prime numbers between 1 to 10k
//public class PrimeNumber {
//    public static int prime(int num) {
//        int count = 0;
//        for (int i = 1; i <= num; i++) {
//            if (num % i == 0) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//        for (int k = 1; k <= 10000; k++) {
//            int num = k;
//            int res = prime(num);
//            if (res == 2) {
//                System.out.println(num);
//            }
//        }
//    }
//}

//Write a program to print sum of first 50 prime numbers between 1 to 10k
public class PrimeNumber {
    public static int prime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        for (int k = 1; k <= 10000; k++) {
            int num = k;
            int res = prime(num);
            if (res == 2) {
                System.out.println(num);
            }
        }
    }
}


