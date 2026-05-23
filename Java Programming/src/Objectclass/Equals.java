package Objectclass;

public class Equals {
    String name;
    Equals(String name){
        this.name=name;
    }

    public boolean equals(Object obj){
        if(obj instanceof Equals){
            Equals e = (Equals) obj;
            return this.name.equals(e.name);
        }
        return false;
    }

    public static void main(String[] args) {
        Equals e = new Equals("Ganesh");
        Equals e1 = new Equals("Ganesh");
        String s = "Ganesh";
        System.out.println(e.equals(e1));
    }
}
