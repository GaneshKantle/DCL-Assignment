package FactoryClass;

public class Car {
    public static Engine getType(String type) {
        if (type.equalsIgnoreCase("Petrol")) {
            return new Petrol();
        } else if (type.equalsIgnoreCase("Diesel")) {
            return new Diesel();
        } else if (type.equalsIgnoreCase("CNG")) {
            return new Cng();
        } else {
            System.out.println("Enter valid type");
            return null;
        }
    }
}
