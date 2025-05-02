package task4;


	import java.util.Scanner;
	public class Palindrome {

	
	    public static void main(String[] args) {
	        // Create Scanner object to get user input
	        Scanner scanner = new Scanner(System.in);

	        // Ask user to enter a string
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Convert the input to lowercase to make the check case-insensitive
	        input = input.toLowerCase();

	        // Flag to track if the string is a palindrome
	        boolean isPalindrome = true;

	        // Use for loop to compare characters from front and back
	        for (int i = 0; i < input.length() / 2; i++) {
	            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
	                isPalindrome = false; // Characters don't match
	                break; // Exit loop early
	            }
	        }

	        // Check the result using if-else
	        if (isPalindrome) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}

