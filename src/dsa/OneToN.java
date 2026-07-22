//Print numbers from 1 to N
// Time complexity and space complexity O(n)
package dsa;

import java.util.Scanner;

public class OneToN {
    public static void printOneToN(int min,int max){
        if (min > max){
            return;
        }
        System.out.println(min);
        min++;
        printOneToN(min,max);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the minimum value: ");
        int min = scanner.nextInt();
        System.out.println("enter the maximum value: ");
        int max = scanner.nextInt();
        printOneToN(min,max);
    }
}
