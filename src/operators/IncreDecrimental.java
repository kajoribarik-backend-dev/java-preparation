package operators;

import java.util.Scanner;

/**
 * Take an integer as input. Print
 * Original value
 * Value after pre-increment
 * Value after post-increment
 * Value after pre-decrement
 * Value after post-decrement
 Concepts: ++, --
 * */
public class IncreDecrimental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
       int number = scanner.nextInt();
        System.out.println("Original value = " +number );
       int result = increment(number);
      System.out.println("Value after post-increment : " +result);
        int result1 = decrement(number);
        System.out.println("Value after post-decrement : " +result1);
    }
    public static int increment(int number){

        System.out.println("Value after Pre-increment : " + number);
        int incre = ++number;
        return incre;

    }
    public static int decrement(int number){
       System.out.println("Value after Pre-decrement : " + number);
        int decre = --number;
        return decre;

    }

}
