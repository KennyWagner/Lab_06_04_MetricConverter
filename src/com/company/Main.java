package com.company;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        double meters;
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a length in meters: ");
        if (in.hasNextDouble())
        {
            meters = in.nextDouble();

            System.out.println(meters +" meters is equal to " + meters / 1609 + " miles.");
            System.out.println(meters +" meters is equal to " + meters * 3.281 + " feet.");
            System.out.println(meters +" meters is equal to " + meters * 39.37 + " inches.");
        }
        else
        {
            System.out.println("Error, invalid input, please enter a number");
        }
    }
}
