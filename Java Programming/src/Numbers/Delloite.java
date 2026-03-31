package Numbers;

//Return the smallest integer greater than N whose sum of digits is twice as sum of digits of N in java.
public class Delloite {
    public static int check(int n) {
        int res = 0;
        while (n != 0) {
            int rem = n % 10;
            res = rem + rem;
            n /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 99;
        int res = n + 1;
        while ((check(n) * 2) != (check(res))) {
            res++;
        }
        System.out.println(res);
    }
}
