public class MethodOverriding {
    static class Parent {
        void show() {
            System.out.println("This is the parent class method.");
        }

      static   class Child extends Parent {
            void show() {
                System.out.println("This is the child class method.");
            }

            public static void main(String[] args) {
                Parent obj1 = new Parent();
                obj1.show();  // Calls the method in Parent class

                Child obj2 = new Child();
                obj2.show();  // Calls the overridden method in Child class
            }
        }
    }
}
