package task5;



	import java.util.Scanner;
	public class Swapnumbers {

	
	    public static void main(String[] args) {
	        // Create Scanner object to read input
	        Scanner scanner = new Scanner(System.in);

	        // Get two numbers from the user
	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();

	        // Print original values
	        System.out.println("\nBefore swapping:");
	        System.out.println("First number: " + num1);
	        System.out.println("Second number: " + num2);

	        // Swap using a third variable
	        int temp = num1;
	        num1 = num2;
	        num2 = temp;

	        // Print values after swapping
	        System.out.println("\nAfter swapping:");
	        System.out.println("First number: " + num1);
	        System.out.println("Second number: " + num2);

	        // Close the scanner
	        scanner.close();
	    }
	}



