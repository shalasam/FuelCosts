import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double gallonsInTank;
        double fuelEfficiency;
        double gasPrice;

        // Get the number of gallons of gas in the tank
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            while (!in.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number for gallons.");
                in.next(); // Consume the invalid input
            }
            gallonsInTank = in.nextDouble();
        } while (gallonsInTank <= 0);

        // Get the fuel efficiency in miles per gallon
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            while (!in.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number for fuel efficiency.");
                in.next(); // Consume the invalid input
            }
            fuelEfficiency = in.nextDouble();
        } while (fuelEfficiency <= 0);

        // Get the price of gas per gallon
        do {
            System.out.print("Enter the price of gas per gallon: ");
            while (!in.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number for gas price.");
                in.next(); // Consume the invalid input
            }
            gasPrice = in.nextDouble();
        } while (gasPrice <= 0);

        // Calculate the cost per 100 miles
        double costPer100Miles = (100 / fuelEfficiency) * gasPrice;

        // Calculate how far the car can go with the gas in the tank
        double distance = gallonsInTank * fuelEfficiency;

        // Display results
        System.out.println("\nFuel Costs Information:");
        System.out.println("Cost per 100 miles: $" + costPer100Miles);
        System.out.println("Distance with current gas: " + distance + " miles");
    }
}