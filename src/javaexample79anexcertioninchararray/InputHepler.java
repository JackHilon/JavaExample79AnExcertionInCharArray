
package javaexample79anexcertioninchararray;

import java.util.Scanner;
import org.omg.IOP.CodecPackage.FormatMismatch;


public class InputHepler {
    
    private static String ReadLine(Scanner in)
    {
        return in.nextLine();
    }
    
    private static char[] String2CharArray(String str)
    {
        return str.toCharArray();
    }
    
    public static char[] ReadCharArray(Scanner in)
    {
        return String2CharArray(ReadLine(in));
    }
    
    private static int String2Int(String str)
    {
        int i = Integer.parseInt(str);
        return i;
    }
    
    public static int ReadInt(Scanner in)
    {
        String str = ReadLine(in);
        int res=0;
        try{
            res = Integer.parseInt(str);
            return res;
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            System.out.println(ex.toString());
            return ReadInt(in);
        }
    }
    
    public static char ReadChar(Scanner in)
    {
        String str = ReadLine(in);
        char[] res=null;
        try{
            res = str.toCharArray();
            if(res.length != 1)
                throw new FormatMismatch("Enter a character not a string!!!");
            return res[0];
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            System.out.println(ex.toString());
            return ReadChar(in);
        }
    }
}
