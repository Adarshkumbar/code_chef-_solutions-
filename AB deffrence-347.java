/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
        
      
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
     
        int absoluteDifference = Math.abs((A + B) - (A * B));
        
       
        System.out.println(absoluteDifference);
        
        scanner.close();
	}
}