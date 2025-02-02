package corejavapractice;

public class PrimeNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            boolean isprime =true;
            for (int j = 1; j <= i/2; j++) {
                if (i % j == 0) {
                    isprime = false;
                    break;
                }
            }
                    if (isprime){
                        System.out.println("The Output is:"+i);
                }
            }
        }
    }