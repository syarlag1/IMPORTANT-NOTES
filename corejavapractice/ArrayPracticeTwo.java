package corejavapractice;

import java.util.Scanner;

public class ArrayPracticeTwo {
    public static void main(String[] args) {
        ArrayPracticeTwo obj = new ArrayPracticeTwo();
        //obj.printParticularElement();
        obj.printParticularElementTwo("a");
    }

//    public void printParticularElement() {
//        String[] str = {"SAI", "RAM", "TEST1", "TEST2", "TEST3"};
//        for (int i = 0; i < str.length; i++) {
//            if (str[i].toLowerCase().contains("a")) {
//                System.out.println("elements are:" + str[i]);
//            }
//        }
//   }

    public void printParticularElementTwo(String character) {
        String[] str2 = {"SAI", "RAM", "TEST1", "TEST2", "TEST3"};
        for (String str3 : str2) {
            if (str3.toLowerCase().contains(character.toLowerCase())) {
                System.out.println("elements are :" + str3);
            }
        }
    }
}
//}
