package operators;

import java.util.Scanner;

/**
 Concepts:
 - Increment Operator (++)
 - Decrement Operator (--)

 Time Complexity: O(1)
 Space Complexity: O(1)
 * */
public class IncreDecrimental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
       int number = scanner.nextInt();
        System.out.println("Original value = " +number );
       int preResult = preIncrement(number);
        System.out.println("Value after pre-increment : "+preResult);
        int postResult = postIncrement(number);
        System.out.println("Value after post-increment : "+postResult);
        int preDecResult = preDecrement(number);
        System.out.println("Value after pre-decrement : " + preDecResult);
        int postDecResult = postDecrement(number);
        System.out.println("Value after post-decrement : " + postDecResult);
        scanner.close();


    }
    public static int preIncrement(int number){

        int preResult = ++number;
        return preResult;
    }
    public static int postIncrement(int number){

        int postResult = number++;
        return postResult;
    }

    public static int preDecrement(int number){

        int preDecResult = --number;
        return preDecResult;

    }
    public static int postDecrement(int number){

        int postDecResult = number--;
        return postDecResult;

    }

}
