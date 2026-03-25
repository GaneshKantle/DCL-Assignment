package Numbers;

//public class Palindrome {
//    public static int reverse(int num) {
//        int rev = 0;
//        while (num != 0) {
//            int rem = num % 10;
//            rev = (rev * 10) + rem;
//            num = num / 10;
//        }
//        return rev;
//    }
//
//    public static void main(String[] args) {
//        int num = 121;
//        int result = reverse(num);
//        if (result == num) {
//            System.out.println("It is Palindrome");
//        } else {
//            System.out.println("Not Palindrome");
//        }
//    }
//}


//Write a program to print all the palindrome numbers between 1 to 10k
//public class Palindrome {
//    public static int reverse(int num) {
//        int rev = 0;
//        while (num != 0) {
//            int rem = num % 10;
//            rev = (rev * 10) + rem;
//            num = num / 10;
//        }
//        return rev;
//    }
//
//    public static void main(String[] args) {
//        for (int k = 1; k <= 10000; k++) {
//            int num = k;
//            int result = reverse(num);
//            if (result == num) {
//                System.out.println(result);
//            }
//        }
//    }
//}

//Write a porgam to print first 50 palindrome
//public class Palindrome {
//    public static int reverse(int num) {
//        int rev = 0;
//        while (num != 0) {
//            int rem = num % 10;
//            rev = (rev * 10) + rem;
//            num = num / 10;
//        }
//        return rev;
//    }
//
//    public static void main(String[] args) {
//        int count = 0;
//        for (int k = 1; ; k++) {
//            int num = k;
//            int result = reverse(num);
//            if (result == num) {
//                System.out.println(result);
//                count++;
//                if (count == 50) {
//                    break;
//                }
//            }
//        }
//    }
//}


//public class Palindrome {
//    public static int reverse(int num) {
//        int rev = 0;
//        while (num != 0) {
//            int rem = num % 10;
//            rev = (rev * 10) + rem;
//            num = num / 10;
//        }
//        return rev;
//    }
//
//    public static void main(String[] args) {
//        int count = 0;
//        for (int k = 1; k<=10000; k++) {
//            while (count <= 50) {
//                int num = k;
//                int result = reverse(num);
//                if (result == num) {
//                    System.out.println(result);
//                    count++;
//                }
//            }
//        }
//    }
//}

//Write a program to print the average of first x palindrome numbers
public class Palindrome {
    public static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            int rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int x = 50;
        int count = 0;
        float sum = 0;
        for (int k = 1; ; k++) {
            int num = k;
            int rev = reverse(num);
            if (rev == num) {
                sum += num;
                count++;
                if (count == x) {
                    System.out.println(sum / x);
                    break;
                }
            }
        }
    }
}