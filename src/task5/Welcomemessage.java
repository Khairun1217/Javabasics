package task5;

import java.util.Scanner;

public class Welcomemessage {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Optional: Inform user what will happen
        System.out.println("This program will print 'Welcome to Guvi' 10 times.");

        // Loop to print message 10 times
        for (int i = 1; i <= 10; i++) {
            System.out.println("Welcome to Guvi");
        }

        // Close the scanner
        scanner.close();
    }
}


