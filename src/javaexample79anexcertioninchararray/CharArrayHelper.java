
package javaexample79anexcertioninchararray;

public class CharArrayHelper {
    
    
    // Fill the char-array with an item from start-index inclusively to end-index exclusively.
    public static void Fill(char[] array, int startIndx, int endIndx, char item) 
            throws IllegalArgumentException, ArrayIndexOutOfBoundsException
    {
        if(startIndx < 0 || endIndx > array.length)
            throw new ArrayIndexOutOfBoundsException("Index out of array's bounds!!!");
        
        if(startIndx > endIndx)
            throw new IllegalArgumentException("Arguments error: start-index bigger than end-index!!!");
        
        for (int i = startIndx; i < endIndx; i++) {
            
            array[i] = item;
        }// end for
    }// end Fill
    
    public static void PrintCharArray(char[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    
}
