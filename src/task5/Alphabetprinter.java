package task5;



	import java.util.Scanner;
	

	public class Alphabetprinter {
	    public static void main(String[] args) {
	        // Create a Scanner object (not really needed here, but included as per instructions)
	        Scanner scanner = new Scanner(System.in);

	        // Print characters from A to Z
	        System.out.println("Characters from A to Z:");
	        for (char ch = 'A'; ch <= 'Z'; ch++) {
	            System.out.print(ch + " ");
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}


