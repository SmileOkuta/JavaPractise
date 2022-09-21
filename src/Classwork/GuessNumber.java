package Classwork;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Guess = 15;
        int guess = 0;

        while (guess != Guess) {
            System.out.println("Enter your number: ");
            guess = input.nextInt();

            if (guess < Guess) {
                System.out.println("Too Low!");
            } else if (guess > Guess) {
                System.out.println("Too High!");
            } else System.out.println("Perfect!!!");
        }
    }
}