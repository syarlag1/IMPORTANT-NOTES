package corejavapractice;

public class ArrayElements {
    //
    public static void main(String[] args) {
        String[] s = {"123", "456"};
        for (int j = 1; j <= s.length; j--) {
            if (j >=0) {
                System.out.println("" + s[j]);
            }
        }
    }
}
