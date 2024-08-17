package Java_Interview_Coding_Question.Lab_22072024;
/*
Create a program that checks whether a given string is a palindrome.
A palindrome is a word or phrase that reads the same backward as forward (ignoring spaces, punctuation, and capitalization).
Use an if-else statement to determine if the string is a palindrome.
*/
import java.util.Scanner;

public class P004_Palindrome_Checker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
       int num = input.nextInt();
       int org_num = num;

        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        if (rev == org_num) {
            System.out.println(org_num + " is a palindrome.");
        }
        else {
            System.out.println(org_num + " is not a palindrome.");
        }
        }

        }


