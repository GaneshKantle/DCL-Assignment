package Collections.HashSet;

public class Customerr {
    String name;
    int id;

    public Customerr(String name, int id){
        this.name=name;
        this.id=id;
    }

    public String toSting(){
        return name+" "+id;
    }
}
