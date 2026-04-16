package Collections;

public class Passengerr{
    int id;

    public Passengerr(int id){
        this.id=id;
    }
    public String toString(){
        return id+" ";
    }
    public int hashCode(){
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Passengerr p = (Passengerr) obj;
        return this.id == p.id;
    }
}
