package java_programme;

import java.util.Scanner;

/**
 * Write a programme to input any number and check if it is prime or not.
 * Prime number is a number that is greater than 1 and divided by 1 or itself only.
 * In other words, prime numbers can't be divided by other numbers than itself or 1.
 * For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
 */
public class Programme_12_PrimeNumberCheck {
    public static void main(String[] args) {
        //Scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number. ");
        } else {
            System.out.println(number + " is not  a prime number. ");
        }
        //scanner object close
        scanner.close();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Number is divisible by a number other than 1 and itself
            }
        }
        return true; //Number is prime
    }

}
