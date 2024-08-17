package Java_Interview_Coding_Question.Lab_22072024;
/*
Write a program that classifies a triangle based on its side lengths.
 Given three input values representing the lengths of the sides,
 determine if the triangle is equilateral (all sides are equal),
 isosceles (exactly two sides are equal),
  or scalene (no sides are equal).
  Use an if-else statement to classify the triangle.

 */

import java.util.Scanner;

public class P007_Triangle_Classifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter the side 2");
        int num2 = input.nextInt();
        System.out.print("Enter the side 3");
        int num3 = input.nextInt();

        if (num1 == num2 && num2 == num3 ){
            System.out.println("Triangle is equilateral ");
        }
        else if (num1 == num2 || num1 == num3 || num2 == num3){
            System.out.println("Triangle is isosceles ");
        }
        else if (num1 != num2 && num2 != num3 && num3 != num1){
            System.out.println("Triangle is scalene ");
        }
    }
}
