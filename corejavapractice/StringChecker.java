package corejavapractice;

public class StringChecker {
    public static void main(String[] args) {
        String s="SAIRAM";
        if(s.toLowerCase().contains("i")||s.toLowerCase().contains("n")){
            System.out.println("The character is present in the string:"+s);
        }
        else {
            System.out.println("The character is not present in the string:");
        }
    }
}
