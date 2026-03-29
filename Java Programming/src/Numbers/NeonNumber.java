package Numbers;

public class NeonNumber {
    public static int Digits(int num) {
        int num1 = num * num;
        int res = 1;
        int sum = 0;
        while (num1 != 0) {
            int rem = num1 % 10;
            sum += rem;
            num1 /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 8;
        int result = Digits(num);
        if (num == result) {
            System.out.println("It is Neon Number");
        }
        else{
            System.out.println("Nope");
        }
    }
}
