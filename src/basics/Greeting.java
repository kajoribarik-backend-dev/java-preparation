package basics;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name : ");
        String name = scanner.nextLine();
        System.out.println("Hello " +name +", have a good day!!");
        scanner.close();
        //time and space complexity O(1)
    }
}
