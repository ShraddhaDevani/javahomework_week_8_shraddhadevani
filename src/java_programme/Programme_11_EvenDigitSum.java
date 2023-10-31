package java_programme;

import java.util.Scanner;

/**
 * Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 */
public class Programme_11_EvenDigitSum {
    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int result = getEvenDigitSum(number);

        if (result == -1) {
            System.out.println("Invalid input(negative number). ");
        } else {
            System.out.println("Sum of the even digit is : " + result);
        }
        //scanner object close
        scanner.close();
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;  //Negative number is invalid
        }
        int evenDigitSum = 0;
        while (number > 0) {
            int n = number % 10;
            if (n % 2 == 0) {
                evenDigitSum += n;
            }
            number /= 10;
        }
        return evenDigitSum;
    }

}
