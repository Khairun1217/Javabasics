package task5;


import java.util.Scanner;

public class Primecheck {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Get number from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        // Handle special cases
        if (number <= 1) {
            isPrime = false;
        } else {
            // Check from 2 to square root of number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Display result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close scanner
        scanner.close();
    }
}



	


