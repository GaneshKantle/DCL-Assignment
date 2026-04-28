package FactoryClass.Payment;

public class Payment {
    public static InterfPay getType(String type) {
        if (type.equalsIgnoreCase("Credit")) {
          return new Credit();
        } else if (type.equalsIgnoreCase("Debit")) {
          return new Debit();
        } else if (type.equalsIgnoreCase("UPI")) {
          return new UPI();
        } else {
            System.out.println("Invalid");
            return null;
        }
    }
}
