package FactoryClass.Payment;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.next();
        InterfPay obj = Payment.getType(type);

        if(obj!=null){
            obj.paytype();
        }
        else{
            System.out.println("Invalid Payment Type");
        }
    }
}
