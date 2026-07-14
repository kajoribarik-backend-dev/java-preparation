/*
calculate cgpa using marks of 3 subjects
*/
package basics;

import java.util.Scanner;

public class CalculateCgpa {
    public static void main(String[] args) {
        final int NUMBER_OF_SUBJECT = 3;
        final int GPA_CONVERSION =10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers secure in subject1 : ");
        double subject1 = scanner.nextDouble();
        double gpaForSubject1 = subject1 / GPA_CONVERSION;
        System.out.println("Enter the numbers secure in subject2 : ");
        double subject2 = scanner.nextDouble();
        double gpaForSubject2 = subject2 / GPA_CONVERSION;
        System.out.println("Enter the numbers secure in subject3 : ");
        double subject3 = scanner.nextDouble();
        double gpaForSubject3 = subject3 / GPA_CONVERSION;
        double totalGpa = gpaForSubject1 + gpaForSubject2 + gpaForSubject3;
        double cgpa = totalGpa / NUMBER_OF_SUBJECT;
        System.out.printf("Total CGPA is %.2f%n" ,cgpa);
        scanner.close();
        //time complexity O(1)
        //space complexity O(1)
    }
}
