package TimeComplexity;

//The name is Gabriel Lames HCF Algorithm or Modified Euclid's Algorithm
public class GabrielHCF {
    public static void main(String[] args) {
        int a = 18;
        int b = 1;
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a != 0) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}

