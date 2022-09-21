package Classwork;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gradeCounter = 0;
        int total = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;


        while (gradeCounter != 10) {
            System.out.println("Enter the student Grade: ");
            int grade = input.nextInt();
            total+= grade;
            gradeCounter++;

            switch (grade / 10) {
                case 9:
                case 10:
                    aCount++;
                    break;
                case 8:
                    bCount++;
                    break;
                case 7:
                    cCount++;
                    break;
                case 6:
                    dCount++;
                    break;
                default:
                    fCount++;
                    break;
            }

        }
        System.out.printf("Number of Grade marked %d%n" +
                "Total Score %d%n" +
                "Total A scores %d%n" +
                "Total B scores %d%n" +
                "Total C scores %d%n" +
                "Total D scores %d%n" +
                "Total F scores %d%n", gradeCounter, total, aCount, bCount, cCount, dCount, fCount);
    }
}
