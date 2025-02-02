package corejavapractice;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        //char [] ch ={'S','a','i','r','a','m'};
        int[] i = {1,2,-4,0};
        for (int j = 0; j < i.length; j++) {
            if (i[j] > 0) {
                System.out.println("The output is positive:" +i[j]);
            } else if (i[j]<0) {
                System.out.println("The output is negative:" +i[j]);
            }else {
                System.out.println("The output is zero:"+i[j]);
            }
        }
    }
}
            //  System.out.println("The output is:"+ch[i]);
