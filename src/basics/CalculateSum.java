//sum of three numbers
package basics;

import java.util.Scanner;

public class CalculateSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();
        double number3 = sc.nextDouble();
        double sumOfTheNumbers = number1 + number2 + number3;
//        System.out.printf("The sum of the given numbers is "+ sumOfTheNumbers);
        System.out.printf("The sum of the given numbers is %.2f%n", sumOfTheNumbers);
        sc.close();

    }
}
