package Numbers;

public class Happy {
    public static int check_happy(int num) {
        int res = 0;
        while (num != 0) {
            int rem = num % 10;
            res = res + (rem * rem);
            num /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        int num = 19;
        int res = check_happy(num);
        while (res != 1 && res != 4) {
            res = check_happy(res);
        }
        if (res == 1) {
            System.out.println("Happy Number");
        } else {
            System.out.println("Not an Happy Number");
        }
    }
}
