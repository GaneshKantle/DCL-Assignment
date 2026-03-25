package Numbers;


public class ReverseNumber {
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
        int num = 00457;
        int result = reverse(num);
        System.out.println(result);
    }
}
//Input: 1234 Output: 4321;
//Input: 0045 Output: 73; Due to the octal number 4 & 5 is below 8
