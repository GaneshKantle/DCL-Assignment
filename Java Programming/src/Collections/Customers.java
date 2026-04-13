package Collections;

public class Customers {
    String name;
    int id;
    String j_type;

    public Customers(String name, int id ,String j_type){
        this.name=name;
        this.id=id;
        this.j_type=j_type;
    }
    public static void main(String[] args) {
        Customers c= new Customers("Ganesh",1,"Train");
    }
}
