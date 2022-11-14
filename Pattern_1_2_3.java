package demo;

public class Pattern_1_2_3 {

	public static void main(String[] args) {
		int a=5,t,tem;
		tem=a;
		t=a;
		for(int i=a;i>0;i--)
		{
			for(int j=1;j<=a*i;j++)
			{
				System.out.print(t+" ");
				if(j%i==0)
					t-=1;
			}
			t=a;					
			System.out.println();
		}
	}
}
