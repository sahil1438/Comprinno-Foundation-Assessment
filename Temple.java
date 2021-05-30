import java.util.*;
import java.lang.*;
import java.math.*;


class Temple
{
	public static void main (String args[])
	{
	    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value =>");
	    	int tcase=sc.nextInt();
	    	while(tcase-->0){
	    	    int n=sc.nextInt();
	    	    boolean b=true;
	    	    int arr[]=new int[n];
	    	    for(int i=0;i<n;i++){
	    	        arr[i]=sc.nextInt();
	    	    }
	    	    if(arr[0]==1 && n%2!=0){
	    	        for(int i=0;i<n/2;i++){
	    	            if(arr[i]!=arr[n-1-i] || arr[i+1]!=arr[i]+1 || arr[n-2-i]!=arr[n-1-i]+1){
	    	                b=false;
	    	                break;
	    	            }
	    	        }
	    	    }else{
	    	        b=false;
	    	    }
	    	    System.out.println(b? "yes":"no");
	    	}
	}
}