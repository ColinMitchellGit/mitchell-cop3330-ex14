/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colin Mitchell
 */

package org.example;
import java.util.Scanner;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        String amount = input.nextLine();

        System.out.print("What is the state? ");
        String state = input.nextLine();

        double total = parseDouble(amount);
        String formatted_total = String.format("%.2f", total);

        if(state.equals("WI")) {
            double subtotal = total;
            double tax = subtotal * .055;
            total += tax;

            String subtotal_formatted = String.format("%.2f", subtotal);
            String tax_formatted = String.format("%.2f", tax);
            String total_formatted = String.format("%.2f", total);

            System.out.println("The subtotal is $" + subtotal_formatted + ".");
            System.out.println("The tax is $" + tax_formatted + ".");
            System.out.println("The total is $" + total_formatted + ".");
        }else{
            System.out.println("The total is $" + formatted_total + ".");
        }
    }
}
