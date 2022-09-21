package Classwork;

import java.util.Scanner;

public class Comparing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Integer:  ");
        int num = input.nextInt();

        int square = num * num;

        if(num > 100 ){
            System.out.printf("%d > 100 %n", num);
        }
        if(num == 100 ){
            System.out.printf("%d == 100 %n",num);
        }
        if(num != 100){
            System.out.printf("%d != 100 %n", num);
        }
        if(num < 100){
            System.out.printf("%d < 100 %n", num);
        }
        if(square > 100){
            System.out.printf("%d > 100 %n", square);
        }
        if(square == 100){
            System.out.printf("%d == 100 %n", square);
        }
        if(square != 100){
            System.out.printf("%d != 100 %n", square);
        }
        if(square < 100){
            System.out.printf("%d < 100 %n", square);
        }


    }
}
