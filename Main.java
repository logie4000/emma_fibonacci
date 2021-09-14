/*
 * A program to print out sections of the Fibonacci Sequence
*/

import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Entering a number greater than 93 will overflow a variable and give an inaccurate result.");
        // Create scanner & get input
        Scanner input = new Scanner(System.in);
        System.out.print("Start position (<94): ");
        int start = input.nextInt();
        System.out.print("End position (<94): ");
        int end = input.nextInt();
        
        // Initialize variables
        BigInteger aBigInt = new BigInteger(1);
        BigInteger bBigInt = new BigInteger(1);
        
        // Loop to print output
        for (int i = 1; i <= end; i++) {
            // Print output
            while(i >= start) {
                System.out.print(i + ".\t");
                System.out.println(aBigInt);
                break;
            }
            // Advance variables
            BigInteger cBigInt = aBigInt.add(bBigInt);
            aBigInt = bBigInt;
            bBigInt = cBigInt;
        }
    }
}