package java_programme;

import java.util.Scanner;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme_9_FibonacciNumber {
    public static void main(String[] args) {
        //Scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:  ");
        int n = scanner.nextInt();
        printFibonacciSequence(n);
        scanner.close();
    }
    public static void printFibonacciSequence(int n) {
        int first = 1;
        int second = 1;
        if (n >= 1) {
            System.out.print(first + " ");
            if (n >= 2) {
                System.out.print(second + " ");

                for (int i = 2; i < n; i++) {
                    int nextNumber = first + second;
                    System.out.print(nextNumber + " ");
                    first = second;
                    second = nextNumber;
                }

            }
        }
        System.out.println();
    }
}
