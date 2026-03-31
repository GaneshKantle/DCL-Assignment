package Assignment;

public class Customer {
    String name;

    public static void main(String[] args) {
        Customer c1 = new Customer();
        Customer c2 = new Customer();
        Customer c3 = c2;

        System.out.println(c1 == c2);
        System.out.println(c2 == c3);
        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c3));

    }
}