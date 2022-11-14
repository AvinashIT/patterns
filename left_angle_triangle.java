/*
 INPUT:
 Enter a number:
 5
OUTPUT:
* * * * * 
* * * * 
* * * 
* * 
* 

 */
package demo;
import java.util.*;
public class left_angle_triangle {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		for(int i=a;i>0;i--)
		{
			for(int j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
	}

}
