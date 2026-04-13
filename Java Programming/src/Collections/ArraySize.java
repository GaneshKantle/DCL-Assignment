package Collections;

import java.util.ArrayList;

public class ArraySize {
    public static void main(String[] args) {
        ArrayList<Customers> customers = new ArrayList<>();

        customers.add(new Customers("Kantle",1,"Train"));
        customers.add(new Customers("Rukmini",2,"Bus"));
        customers.add(new Customers("Vasanth",3,"Car"));
        customers.add(new Customers("Vasanth",3,"Car"));
        customers.add(new Customers("Vasanth",3,"Car"));

        System.out.println(customers.size());

        System.out.println();

    }
}
