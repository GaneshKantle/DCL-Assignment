class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    double sub(double a, double b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }
}


class Calci {

    public static void main(String[] args) {



        System.out.println("\n===== CALCULATOR EXAMPLE =====");

        Calculator c = new Calculator();

        System.out.println("Add: " + c.add(10, 20));
        System.out.println("Add 3 numbers: " + c.add(10, 20, 30));
        System.out.println("Add double: " + c.add(10.5, 5.5));

        System.out.println("Sub: " + c.sub(20, 10));
        System.out.println("Sub double: " + c.sub(20.5, 5.5));

        System.out.println("Multiply: " + c.multiply(5, 4));
        System.out.println("Multiply double: " + c.multiply(5.5, 4.0));
    }
}