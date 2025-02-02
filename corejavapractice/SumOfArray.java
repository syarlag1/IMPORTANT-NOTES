package corejavapractice;

public class SumOfArray {
    public static void main(String[] args) {
        int[] i={1,2,3,4,5,6};
        int sum=0;
        for (int j=0;j<i.length;j++) {
            sum += i[j];
        }
            System.out.println("The output is:"+sum);
        }
    }