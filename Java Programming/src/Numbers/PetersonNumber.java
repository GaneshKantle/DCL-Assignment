package Numbers;

public class PetersonNumber {
    public static int factorial(int a){
        int fact = 1;
        for(int i=1; i<=a; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int sum = 0;
        int num = 145;
        int a = 20;
        int fact = factorial(a);
        while(num!=0){
            int rem = num % 10;
            rem = rem * fact;
        }
    }
}
