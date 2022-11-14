/*
INPUT:
Enter a Number:5
OUTPUT:
* 
* * 
* * * 
* * * * 
* * * * * 

 */
package demo;
import java.util.*;
public class right_angle_triangle {
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int a1=sc.nextInt();
		 for(int i=0;i<a1;i++)
		 {
			 for(int j=0;j<i+1;j++)
			 {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
	}

}
