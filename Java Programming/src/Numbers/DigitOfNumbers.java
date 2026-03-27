package Numbers;

//    Write a program to check the digits of a given numbers
public class DigitOfNumbers {
    public static int  reverse(int num) {
        int digit=0;
        while (num != 0) {
            num = num / 10;
            digit++;
        }
        return digit;
    }

    public static void main(String[] args) {
        int num = 500457;
        int result = reverse(num);
        System.out.println(result);
    }
}
