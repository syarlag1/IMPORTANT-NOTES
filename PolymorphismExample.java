
class Person {

    // Method that displays the role of a person
    void role() {
        System.out.println("I am a person.");
    }
}
class Father extends Person {
    @Override
    void role() {
        System.out.println("I am a father.");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Person p = new Father();
        p.role();
    }
}
