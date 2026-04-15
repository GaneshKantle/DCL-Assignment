package Collections;

import java.util.ArrayList;

public class Product {
    String name;
    int id;

    public Product(String name, int id) {
        this.name = name;
        this.id = id;
    }


    public String toString() {
        return "Name:" + name +","+ "ID:" + id;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Product) {
            Product p = (Product) obj;
            return this.id == p.id && this.name.equals(p.name);
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Product> al = new ArrayList<>();
        al.add(new Product("Ganesh", 1));
        al.add(new Product("Kantle", 2));
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).name.equals("Kantle")) {
                System.out.println(i);
                System.out.println(al);
            }
        }
    }
}
