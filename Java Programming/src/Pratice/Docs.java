package Pratice;

import java.util.ArrayList;

public class Docs extends ArrayList {
//    int a;
//    Docs() {
//        System.out.println("No args Constructor");
//    }
//    Docs(int a){
//        this();
//        System.out.println(a+", this is Param Constr");
//    }

    public static void main(String[] args) {
//        Constructor c= new Constructor(9);
    for(int i=1; i<=4; i++){
        for(int j=1; j<=5-i; j++){
            System.out.print(j+2);
        }
        System.out.println();
    }
    }
}

