package corejavapractice;

public class TwoForLoopPractice {
    public static void main(String[] args) {
        for (int x = 1; x <= 1; x++) {
            for (int y = 1; y <= x + 1; y++) {
                for (int z = y; z <= x + y; z++) {
                    int product = x * y * z;
                    if (product % 3 == 0) {
                        System.out.println("x = " + x + ", y = " + y + ", z = " + z + " -> Product divisible by 3");
                    } else {
                        System.out.println("x = " + x + ", y = " + y + ", z = " + z + " -> Product not divisible by 3");
                    }
                }
            }
        }
    }
}


