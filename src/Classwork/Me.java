package Classwork;

import java.util.Scanner;

public class Me {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number");
        int num1 = input.nextInt();
        System.out.println("Enter your second number");
        int num2 = input.nextInt();

        int Sum = num1 + num2;
        System.out.println(Sum);

    }
}
