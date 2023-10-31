package java_programme;

import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class Programme_10_ArmstrongNumber {
    public static void main(String[] args) {
        //Scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a 3 digit number : "); //To find its is an Armstrong number.
        int number = scanner.nextInt();

        //printing result
        if (isArmstrongNumber(number)) {
            System.out.println("Number +  is an Armstrong number. ");
        } else {
            System.out.println("Number +  is not  an Armstrong number. ");
        }
        scanner.close();
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int result = 0;
        while (number != 0) {
            int reminder = number % 10;
            result = result + reminder * reminder * reminder;
            number = number / 10;
        }

        //number is Armstrong return true
        if (originalNumber == result) {
            return true;
        }
        return false;
    }

}
