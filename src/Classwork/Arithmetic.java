package Classwork;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Integer: ");
        int sum1 = input.nextInt();
        System.out.print("Enter Second Integer: ");
        int sum2 = input.nextInt();

        int square1 = sum1 * sum1;
        int square2 = sum2 * sum2;

        int add1 = square1 + square2;
        int add2 = square1 - square2;

        System.out.printf("First Integer:  %d%n", sum1);
        System.out.printf("Second Integer:  %d%n", sum2);
        System.out.println();
        System.out.printf("Square of First integer:  %d%n", square1);
        System.out.printf("Square of Second Integer:  %d%n", square2);
        System.out.println();
        System.out.printf("Addition of Squares:  %d%n", add1);
        System.out.printf("Difference of Squares:  %d%n", add2);


    }
}
