package Classwork;

import java.util.Scanner;
public class Gallon {

        public static void main(String[] args) {

            System.out.print("Enter the miles driven: ");
            Scanner input = new Scanner(System.in);
            int miles = input.nextInt();


            System.out.print("Enter the gallons used: ");
            int gallons = input.nextInt();

            int perGallon = (gallons / miles);
            System.out.printf("Miles per gallon is ", perGallon);
        }
    }

