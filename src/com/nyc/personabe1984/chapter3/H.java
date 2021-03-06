package com.nyc.personabe1984.chapter3;

import java.util.Random;

/**
 *  3.8
 *  Write a program that generates a random year between 1800 and 2000 and then report whether if it is a leap year.
 *  A leap year is an integer greater than 1584 that is either divisible by 400 or is divisible by 4 but not 100.
 *  To generate an integer in the range 1800 to 2000, use
 *      int year = Math.round(200*x + 1800);
 *  Where x is a random float. The round() method of the Math class returns the integer nearest the float passed to it.
 *  The transformation y = 200x + 1800 converts a number in the range 0 <= x < 1 into a number in the range
 *  1800 <= y < 2000.
 */
public class H {

    public static void main(String[] args) {
        Random random = new Random();
        float x = random.nextFloat();
        System.out.println("x = " + x);
        int year = Math.round(200 * x + 1800);
        System.out.println("The year is " + year);
        if(year % 400 == 0 || year % 100 != 0 && year % 4 == 0  ){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }


    }
}
