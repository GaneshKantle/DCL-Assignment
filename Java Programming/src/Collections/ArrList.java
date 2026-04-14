package Collections;

import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Product> al = new ArrayList<>();

        al.add(new Product("Ganesh",1));
        al.add(new Product("Rukmini",2));
        al.add(new Product("Vasanth",3));
        al.add(new Product("Dairy",4));
        al.add(new Product("KitKat",5));

        System.out.println(al.size());
        System.out.println(al.indexOf(Product.name=="KitKat"));
        


    }
}
