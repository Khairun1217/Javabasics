package task5;

import java.util.Scanner;

public class Seniorcitizencheck {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get age input from the user
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check if the person is a senior citizen
        if (age >= 60) {
            System.out.println("You are a senior citizen.");
        } else {
            System.out.println("You are not a senior citizen.");
        }

        // Close the scanner
        scanner.close();
    }
}


