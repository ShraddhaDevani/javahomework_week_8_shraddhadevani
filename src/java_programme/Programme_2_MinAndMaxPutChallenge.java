package java_programme;

import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
 */
public class Programme_2_MinAndMaxPutChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Enter number : ");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            } else {
                break; //break out of the loop on invalid input
            }
            //consume the newline character
            scanner.nextLine();
        }
        scanner.close();

        if (min == Integer.MAX_VALUE && max == Integer.MIN_VALUE) {
            System.out.println("No valid numbers entered.");
        } else {
            System.out.println("Minimum number entered:" + min);
            System.out.println("Maximum number entered:" + max);
        }

    }


}
