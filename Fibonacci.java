
import java.util.Scanner;

/*
Name: Ash Scarbrough
Assignment: Homework 1 - Part 1
Class: CSCI-C490 Mobile Application Development
Semester: Summer Session 1, 2016
Date: 5/23/2016
*/

public class Fibonacci {
    public static void main(String[] args) {  
        
        //Ask user for upper bound of Fibonacci sequence and take number as input
        System.out.println("Provide a number that will serve as the upper");
        System.out.println("bound of the printed Fibonacci series");
        Scanner keyboard = new Scanner(System.in);
        int upperBound = keyboard.nextInt();
        keyboard.close();

        //Print Fibonacci Sequence up to number
        System.out.println("\nThe Fibonacci sequence to the number " + upperBound + " is:");
        
        //If 0, print first number of series only
        if (upperBound == 0)
            System.out.println(0);

        //If input is greater than zero, print sequence up to number
        else if (upperBound > 0)
        {
        	//First two numbers printed as constants.
            System.out.print("0, 1");

            //Initialize new number to 0, set former sequence to 
            //initial starting values in sequence: 0, 1
            int fibNew = 0, fibFormer = 0, fibLatter = 1;   

            //Loop processes each number in sequence, includes upper
            //bound as part of sequence by stopping only if 
            //(fibFormer + fibLatter) exceeds upper bound.
            while ((fibLatter + fibFormer) <= upperBound)
            {
                fibNew = fibFormer + fibLatter;
                fibFormer = fibLatter;
                fibLatter = fibNew;
                System.out.print(", " + fibNew);
            }   
        }
        //Error if input is not 0 or positive integer
        else 
        {
        	System.out.println("Error: incorrect user input");
        }
    }
}