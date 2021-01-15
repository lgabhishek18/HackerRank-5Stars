/**
 * @author Abhishek Gupta
 *
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution 
{
//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n; 
        n=s.nextInt();
    
        if(n%2!=0)
        {
            System.out.println("Weird");
        }
        else if(n%2==0)
        {
            if(n>=2 && n<=5)
                System.out.println("Not Weird");
            if(n>=6 && n<=20)
                System.out.println("Weird");
            else if(n>20)
                System.out.println("Not Weird");

        }
    }
}
