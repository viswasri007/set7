import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int n, i, temp, small;
		n =sc.nextInt();
		small = sc.nextInt();
		for (i=0; i < n; i++)
		{
			temp = sc.nextInt();
			if(temp > small)
			continue;
			else
			small = temp;
		}
		System.out.println(small);
	}
}
