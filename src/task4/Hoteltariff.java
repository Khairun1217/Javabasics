package task4;

import java.util.Scanner;

public class Hoteltariff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading inputs
        int month = scanner.nextInt();           // Month number
        float roomRentPerDay = scanner.nextFloat(); // Room rent per day
        int numberOfDays = scanner.nextInt();    // Number of days stayed

        // Validate month
        if (month < 1 || month > 12) {
            System.out.println("Invalid Input");
            scanner.close();
            return;
        }

        // Check for peak season using switch
        switch (month) {
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
                roomRentPerDay += roomRentPerDay * 0.20f; // 20% hike
                break;
            default:
                // No price change for non-peak months
                break;
        }

        // Calculate total tariff
        float totalTariff = roomRentPerDay * numberOfDays;

        // Output with 2 decimal places
        System.out.printf("Hotel Tariff: %.2f\n", totalTariff);

        scanner.close();
    }
}

