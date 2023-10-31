package java_programme;
/**
 * Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel of Consonant, depending on the user input. If the user input Is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */

import java.util.Scanner;

public class Programme_3_FindVowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input and alphabet: ");
        String input = scanner.next();

        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Enter: Invalid input. Please enter a single letter");
        } else {
            char letter = Character.toLowerCase(input.charAt(0));

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println("Input letter is vowel");
            } else {
                System.out.println("Input letter is Consonant");
            }
        }
        scanner.close();
    }
}
