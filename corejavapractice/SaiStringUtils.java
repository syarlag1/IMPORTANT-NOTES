package corejavapractice;

public class SaiStringUtils {
    public static void main(String[] args) {
        SaiStringUtils obj = new SaiStringUtils();
        obj.letterReturn("Sairam"); // Pass the string value here
    }

    public void letterReturn(String s) { // Accept string parameter
        System.out.println("Length of string: " + s.length());
        for (char ch : s.toCharArray()) {
            System.out.println(ch);
        }
    }
}





//If i given any String in method it should print how many letters in it and it should return count in it