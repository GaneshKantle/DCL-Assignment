class Shape {

    void draw() {
        System.out.println("Drawing a Shape");
    }

    double area() {
        return 0;
    }
}

// Circle
class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void draw() {
        System.out.println("Drawing Circle");
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle
class Rectangle extends Shape {

    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void draw() {
        System.out.println("Drawing Rectangle");
    }

    double area() {
        return length * breadth;
    }
}

// Triangle
class Triangle extends Shape {

    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    void draw() {
        System.out.println("Drawing Triangle");
    }

    double area() {
        return 0.5 * base * height;
    }
}

class Shapes {

    public static void main(String[] args) {

        System.out.println("===== SHAPE EXAMPLE =====");

        Shape s;

        s = new Circle(5);
        s.draw();
        System.out.println("Circle Area: " + s.area());

        s = new Rectangle(10, 4);
        s.draw();
        System.out.println("Rectangle Area: " + s.area());

        s = new Triangle(6, 3);
        s.draw();
        System.out.println("Triangle Area: " + s.area());


    }
}