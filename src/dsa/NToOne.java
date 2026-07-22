package dsa;

import java.util.Scanner;

public class NToOne {
    public static void printNToOne(int max){
        if(max == 0){
            return;
        }
        System.out.println(max);
//        --max;
//        printNToOne(max);
        printNToOne(max - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the maximum number: ");
        int max = scanner.nextInt();
        printNToOne(max);
    }
}
