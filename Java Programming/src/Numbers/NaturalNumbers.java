package Numbers;

//Write a program to print the sum of first 100 natural numbers.
public class NaturalNumbers {
    public static void main(String[] args) {

        int n = 100;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
//Outout: 5050