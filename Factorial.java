package assignments;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input value to get it's Factorial: ");

        int factorial = 1;
        int number ;
        number = input.nextInt();

        while (number > 0){
            factorial = factorial * number;
            number --;
        }
        System.out.println("Factorial of your number = " + factorial);


    }
}
