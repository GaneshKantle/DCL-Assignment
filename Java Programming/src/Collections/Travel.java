package Collections;

public class Travel {
    String j_type;

    public Travel(String j_type){
        this.j_type=j_type;
    }

    public boolean equals(Object obj){
        if(obj instanceof Travel){
            Travel t = (Travel) obj;
            return this.j_type.equals(t.j_type);
        }
        return false;
    }
}
