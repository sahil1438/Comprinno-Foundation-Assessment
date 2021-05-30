import java.util.*;

class CatDog1 
{
	public static void main(String[] args) 
	{
        	Scanner input = new Scanner(System.in);
        	int t = input.nextInt();
        	long cats = input.nextLong();
        	long dogs = input.nextLong();
        	long legs = input.nextLong();
        	long max = (cats + dogs) * 4;
        	long min = 0;
        
        	if (legs % 4 == 0 && legs <= max && legs >= min)
		{
           		System.out.println("yes");
        	} 
		else 
		{
            		System.out.println("no");
        	}
    	}
}
