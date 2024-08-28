import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Welcome to the Student Grade Calculator");
        int numSubjects = 0;
        do {
            System.out.print("Enter the number of subjects (must be greater than 0): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a positive integer: ");
                scanner.next(); // Clear invalid input
            }
            numSubjects = scanner.nextInt();
        } while (numSubjects <= 0);
        int totalMarks = 0;
        for(int i=0;i<numSubjects;i++){
            int marks = -1;
            do {
                System.out.print("Enter marks obtained in Subject " + (i+1) + " (0-100): ");
                while (!scanner.hasNextInt()) {
                    System.out.print("Invalid input. Please enter an integer between 0 and 100: ");
                    scanner.next(); // Clear invalid input
                }
                marks = scanner.nextInt();
            } while (marks < 0 || marks > 100);
            totalMarks+=marks;
        }
        double averagePercentage = (double)totalMarks/numSubjects;
        char Grade;
        if(averagePercentage>=90){
            Grade = 'A';
        } else if (averagePercentage>=80) {
            Grade = 'B';
        } else if (averagePercentage>=70) {
            Grade = 'C';
        } else if (averagePercentage>=60) {
            Grade = 'D';
        } else if (averagePercentage>=50) {
            Grade = 'E';
        }else{
            Grade = 'F';
        }
        System.out.println("Total marks scored is: "+totalMarks);
        System.out.println("Average Percentage Gained is: "+ averagePercentage);
        System.out.println("Grade: "+Grade);
    }
}
