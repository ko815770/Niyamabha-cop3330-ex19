
package org.example;
import java.util.Scanner;
import java.util.InputMismatchException;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class App {
    public static void main(String[] args) {
        double height = 0, weight = 0;
        boolean pass = true;
        double bmi = 0;
        try {
            System.out.println("Enter you height in inches");
            Scanner input = new Scanner(System.in);
            height = input.nextDouble();
            System.out.println("Enter your weight in pounds");
            weight = input.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a numeric value");
            pass = false;
        }
        if (pass == true)
        {
            bmi = (weight / (height * height)) * 703;
            System.out.println("Your BMI is " + String.format("%.1f", bmi) + ".");
            if (bmi < 18.5)
            {
                System.out.println("You are underweight.");
            }
            else if (bmi > 25)
            {
                System.out.println("You are overweight.");
            }
            else
            {
                System.out.println("You are within the ideal weight range.");
            }
        }
    }
}