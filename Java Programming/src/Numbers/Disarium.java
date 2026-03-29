package Numbers;

//Write the program to check wheather the given number is diserium number
//public class Disarium {
//    public static int Digits(int num) {
//        int count = 0;
//        while (num != 0) {
//            num /= 10;
//            count++;
//        }
//        return count;
//    }
//
//    public static int Disarium(int num) {
//        int digits = Digits(num);
//
//        int res = 0;
//        while (num != 0) {
//            int rem = num % 10;
//            res = res + (int) Math.pow(rem, digits);
//            num /= 10;
//            digits--;
//        }
//        return res;
//    }
//
//    public static void main(String[] args) {
//        int num = 405;
//        int res = Disarium(num);
//        if (res == num) {
//            System.out.println(res);
//        }
//        else{
//            System.out.println("not");
//        }
//    }
//}

//Write the program to print all diserium number range from 1 to 10k
public class Disarium {
    public static int Digits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static int Disarium(int num) {
        int digits = Digits(num);

        int res = 0;
        while (num != 0) {
            int rem = num % 10;
            res = res + (int) Math.pow(rem, digits);
            num /= 10;
            digits--;
        }
        return res;
    }

    public static void main(String[] args) {
        int num = 405;
        int res = Disarium(num);
        if (res == num) {
            System.out.println(res);
        }
        else{
            System.out.println("not");
        }
    }
}

//Write a program to check the given number is neon or not