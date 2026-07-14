package basics;
/*
Problem:
Convert kilometers to miles.

Input:
Distance in kilometers.

Output:
Equivalent distance in miles.

Formula:
miles = kilometers × 0.621371

Time Complexity: O(1)
Space Complexity: O(1)
*/
import java.util.Scanner;

public class KilometersToMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in kilometers : ");
        double kilometers = scanner.nextDouble();
//        conversionOfKmToMiles(kilometers);
        double miles = conversionOfKmToMiles(kilometers);
        System.out.printf("%.2f kilometers = %.2f miles%n", kilometers, miles);
        scanner.close();

    }
    public static double conversionOfKmToMiles(double kiloMeters){
        double kilometers = kiloMeters;
        double miles = kiloMeters * 0.621371;
//        System.out.println(kiloMeters +"kilometers is "+miles +" MILES");
//        System.out.printf("%.2f kilometers = %.2f miles%n", kilometers, miles);
        return miles;

    }
}
