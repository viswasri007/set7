import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a,b;
		a=(n/10)*10;
		b=a+10;
		int c=(n - a < b - n)? b : a;
		{
			System.out.println(c);
		}
	}
}
