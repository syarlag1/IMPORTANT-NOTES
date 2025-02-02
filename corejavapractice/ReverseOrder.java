package corejavapractice;

public class ReverseOrder {
    public static void main(String[] args) {
//        for(int i=9;i>=0;i--){
//            System.out.println("The numbers are:"+i);
//        }
        String[] s={"sai","ram","Krishna"};
        for(int i=s.length-1;i>=0;i--){
            System.out.println("The reversed string is :"+s[i]);
        }
    }
}
