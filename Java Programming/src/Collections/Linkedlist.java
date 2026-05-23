package Collections;

import java.util.ArrayList;

public class Linkedlist {
    public static void main(String[] args) {
        ArrayList<Product> a1 = new ArrayList<>(10);
        ArrayList<Product> a2 = new ArrayList<>(10);

        int initcap = 10;
        for (int i = 1; i <= 15; i++) {
            if (initcap >= i) {
                a1.add(new Product("Ganesh", 1));
            } else {
                a2.add(new Product("Ganesh", 1));
            }
        }
        System.out.println(a1.size());
        System.out.println(a2.size());

    }
}
