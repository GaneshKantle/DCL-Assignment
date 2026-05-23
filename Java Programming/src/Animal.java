class Animal {
    //create a class animal having two methods having sleep and sound override both the methods inside child class dog, cat, lion and all the the methods using upcasting.
    void sleep() {
        System.out.println("Animal is Sleeping");
    }

    void sound() {
        System.out.println("Animal is sounding");
    }
}

class Dog extends Animal {
    void sleep() {
        System.out.println("Dog is Sleeping");
    }

    void sound() {
        System.out.println("Dog is Meowing");
    }
}


class Cat extends Animal {
    void sleep() {
        System.out.println("Cat is Sleeping");
    }

    void sound() {
        System.out.println("Cat is Meowing");
    }
}

class Lion extends Animal {
    void sleep() {
        System.out.println("Lion is Sleeping");
    }

    void sound() {
        System.out.println("Lion is roaring");
    }
}

class Mainn {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        d.sleep();
        Cat c = new Cat();
        c.sleep();
        Lion l = new Lion();
        l.sleep();
        Animal a1=new Dog();
        a1.sleep();
    }
}
