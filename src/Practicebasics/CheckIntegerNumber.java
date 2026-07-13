package Practicebasics;

import java.util.Scanner;

/*
Problem:
Check the input number is an integer or not.

Input:
A number as an user input.

Output:
check if the number is an integer or not.

Formula:
number % 1 ==0

Time Complexity: O(1)
Space Complexity: O(1)
*/
public class CheckIntegerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the number you wants to check : ");
        //double number = scanner.nextDouble();
        System.out.println(scanner.hasNextInt());
//        evaluateNumber(number);

    }


//    public static void evaluateNumber(double number) {
//        if (number % 1 == 0)
//            System.out.println(number +" is an integer number !");
//        else
//            System.out.println(number +" is not an integer number!");
//        double number == is
//    }

}