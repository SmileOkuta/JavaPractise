package assignments;

import java.util.Scanner;

public class Nokia3310 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("1.  Contact");
        System.out.println("2.  Message");
        System.out.println("3.  Call History");
        System.out.println("4.  Settings");
        System.out.println("5.  Extra");
        System.out.println(" ");
        System.out.print("> ");

        int num = input.nextInt();

        switch (num){
            case 1:
                System.out.println("1.  New");
                System.out.println("2.  Delete");
                System.out.println("3.  Copy/Move");
                System.out.println("4.  Import/Export");
                System.out.println("5.  Search");
                break;

            case 2:
                System.out.println("1.  write Message");
                System.out.println("2.  Inbox");
                System.out.println("3.  Outbox");
                System.out.println("4.  Sent box");
                System.out.println("5.  Draft");
                break;

            case 3:
                System.out.println("1.  Call Log");
                System.out.println("2.  Dialed Calls");
                System.out.println("3.  Received calls");
                System.out.println("4.  Missed Calls");
                System.out.println("5.  Call Timer");
                break;

            case 4:
                System.out.println("1.  Phone Settings");
                System.out.println("2.  Call Settings");
                System.out.println("3.  Display");
                System.out.println("4.  profiles");
                System.out.println("5.  Network Setting");
                break;

            case 5:
                System.out.println("1.  Torch");
                System.out.println("2.  Calendar");
                System.out.println("3.  About");
                System.out.println("4.  Calculator");
                System.out.println("5.  game");
                break;

            default:
                System.out.println("Invalid Input!");
                break;

        }




    }
}
