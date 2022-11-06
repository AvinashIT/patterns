/*
 INPUT:
 apple
 a      e
  p   l 
    p  
 p    l 
a       e

 */
package demo;
import java.util.*;
public class X_pattern
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char array[]=sc.nextLine().toCharArray();
	for(int i=0;i<array.length;i++)
	{
	        for(int j=0;j<array.length;j++)
	        {
	        if(i==j||j==(array.length-1)-i)
	           System.out.print(array[j]);
	           else 
	              System.out.print(" ");
	        }
	       System.out.println();
	    }
	}
}
   
