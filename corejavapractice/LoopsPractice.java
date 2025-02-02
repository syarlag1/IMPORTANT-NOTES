package corejavapractice;

public class LoopsPractice {
    public static void main(String[] args) {
        String[] s = {"Sairam", "Krishna", "Sairam"};
        for (int i = 0; i < s.length; i++) {
           boolean b = false;
            for (int j = 0; j < i; j++) {
                if (s[i].equals(s[j])) {
                  b = true;
                    break;
                }
            }
                if (!b) {
                    System.out.println(s[i]);
                }
            }
        }
    }
