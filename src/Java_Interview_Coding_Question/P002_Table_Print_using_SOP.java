//package Java_Interview_Coding_Question;
//
//public class P002_Table_Print_using_SOP {

package Java_Interview_Coding_Question;

import java.util.Scanner;

public class P002_Table_Print_using_SOP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d\t%s\t%d\t%s\t%d%n", i, "X", num, "=", num * i);
        }
    }
}
