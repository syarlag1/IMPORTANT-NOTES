package corejavapractice;

import java.util.Scanner;

public class MaximumOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First number:");
        int num1=sc.nextInt();
        System.out.println("Enter the Second number:");
        int num2=sc.nextInt();
        System.out.println("Enter the third number:");
        int num3=sc.nextInt();
//        int num1=10;
//        int num2=20;
//        int num3=30;
        if (num3>=num2&&num3>=num1){
            System.out.println("The number 3 is maximum:"+num3);
        } else if (num2>=num1&&num2>=num3) {
            System.out.println("The number 2 is maximum:"+num2);
        }else{
            System.out.println("The number 1 is maximum:"+num1);
        }
    }
}
