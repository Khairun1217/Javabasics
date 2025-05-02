package task5;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter factorial number: ");
        int number = scanner.nextInt();

        long factorial = 1;

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate factorial
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            // Print the result
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        // Close the scanner
        scanner.close();
    }
}



