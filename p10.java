import java.util.Scanner;

public class KilometerToMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input kilometers
        System.out.print("Enter the distance in kilometers: ");
        double kilometers = scanner.nextDouble();
        
        // Conversion factor
        double conversionFactor = 0.621371;
        
        // Convert kilometers to miles
        double miles = kilometers * conversionFactor;
        
        // Output the result
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
        
        scanner.close();
    }
}
