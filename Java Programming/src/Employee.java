class Employee {

    void calculateTiming() {
        System.out.println("General employee working hours");
    }

    void shiftTiming() {
        System.out.println("General shift timing");
    }
}

class Manager extends Employee {

    void calculateTiming() {
        System.out.println("Manager works 9 hours");
    }

    void shiftTiming() {
        System.out.println("Manager shift: 9 AM - 6 PM");
    }
}

class Developer extends Employee {

    void calculateTiming() {
        System.out.println("Developer works 8 hours");
    }

    void shiftTiming() {
        System.out.println("Developer shift: 10 AM - 6 PM");
    }
}

class Intern extends Employee {

    void calculateTiming() {
        System.out.println("Intern works 6 hours");
    }

    void shiftTiming() {
        System.out.println("Intern shift: 10 AM - 4 PM");
    }
}






class Employeee {

    public static void main(String[] args) {

        System.out.println("\n===== EMPLOYEE EXAMPLE =====");

        Employee e;

        e = new Manager();
        e.calculateTiming();
        e.shiftTiming();

        e = new Developer();
        e.calculateTiming();
        e.shiftTiming();

        e = new Intern();
        e.calculateTiming();
        e.shiftTiming();

    }
}