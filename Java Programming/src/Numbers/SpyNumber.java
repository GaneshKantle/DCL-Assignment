package Numbers;

public class SpyNumber {
    public static int check_digits(int num) {
        int digits = 1;
        while (num != 0) {
            int rem = num % 10;
            digits = digits * rem;
            num = num / 10;
        }
        return digits;
    }

    public static int check_sum(int num) {
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum = rem + rem;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 77777;
        int sum = check_sum(num);
        int digits = check_digits(num);

        if (sum == digits) {
            System.out.println("It's Spy Number");
        } else {
            System.out.println("It's Not Spy Number");
        }
    }
}
