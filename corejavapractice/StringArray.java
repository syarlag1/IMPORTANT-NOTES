package corejavapractice;

public class StringArray {
    public static void main(String[] args) {
        //boolean b;
        String[] str3 = {"sai", "Ramya", "surya"};//Here we given the array elements
        for (int i = 0; i < str3.length; i++) {
            if (str3[i].contains("Ra")) {
                System.out.println(" Element :" + str3[i]);
            }
        }
    }
}

    //1.IN string array we given the elements
     // 2.we have taken for loop for iterating purpose
 //3.the elements gonna iterate as per the array size as base index value is 0
//after that we given the print statement
// in that print statement the array will start from index value
// And it will convert each element into lower case and it checks the string if it is matching or not
//And print the boolean value
