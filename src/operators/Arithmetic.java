package operators;
import java.util.Scanner;

/**
 * Write a program that:
 * Takes two numbers as input.
 * Prints:
 * Sum
 * Difference
 * Product
 * Quotient
 * Remainder
 */
//Time complexity O(1)
//Space complexity O(1)
public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers: " );
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        Sum(num1 , num2);
        Difference(num1 , num2);
        Product(num1 , num2);
        Quotient(num1 , num2);
        Remainder(num1 , num2);
        scanner.close();

    }
    public static void Sum(int num1 , int num2){
        int sumResult = num1 + num2;
        System.out.println("Sum = "+sumResult);
    }
    public static void Difference(int num1 ,int num2){
        int diffResult = num1 - num2;
        System.out.println("Difference = " + diffResult);
    }
    public static void Product(int num1 , int num2){
        int prodResult = num1* num2;
        System.out.println("Product = " + prodResult);
    }
    public static void Quotient(int num1 , int num2){
        double quotientResult = (double) num1 / (double) num2;
        System.out.printf("Quotient = %.2f%n", quotientResult);
    }
    public static void Remainder(int num1 , int num2){
        int remResult = num1 % num2;
        System.out.println("Remainder =  " + remResult);
    }


}

