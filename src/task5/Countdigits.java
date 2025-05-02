package task5;

import java.util.Scanner;

public class Countdigits {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get integer input from user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Initialize count of digits
        int count = 0;

        // Check if the number is zero, since zero has 1 digit
        if (number == 0) {
            count = 1;
        } else {
            

            // Count digits
            while (number != 0) {
                number /= 10; // Remove the last digit by dividing by 10
                count++; // Increment the count
            }
        }

        // Print the result
        System.out.println("The number of digits is: " + count);

        // Close the scanner
        scanner.close();
    }
}


