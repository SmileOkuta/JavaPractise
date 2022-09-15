package assignments;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Prime Number:   ");
        int num = input.nextInt();

        int division = 2;

        for (int i = 2; i < num/2; i++) {
            division = num % i;
            if (division == 0) {
                break;
            }
        }

        if (division == 0) {
            System.out.print ("The Number is not a Prime Number: ");
        }
        else {
            System.out.print("The number is a Prime Number:  ");
        }
    }
}
