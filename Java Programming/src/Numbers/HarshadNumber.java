package Numbers;

//Approach 1
//public class HarshadNumber {
//    public static int check_harshad(int num) {
//        int res = 0;
//        while (num != 0) {
//            int rem = num % 10;
//            res = res + rem;
//            num /= 10;
//        }
//
//        return res;
//    }
//
//    public static void main(String[] args) {
//        int num = 1729;
//        int result = check_harshad(num);
//        if (num % result == 0) {
//            System.out.println("It's Harshad Number");
//        } else {
//            System.out.println("It's not harshad number");
//        }
//    }
//}


public class HarshadNumber {

    public static void main(String[] args) {
        int number = 1729;
        int num = number;
        int res = 0;
        while (num != 0) {
            int rem = num % 10;
            res = res + rem;
            num /= 10;
        }


        if (number % res == 0) {
            System.out.println("It's Harshad Number");
        } else {
            System.out.println("It's not harshad number");
        }
    }
}
