package code.leet; /**
 * Created by Mickey on 7/17/2016.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.

        System.out.println("mealCost is: " + mealCost);
        double totalPlusTips = mealCost * ((double)tipPercent / 100) + mealCost;
        System.out.println("totalPlusTips is: " + totalPlusTips);

        double totalCostD = mealCost * ((100 + (double)tipPercent)/100) * ((100 + (double)taxPercent)/100);

        System.out.println("totalCostD is: " + totalCostD);

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(totalCostD/*numberToRoundHere*/);



        // Print your result

        System.out.println("The total meal cost is " + totalCost + " dollars.");

    }
}