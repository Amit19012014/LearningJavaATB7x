package Java_Interview_Coding_Question.Lab_22072024;

import java.util.Scanner;

public class P011_Count_vowels_and_consonants_in_a_String {
    public static void main(String[] args) {
        int vcount = 0;
        int ccount = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                //Increments the vowel counter
                vcount++;
            }
            else if (str.charAt(i) >= 'a' && str.charAt(i)<='z') {
                //Increments the consonant counter
                ccount++;
            }
        }
        System.out.println("Number of vowels: " + vcount);
        System.out.println("Number of consonants: " + ccount);
    }
}


