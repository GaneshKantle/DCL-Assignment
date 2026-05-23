package Pratice;

public class Constructor {
    int a;
    Constructor() {
        System.out.println("No args Constructor");
    }
    Constructor(int a){
        this();
        System.out.println(a+", this is Param Constr");
    }

    public static void main(String[] args) {
        Constructor c= new Constructor(9);

    }
}

