
package javaexample79anexcertioninchararray;

import java.util.Scanner;


public class JavaExample79AnExcertionInCharArray {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        char[] myArray = InputHepler.ReadCharArray(input);
        
        System.out.println();
        System.out.print("Your Array is: ");
        CharArrayHelper.PrintCharArray(myArray);
        
        System.out.println();
        System.out.print("Enter replacing char: ");
        char myChar = InputHepler.ReadChar(input);
        
        System.out.print("Enter first-index will be replaced inclusivesly: ");
        int first = InputHepler.ReadInt(input);
        
        System.out.print("Enter end-index will be replaced exclusivesly..: ");
        int end = InputHepler.ReadInt(input);
        
        
        CharArrayHelper.Fill(myArray, first, end, myChar);
        
        System.out.println();
        System.out.print("Your new array: ");
        CharArrayHelper.PrintCharArray(myArray);
        
    }
    
}
