package Java_Interview_Coding_Question.Lab_22072024;
/*
Write a program that calculates and displays the letter grade for a given numerical score
(e.g., A, B, C, D, or F) based on the following grading scale:

A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59

*/

import java.util.Scanner;

public class P005_Grade_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int num = input.nextInt();
        if (num >= 0 && num <= 59) {
            System.out.println("F");
        } else if (num>=60 && num <=69) {
            System.out.println("D");
        }
        else if (num >= 70 && num <= 79) {
            System.out.println("C");
        }
        else if (num >= 80 && num <= 89) {
            System.out.println("B");
        }
        else if (num >= 90 && num <= 100) {
            System.out.println("A");
        }

    }
}
