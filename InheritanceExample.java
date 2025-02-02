
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog dog = new Dog();
        dog.eat();  // Method from Animal class
        dog.bark(); // Method from Dog class
    }
}
