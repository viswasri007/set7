import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int temp;
		int n=s;
		while(n!=0)
		{
			temp=n%10;
			if(temp>1)
			{
				break;
			}
			else
			{
				n=n/10;
			}
		}
		if(n>0)
		{
			System.out.println("no");
		}
		else
		{
			System.out.println("yes");
		}
	}
}
		
