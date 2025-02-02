public class MethodOverloading {
    void display(int num) {
        System.out.println("Number: " + num);
    }
    void display(int num1, int num2) {
        System.out.println("Numbers: " + num1 + " and " + num2);
    }

    public static void main(String[] args) {
        MethodOverloading obj =new MethodOverloading();
        obj.display(10);
        obj.display(20,30);
    }
}
