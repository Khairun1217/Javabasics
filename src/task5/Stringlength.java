package task5;

import java.util.Scanner;

public class Stringlength {
    public static void main(String[] args) {
        // Scanner object (not necessary for hardcoded string, but included as requested)
        Scanner scanner = new Scanner(System.in);

        // Declare and initialize the string
        String msg = "Guvi Geek";

        // Get the length of the string
        int length = msg.length();

        // Print the length
        System.out.println("The length of the string \"" + msg + "\" is: " + length);

        // Close the scanner
        scanner.close();
    }
}


