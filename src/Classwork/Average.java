package Classwork;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*System.out.print("Enter your First Integer:  ");
         int num1 = input.nextInt();
         System.out.print("Enter your Second Integer:  ");
         int num2 = input.nextInt();
         System.out.print("Enter your Third Integer:  ");
         int num3 = input.nextInt();

         int sum = num1 + num2 + num3;
         int aver = (num1 + num2 + num3) / 3;
         int pro = (num1 * num2) * num3;

         System.out.println(sum);
         System.out.println(aver);
         System.out.println(pro);

         if (num1 > num2 && num1 > num3){
         System.out.printf("Largest Number is:  %d", num1);
         }
         if (num2 > num1 && num2 > num3){
         System.out.printf("Largest Number is:  %d", num2);
         }
         if (num3 > num1 && num3 > num2){
         System.out.printf("Largest Number is:  %d%n", num3);
         }

         System.out.println();

         if (num1 < num2 && num1 < num3){
         System.out.printf("Smallest Number is:  %d%n", num1);
         }
         if (num2 < num1 && num2 < num3){
         System.out.printf("Smallest number is:  %d", num2);
         }
         if (num3 < num1 && num3 < num2){
         System.out.printf("Smallest Number is:  %d", num3);
         }**/

        /*public int addition ( int num1, int num2, int num3){
            return num1 + num2 + num3;
        }

        public int collectUserInput ( int num1, int num2, int num3){
            if (num1 <= 0 || num2 <= 0 || num3 <= 0) {
                System.out.printf("%s%n", "Invalid Input");
            }
            int result = num1 + num2 + num3;
            return result;
        }


    }*/
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public int collectUserInput(int num1, int num2, int num3) {
        if (num1 <= 0 || num2 <= 0 || num3 <= 0) {
            System.out.printf("%s%n", "Invalid Input");
        }
        int result = num1 + num2 + num3;
        return result;

    }

    public int forAverage(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3;
    }

    public int forProduct(int num1, int num2, int num3) {
        return (num1 * num2) * num3;
    }

    public int largest(int num1, int num2, int num3) {
        int largestNum = 0;
        if (num1 > num2 && num1 > num3) {
            largestNum = num1;
            System.out.printf("Largest Number is:  %d", num1);
        }
        if (num2 > num1 && num2 > num3) {
            largestNum = num2;
            System.out.printf("Largest Number is:  %d", num2);
        }
        if (num3 > num1 && num3 > num2) {
            largestNum = num3;
            System.out.printf("Largest Number is:  %d%n", num3);
        }

        return largestNum;
    }

    public int smallestNum(int num1, int num2, int num3) {
        int smallestNum = 0;
        if (num1 < num2 && num1 < num3) {
            smallestNum = num1;
            System.out.printf("Smallest Number is:  %d%n", num1);
        }
        if (num2 < num1 && num2 < num3) {
            smallestNum = num2;
            System.out.printf("Smallest number is:  %d", num2);
        }
        if (num3 < num1 && num3 < num2) {
            smallestNum = num3;
            System.out.printf("Smallest Number is:  %d", num3);
        }
        return smallestNum;
    }
}





