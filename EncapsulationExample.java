public class EncapsulationExample {
        private String name;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public static void main(String[] args) {
           EncapsulationExample encap = new EncapsulationExample();
            encap.setName("John");
            System.out.println("Student Name: " + encap.getName());
        }
    }
