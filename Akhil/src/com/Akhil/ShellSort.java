package com.Akhil;
import java.util.Scanner;
public class ShellSort
{
	public static void main(String[] args)
	{
	Scanner ss=new Scanner (System.in);
	int n,ar[],i,j,c;
	System.out.println("Enter limit");
	n=ss.nextInt();
	ar=new int[n];
	for(i=0;i<n;i++)
		ar[i]=ss.nextInt();
	for(i=n;i>0;i/=2)
	{
		for(j=i;j<n;j++)
			if(ar[j]<ar[j-i])
			{
				c=ar[j];
				ar[j]=ar[j-i];
				ar[j-i]=c;
			}
	}
	for(j=1;j<n;j++)
		if(ar[j]<ar[j-1])
		{
			c=ar[j];
			ar[j]=ar[j-1];
			ar[j-1]=c;
		}
	for(i=0;i<n;i++)
		System.out.println(ar[i]);
    }
}
