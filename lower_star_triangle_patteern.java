package demo;

public class lower_star_triangle_patteern {
	public static void main(String ar[])
	{
		int a=5;
		for(int i=a;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			
			}
			System.out.println();
		}
	}

}
