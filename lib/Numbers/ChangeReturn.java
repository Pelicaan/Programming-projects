/*Change Return Program - 
The user enters a cost and then the amount of money given. 
The program will figure out the change and the number of quarters, dimes, nickels, pennies needed for the change.
*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ChangeReturn {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BigDecimal cost;
        BigDecimal payment;
        BigDecimal change;

        BigDecimal q= new BigDecimal(".25");
		BigDecimal d= new BigDecimal(".1");
		BigDecimal n= new BigDecimal(".05");
		BigDecimal p= new BigDecimal(".01");
		BigDecimal naught= new BigDecimal("0");
        
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;

        
        System.out.println("Enter total cost:");
        cost = scanner.nextBigDecimal();
        cost = cost.setScale(2, RoundingMode.HALF_UP);

        System.out.println("How much money was paid?");
        payment = scanner.nextBigDecimal();
        payment = payment.setScale(2, RoundingMode.HALF_UP);

        if (payment.compareTo(cost) < 0) {
            System.out.println("Insufficient payment for given cost");
            
        }
        change = payment.subtract(cost);

        while (change.compareTo(naught) > 0) {
            if (change.compareTo(q) >= 0) {
                quarters++;
                change = change.subtract(q);
            }
            else if (change.compareTo(d) >= 0) {
                dimes++;
                change = change.subtract(d);
            }
            else if (change.compareTo(n) >= 0) {
                nickels++;
                change = change.subtract(n);
            }
            else {
                pennies++;
                change = change.subtract(p);
            }  
        }

        System.out.println(quarters + " Quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");

        scanner.close();

        
    }

}
