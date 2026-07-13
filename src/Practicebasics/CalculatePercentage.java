package Practicebasics;

import java.util.Scanner;

public class CalculatePercentage {
    public static void main(String[] args) {
        final int TOTAL_MARKS = 100;                                       // Total marks for each subject
        final int NUMBER_OF_SUBJECTS = 5;                                     //Total number of subject
        final int TOTAL_MARKS_SECURE = TOTAL_MARKS * NUMBER_OF_SUBJECTS;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The name of the student: ");
        String name = sc.nextLine();
        System.out.println("Enter the marks secure in subject 1: ");
        double subject1 = sc.nextDouble();
        System.out.println("Enter the marks secure in subject 2: ");
        double subject2 = sc.nextDouble();
        System.out.println("Enter the marks secure in subject 3: ");
        double subject3 = sc.nextDouble();
        System.out.println("Enter the marks secure in subject 4: ");
        double subject4 = sc.nextDouble();
        System.out.println("Enter the marks secure in subject 5: ");
        double subject5 = sc.nextDouble();

        double totalScore = subject1 + subject2 + subject3 + subject4 + subject5;

        double percentage = totalScore / TOTAL_MARKS_SECURE *100;
        System.out.printf("The percentage of %s is %.2f%%", name, percentage);
        sc.close();

    }
}

// Time complexity O(1)
// space complexity  O(1)
/*
"The time complexity is O(1) because the program performs a fixed number of input operations and arithmetic calculations regardless of the input values.
The space complexity is also O(1) because it uses only a fixed number of variables and does not allocate memory proportional to the input size."
*/