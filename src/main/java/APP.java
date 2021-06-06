/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Ashby
 */

import java.util.Calendar;
import java.util.Scanner;
import java.lang.Math;

public class APP {


    public static void main(String[] args) {
        final int legalDriveAge = 16;
        System.out.println("What is your Height in inches?");
        Scanner sc = new Scanner(System.in);
        String HeightString = sc.nextLine();

        if(!isNumeric(HeightString))
        {
            System.out.println("You answer is not parseable, please restart the program and try again");
            System.exit(-1);
        }
        System.out.println("What is your weight, in pounds?");
        String WeightString = sc.nextLine();
        if(!isNumeric(WeightString))
        {
            System.out.println("You answer is not parseable, please restart the program and try again");
            System.exit(-1);
        }


        double Height = Double.parseDouble(HeightString);
        double Weight = Double.parseDouble(WeightString);
        double BMI = (Weight / (Height * Height)) * 703;
        String OutputString  =  "Your BMI is " + Math.round(BMI*100.00)/100.00;
        if (BMI < 18.5)
        {
             OutputString  +=  "\nYou are underweight. You should see your doctor.";
        }
        else if (BMI > 25)
        {
             OutputString  +=  "\nYou are overweight. You should see your doctor.";
        }
        else
        {
             OutputString  +=  "\nYou are within the ideal weight range.";
        }
        System.out.println(OutputString);

    }

    public static boolean isNumeric(String string) {
        int intValue;


        if(string == null || string.equals("")) {
            return false;
        }

        try {
            intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
        }
        return false;
    }
}
