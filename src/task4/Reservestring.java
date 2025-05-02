package task4;

import java.util.Scanner;

public class Reservestring {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Read input string from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Initialize an empty string to store the reversed version
        String reversed = "";

        // Use a for loop to build the reversed string
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Print the reversed string
        System.out.println("Reversed string: " + reversed);

        // Close the scanner
        scanner.close();
    }
}
