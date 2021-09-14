/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Brendon Murphy
 */
package org.example;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        //initializes variables
        String initialTempType;
        String finalTempType;

        //user inputs string
        System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.");
        String finalTempChar = input.next();

        //capitalizes user input if necessary
        finalTempChar = finalTempChar.toUpperCase();
        //makes sure user inputs C or F
        if(!finalTempChar.equals("C") && !finalTempChar.equals("F")){
            System.out.println("Invalid input.");
            return;
        }
        //prints user choice of initial temperature type
        System.out.println("Your choice: " +finalTempChar);

        //changes output based on what conversion the user is doing
        if(finalTempChar.equals("C")) {
            initialTempType = "Fahrenheit";
            finalTempType = "Celsius";
        }
        else{
            initialTempType = "Celsius";
            finalTempType = "Fahrenheit";
        }

        //asks user for initial temperature
        System.out.println("Please enter the temperature in " + initialTempType +".");
        int initialTemp = input.nextInt();
        int finalTemp;
        if(finalTempChar.equals("C")) {
            finalTemp = (initialTemp - 32) * 5/9;
        }
        else{
            finalTemp = (initialTemp * 9/5) + 32;
        }


        System.out.println("The temperature in " + finalTempType + " is " +finalTemp +".");



    }
}
