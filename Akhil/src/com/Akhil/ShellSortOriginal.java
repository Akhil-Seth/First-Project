package com.Akhil;

import java.util.Scanner;

public class ShellSortOriginal 
{
	public static void main(String[] args)
	{
	Scanner ss=new Scanner (System.in);
	int n,ar[],i,j,c,k;
	System.out.println("Enter limit");
	n=ss.nextInt();
	ar=new int[n];
	for(i=0;i<n;i++)
		ar[i]=ss.nextInt();
	for(i=n/2;i>0;i/=2)
    {
        for(j=i;j<n;j++)
        {
            c=ar[j];
            k=j;
            while(k>=i && ar[k-i]>c)
            {
                ar[k]=ar[k-i];
                k-=i;
            }
            
            ar[k]=c;
        }
            
    
			
	}
	for(i=0;i<n;i++)
		System.out.println(ar[i]);
}
}