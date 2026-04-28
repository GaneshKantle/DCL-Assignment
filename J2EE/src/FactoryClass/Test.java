package FactoryClass;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.next();
        Engine str = Car.getType(type);

        if(str!=null){
            str.start();
        }
        else{
            System.out.println("Invalid");
        }

    }
}
