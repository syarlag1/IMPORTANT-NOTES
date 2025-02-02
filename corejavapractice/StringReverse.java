package corejavapractice;

public class StringReverse {
    public static void main(String[] args) {
        String s="SAIRAM";
        String reverse ="";
        for (int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            reverse = ch + reverse;
        }
            System.out.println("The reversed string is :"+reverse);

        }
    }
