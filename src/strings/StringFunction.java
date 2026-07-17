package strings;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringFunction {
    public static void main(String[] args) {
        String myName = "Kajori Barik";
//        Scanner scanner  = new Scanner(System.in);
//        System.out.println("Enter your name : ");
//        String myName = scanner.nextLine();
        int lengthResult = lengthFunction(myName);
        System.out.println("The length of your input is " + lengthResult);
//        System.out.println("My name is " +myName);
        String convertNameResult = lowerFunction(myName);
        System.out.println("Input in lower case " + convertNameResult);
        String convertedUppercase = upperFunction(myName);
        System.out.println("Input in upper case " + convertedUppercase);
        String trimResult = trimFunction(myName);
        System.out.println("Input after trimming "+ trimResult);
        String subString1 = subStringFunction(myName);
        System.out.println("Substring is "+ subString1);
        String subString2 = subStringFunction1(myName);
        System.out.println("New substring is "+ subString2);


    }
    public static int lengthFunction(String myName){
        //int len = myName.length();
        return myName.length();
    }
    public static  String lowerFunction( String myName){
//        String convertName = myName.toLowerCase();
        return myName.toLowerCase();
    }
    public static String upperFunction(String myName) {
        return myName.toUpperCase();
    }
    public static String trimFunction(String myName) {
        return myName.trim( );
    }
    public static String subStringFunction(String myName) {
        return myName.substring( 3);
    }
    public static String subStringFunction1(String myName) {
        return myName.substring( 0 , 6);
    }

}
