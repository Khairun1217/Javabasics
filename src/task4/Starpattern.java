package task4;

import java.util.Scanner;


public class Starpattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        // Upper half of the pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 2 - 1; j++) {
                if (j == i || j == (n * 2 - 2 - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower half of the pattern
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n * 2 - 1; j++) {
                if (j == i || j == (n * 2 - 2 - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
