package Java_Interview_Coding_Question;

import java.util.Scanner;

public class P001_How_to_Take_Input_from_Users {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the user: ");
        String name = sc.nextLine();
        System.out.println("Enter the age of the user: ");
        int age = sc.nextInt();
        System.out.println(name);
        System.out.println(age);
    }
}
