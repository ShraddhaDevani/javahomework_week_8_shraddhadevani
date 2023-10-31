package java_programme;

/**
 * Read 10 numbers from the console entered by the user and print the sum of those numbers.
 */

import java.util.Scanner;

public class Programme_1_ReadingUserInputChallenge {
    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while (count < 10) {
            int order = count + 1;
            System.out.println("Enter number #" + order + " : ");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Sum of the 10 number is: " + sum);
    }
}
