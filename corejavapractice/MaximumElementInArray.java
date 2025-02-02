package corejavapractice;

public class MaximumElementInArray{
    public static void main(String[] args) {
        int[] i={1,2,3,4,5,6,7,8,9,10};
        int max =i[0];
        for (int j=0;j<i.length;j++) {
            if (i[j] > max) {
                max = i[j];
            }
        }
            System.out.println("The maximum number is:"+max);

        }
    }
