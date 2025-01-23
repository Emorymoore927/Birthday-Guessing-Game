/*
Name: Emory Moore
Date: January 23, 2023
Assignment: Birthday Guessing Game
Course Section: CSC 1120
Description: This game displays five cards that will be used to guess the player's birthday.
The player will look at the numbers on each card and if their birthday is on the card they input 1, and if
their birthday is not on the card they input 0.
After doing this process for all five cards, the game will guess the player's birthday.
 */

import java.util.Scanner;

public class BDay {
    private static int bday;
    public static void main (String args[]){
        Scanner scan= new Scanner(System.in);
        int i, value= 0;


        System.out.println("Is your birthday on card zero?\n" +
                "1 3 5 7 \n" +
                "9 11 13 15\n" +
                "17 19 21 23\n" +
                "25 27 29 31\n" +
                "Enter 0 for No and 1 for Yes:\n");

        //code to accept user input and then assign user response to variable i
        i = scan.nextInt();
        System.out.println("User input" + i);

        if (i==1) {
            bday = bday + 1;
        }


        System.out.println("Is your birthday on card one?\n"+
                "2 3 6 7\n" +
                "10 11 14 15\n" +
                "18 19 22 23\n" +
                "26 27 30 31\n" +
                "Enter 0 for No and 1 for Yes:\n");

        i = scan.nextInt();
        System.out.println("User input" + i);

        if (i==1) {
            bday = bday + 2;
        }

        System.out.println("Is your birthday on card two?\n"+
                "4 5 6 7\n" +
                "12 13 14 15\n" +
                "20 21 22 23\n" +
                "28 29 30 31\n" +
                "Enter 0 for No and 1 for Yes:\n");

        i = scan.nextInt();
        System.out.println("User input" + i);

        if (i==1) {
            bday = bday + 4;
        }

        System.out.println("Is your birthday on card three?\n"+
                "8 9 10 11\n" +
                "12 13 14 15\n" +
                "24 25 26 27\n" +
                "28 29 30 31\n" +
                "Enter 0 for No and 1 for Yes:\n");

        i = scan.nextInt();
        System.out.println("User input" + i);

        if (i==1) {
            bday = bday + 8;
        }

        System.out.println("Is your birthday on card four?\n" +
                "16 17 18 19\n" +
                "20 21 22 23\n" +
                "24 25 26 27\n" +
                "28 29 30 31\n" +
                "Enter 0 for No and 1 for Yes:\n");

        i = scan.nextInt();
        System.out.println("User input" + i);

        if (i==1) {
            bday = bday + 16;
        }

        System.out.println("Your birthday is on:" + bday);

    }
}
