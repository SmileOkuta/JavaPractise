package assignments;

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number:  ");
        int num = input.nextInt();

        if (num % 3 == 0){
            System.out.println("Your number is divisible by 3 "  );
        }
        if (num % 3 != 0){
            System.out.println("Your number is not divisible by 3");
        }


    }
}
