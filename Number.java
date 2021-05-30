import java.util.Scanner;

class Number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of T =>");
		int T=sc.nextInt();
		for(int i=1; i<=T; i++)
		{
			long a=sc.nextInt();
			long b=sc.nextInt();
			long n=sc.nextInt();
			
			if(n%2==0)
			{
				System.out.println(Math.max(a,b)/Math.min(a,b));
			}
			else
			{
				System.out.println(Math.max((a*2),b)/Math.min((a*2),b));
			}
		}
	}
}