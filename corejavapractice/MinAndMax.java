package corejavapractice;

public class MinAndMax {
    public static void main(String[] args) {
        int[] i={1,2,3,4,5,6,7,8,9,10};
        int max = i[0];
        int min = i[0];
        for(int j=0;j<i.length;j++){
            if(i[j]>max){
                max=i[j];
            }
            if(i[j]<min){
                min=i[j];
            }
        }
        System.out.println("The maximum number is:"+max);
        System.out.println("The minimum number is:"+min);
    }
}
