import java.util.Scanner;

class GrossSalary
{
	public static void main(String args[])
	{
		int bs,hra,da,gs;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base Salary =>");
		bs=sc.nextInt();
		if(bs<1500)
		{
			hra=bs*10/100;
			da=bs*90/100;
		}
		else
		{
			hra=500;
			da=bs*98/100;
		}
		gs=bs+hra+da;
		System.out.println("Employee Gross Salary =>"+gs);

	}
} 