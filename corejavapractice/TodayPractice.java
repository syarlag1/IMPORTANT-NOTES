package corejavapractice;

public class TodayPractice {
    public static void main(String[] args) {
        int[] i = {1, 2, 3, 4};
        String[] s = {"Sai", "Ramya", "Surya"};
        for (int element : i) {
            System.out.println("" + element);
        }
        for (String element : s) {
            if (element.contains("S")) {
                System.out.println("" + element);
            }
        }
    }
}

