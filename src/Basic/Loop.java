package Basic;

public class Loop 
{
	public static void main(String[] args) 
	{
		
		for(int i=1; i<=9; i++)
		{
			for(int j=9; j>=i; j--)
			
				{
					System.out.print(" ");
				}
				for(int k=1; k<=i; k++)
				{
					System.out.print("x ");
					
				}
			System.out.println();
		}
		
		for(int i=10; i>=1; i--)
		{
			for(int j=i+1; j<=10; j++)
			{
				System.out.print(" ");
			}
			for(int k=i; k>=1; k--)
			{
				System.out.print("x ");
			}
			System.out.println();
		}
		
		
		

	}
}
