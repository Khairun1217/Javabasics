package task5;

import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        int a, b, c, d;

        // Get input from user
        System.out.print("Enter value for a: ");
        a = scanner.nextInt();

        System.out.print("Enter value for b: ");
        b = scanner.nextInt();

        System.out.print("Enter value for c: ");
        c = scanner.nextInt();

        System.out.print("Enter value for d: ");
        d = scanner.nextInt();

        // Compare sums
        if ((a + b) > (c + d)) {
            System.out.println("The sum of a and b is greater than the sum of c and d.");
        } else {
            System.out.println("The sum of a and b is not greater than the sum of c and d.");
        }

        // Close the scanner
        scanner.close();
    }
}



