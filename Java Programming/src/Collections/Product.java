package Collections;

public class Product {
    static String name;
    int id;

    public Product(String name, int id){
        this.name=name;
        this.id=id;
    }

    public static void main(String[] args) {
        Product p = new Product("Ganesh",1);
    }
}
