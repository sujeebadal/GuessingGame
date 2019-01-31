package com.company;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner Keyboard = new Scanner(System.in);
        int x=1 + r.nextInt (10);
       // System.out.println("Random number: " + x); if you want to know what x is
        System.out.println("My random number is ");
        int my_num= Keyboard.nextInt();

        while (my_num !=x) {
            System.out.println("your guess was "+ my_num);
            System.out.println("this is wrong. Guess again");
            my_num = Keyboard.nextInt();
        }
        System.out.println("your guess was"+ my_num );
        System.out.println("That is correct! You guessed my number");
        }


    }

