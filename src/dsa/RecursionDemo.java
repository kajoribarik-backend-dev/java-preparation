//print your name 5 times using recusion
//O(n)
package dsa;

import java.util.Scanner;

public class RecursionDemo {
    static int c = 0;
    public static void printName(String name){
        if (c == 5){
            return;
        }
        else{
            System.out.println(name);
            c++;
        }
        printName(name);
    }
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        printName(name);

    }
}
