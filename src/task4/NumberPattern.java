package task4;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Read the number of rows from user
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        int number = 1; // Start from 1

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(number);
                number++; // Increment the number
            }
            System.out.println(); // Move to next line after each row
        }

        // Close the scanner
        scanner.close();
    }
}

