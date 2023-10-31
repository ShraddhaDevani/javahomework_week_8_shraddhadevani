package java_programme;

import java.util.Scanner;

/**
 * Write a method called is Palindrome with one int parameter called number.
 * The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it should return false.
 * Check the tips below for more info about palindromes.
 * Example Input/Output
 * isPalindrome(-1221); → should return true
 * isPalindrome(707); → should return true
 * isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to 11212.
 */

public class Programme_5_PalindromeNumber {
    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println("It is a palindrome number.");
        } else {
            System.out.println("It is not palindrome number.");
        }
        //scanner object close
        scanner.close();
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverse = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }

        return originalNumber == reverse;
    }

}
