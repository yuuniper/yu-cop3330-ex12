/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Alice Yu
 */
package base;
import java.util.Scanner;

/*
Exercise 12 - Computing Simple Interest
Computing simple interest is a great way to quickly figure out whether an investment has value.
It’s also a good way to get comfortable with explicitly coding the order of operations in your programs.

Create a program that computes simple interest.
Prompt for the principal amount, the rate as a percentage, and the time,
and display the amount accrued (principal + interest).

The formula for simple interest is A = P(1 + rt), where P is the principal amount,
r is the annual rate of interest, t is the number of years the amount is invested,
and A is the amount at the end of the investment.

Example Output
Enter the principal: 1500
Enter the rate of interest: 4.3
Enter the number of years: 4
After 4 years at 4.3%, the investment will be worth $1758.

Constraints
Prompt for the rate as a percentage (like 15, not .15). Divide the input by 100 in your program.
Ensure that fractions of a cent are rounded up to the next penny.
Ensure that the output is formatted as money.

Challenges
Ensure that the values entered for principal, rate, and number of years are numeric and that the program will not let the user proceed without valid inputs.
Alter the program to use a function called calculateSimpleInterest that takes in the rate, principal, and number of years and returns the amount at the end of the investment.
In addition to printing out the final amount, print out the amount at the end of each year.
 */

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        App myApp = new App();

        double principal= myApp.readInputDouble("Enter the principal: ");
        double interest = myApp.readInputDouble("Enter the rate of interest: ");
        int years = myApp.readInputInteger("Enter the number of years: ");

        double rt = (interest / 100 ) * years;
        double simpleInterest = principal * (1 + rt);

        String outputString = ("After " + years + " years at " + interest +
                "%, the investment will be worth $" + String.format("%.2f", simpleInterest) + ".");
        myApp.printOutput(outputString);
    }

    public int readInputInteger(String input)
    {
        System.out.print(input);
        String num = in.next();
        return Integer.parseInt(num);
    }

    public double readInputDouble(String input)
    {
        System.out.print(input);
        String num = in.next();
        return Double.parseDouble(num);
    }

    public void printOutput(String input)
    {
        System.out.println(input);
    }
}
