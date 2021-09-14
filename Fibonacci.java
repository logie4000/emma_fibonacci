/*
 * A program to print out sections of the Fibonacci Sequence
 */

import java.util.*;

public class MyProgram {
    public static void main(String[] args) {
        System.out.println("Entering a number greater than 93 will overflow a variable and give an inaccurate result.");
        // Create scanner & get input
        Scanner input = new Scanner(System.in);
        System.out.print("Start position (<94): ");
        int start = input.nextInt();
        System.out.print("End position (<94): ");
        int end = input.nextInt();
        
        // Initialize variables
        long toAdd = Long.parseUnsignedLong(1);
        long toPrint = Long.parseUnsignedLong(0);
        
        // Loop to print output
        for (int i = 1; i <= end; i++) {
            // Print output
            while(i >= start) {
                System.out.print(i + ".\t");
                System.out.println(toPrintStr);
                break;
            }
            // Advance variables
            toPrint += toAdd;
            toAdd = toPrint - toAdd;
        }
    }
}
