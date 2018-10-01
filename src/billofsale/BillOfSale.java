/*
 * Created by Misha Donais
 * On September 18th 2018
 * to calculate the cost, tax, total, and change for an item
 */

package billofsale;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BillOfSale {
    
    public static void main(String[] args) {
        
        //Scanner
        Scanner keyedInput = new Scanner(System.in);
        //2 decimals
        DecimalFormat x = new DecimalFormat ("###.##");
        
        //Variable declaration
        double HST = 0.13;
        System.out.println("Enter the price of the item");
        double shirtPrice = keyedInput.nextDouble();
        System.out.println("Enter the amount paid");
        double paidAmount = keyedInput.nextDouble();
        
        //calculations
        double totalPrice = shirtPrice*(1+HST);
        double taxPaid = shirtPrice*HST;
        double change = paidAmount - totalPrice;
        
        //outputting values
        System.out.println("The price of the item is equal to " + (x.format(shirtPrice)) + " dollars");
        System.out.println("The amount of tax paid is " + (x.format(taxPaid)) + " dollars");
        System.out.println("The total price is " + (x.format(totalPrice)) + " dollars");
        System.out.println("The change is " + (x.format(change)) + " dollars");
    }
    
}
