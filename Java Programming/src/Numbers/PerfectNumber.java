package Numbers;

//Write a program to check weather the given number is perfect or not.
public class PerfectNumber {
    public static void main(String[] args) {

        int n = 6;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println(sum+", Hola It's Perfect!!");
        }
        else {
            System.out.println(sum+", It's Not Perfect!!");
        }
    }
}
//6, Hola It's Perfect!!


//public class PerfectNumber {
//
//    public static int check_perfect(int n) {
//        int sum = 0;
//        for (int i = 1; i < n; i++) {
//            if (n % i == 0) {
//                sum += i;
//            }
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//
//        int n = 28;
//        int sum = check_perfect(n);
//        if (sum== n) {
//            System.out.println(sum+", Hola It's Perfect!!");
//        }
//        else{
//            System.out.println(sum+", Hola It's Not Perfect!!");
//        }
//    }
//}
//28, Hola It's Perfect!!


//Write a program to print all the perfect numbers between 1 to 10k.
// Note: Converting check perfect to print perfect
//NOTE 1: If the number is perfect instead of its perfect, print the number itself
//NOTE 2: If the number is not perfect, instead of print its not perfect, no need to print any number(remove else part)
//NOTE 3: Instead of number pointing to single element it should point to extra variable as K and K should ranges from 1 to 10k
//
//public class PerfectNumber {
//
//    public static int check_perfect(int n) {
//        int sum = 0;
//        for (int i = 1; i < n; i++) {
//            if (n % i == 0) {x
//                sum += i;
//            }
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        for (int k = 1; k <= 10000; k++) {
//            int n = k;
//            int sum = check_perfect(n);
//            if (sum == n) {
//                System.out.println(n);
//            }
//        }   x
//    }
//}

