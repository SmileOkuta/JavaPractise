package Chapter2;

import java.util.Scanner;

public class LargestAndSmallestIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        while (count <= 5) {
            System.out.println("Enter the 5 digit integers: ");
            int numbers = input.nextInt();

            if (numbers < smallest){
                smallest = numbers;

            }
            if(numbers > largest){
                largest = numbers;

            }
            count++;
        }
        System.out.println(smallest+ " is the smallest number");
        System.out.println(largest+ " is the largest number");

    }

}
