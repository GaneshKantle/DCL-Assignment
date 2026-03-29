package Numbers;

//Write a program to check wheather the given number is amstrong or not
//public class Amstrong {
//    public static int reverse(int num) {
//        int digit = 0;
//        while (num != 0) {
//            num = num / 10;
//            digit++;
//        }
//        return digit;
//    }
//
//    public static void main(String[] args) {
//        int num = 500457;
//        int result = reverse(num);
//        System.out.println(result);
//    }
//}


//Write a program to amstrong range 1 to 10k
//public class Amstrong {
//    public static int reverse(int num) {
//        int digit = 0;
//        while (num != 0) {
//            num = num / 10;
//            digit++;
//        }
//        return digit;
//    }
//
//    public static void main(String[] args) {
//        for (int k = 1; k <= 10000; k++) {
//            int num = k;
//            int res = num;
//            int result = reverse(num);
//            int sum = 0;
//
//            while (num != 0) {
//                int rem = num % 10;
//                sum += (int) Math.pow(rem, result);
//                num /= 10;
//            }
//
//            if(sum==res){
//                System.out.println(res);
//            }
//
//        }
//    }
//}