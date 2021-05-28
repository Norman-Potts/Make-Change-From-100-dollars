/*
 * Created by Norman Potts
 * Date: JAN/29/2015
 * I, Norman L. Potts created this java script code. 
 */
package MakeChangeFrom100dollars;

import java.util.Scanner;

/**
 * @author Norman
 * PURPOSE
 *        This program will make change from 100 dollars. 
 *        Prompt the user to enter an amount.
 *        Calculate correct change.
 *        Display the change as the number of $20 bills, $10 bills, $5 bills, twoonies, loonies, quarters, dimes, nickels, and pennies.
 * 
 * INPUT
 *     Any positive amount, with decimals.
 * PROCESSING
 *      GET amount from user.
 *         CALCULATE correct change
 *      DISPLAY the change, in 20 bills 10 bills, 5 bills, twoonies loonies, quarters.... etc...
 * 
 * OUTPUT
 *     DISPLAY  the change
 *  
 */

public class MakeChangeFrom100dollars {
   
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in ); // Scans for user input data
        
        
        // Variable for the price of puchase ammount.
        double amount; 
        System.out.print("Please enter the price of purchase: ");       
        amount = input.nextDouble(); // Double vaule recived from input.        
        
               
        // Varables for the The cash change to be displayed.
        int twenty;  int ten;  int five;  int toonie;  int loonie;  double cent;
        int quarter;  int dime;  int nickel;  int penny;
                
        
        
        amount = 100-amount; 
        System.out.printf("The change returned from $100 is: $%.2f  ", amount); // Displays value entered rouned to 2 decemals.
        
        twenty= (int)amount/20; // Calculates number of twenty dollar bills and converts to integer.
        
        System.out.printf("\n The number of twenties is: %3d  ", twenty); // Displays twenties.
    
        amount= amount%20; // The remainder from /20.
        ten= (int) amount/10; // Calculates number of tens from remainder.
        
        System.out.printf("\n The number of tens is:     %3d", ten); // Displayes number of tens.
        
        amount= amount%10; // The remainder from /10.
        five= (int) amount/5; // Calculates number of fives.
        
        System.out.printf("\n The number of fives is:    %3d", five); // Displayes number of fives.
        
        amount= amount%5; // The remainder from fives.
        toonie= (int) amount/2; // Calculates number of toonies.
        
        System.out.printf("\n The number of toonies is:  %3d", toonie);// Displayes number of tooneys.
        
        amount= amount%2; // The remainder from toonies.
        loonie= (int) amount/1; // Calculates number of loonies.
           
        System.out.printf("\n The number of loonies is:  %3d", loonie); // Displays number of loonies.
        
        amount= amount%1;               
        
        cent= 100*amount;// Converts decemal amount to cents. 
        
        
        quarter= (int) cent/25; // Divides cent, in to turicate number.
        System.out.printf("\n The number of quarters is: %3d  ", quarter);
        
           
          
        cent=cent%25; // Transfer remainder of change that is not quarters to dime test.
        dime=(int) cent/10;
        System.out.printf("\n The number of dimes is:    %3d  ", dime);// Divides dime in to turnicate number.
        
           
        cent=cent%10;// Tansfer remainder of change that is not dime to nickel test.
        nickel= (int) cent/5;
        System.out.printf("\n The number of nickel is:   %3d  ",  nickel);
        
           
        cent=cent%5;
        penny=(int) cent;
           
        System.out.printf("\n The number of pennies is:  %3d  ", penny);
        
                                   
    }    
}
