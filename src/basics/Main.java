package basics;

import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //System.out.printf("Hello and welcome!");
//        int num = 188;
//        int num2 = 458967556;
//        int result = num + num2;
//        System.out.println(result);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = sc.nextInt();
        int result = num1 + num2;
        System.out.println("The sum of these two numbers is : " + result);
    }
}