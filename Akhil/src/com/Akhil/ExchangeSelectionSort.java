package com.Akhil;
import java.util.*;
public class ExchangeSelectionSort {
	public static void main(String[] args)
	{
	Scanner ss=new Scanner (System.in);
	int n,ar[],i,j,c,h,ind;
	System.out.println("Enter limit");
	n=ss.nextInt();
	ar=new int[n];
	for(i=0;i<n;i++)
		ar[i]=ss.nextInt();
	for(i=0;i<n-1;i++)
	{
		h=ar[i];
		ind=i;
		for(j=i+1;j<n;j++)
			if(ar[j]<h)
			{
				h=ar[j];
				ind=j;
			}
				c=ar[ind];
				ar[ind]=ar[i];
				ar[i]=c;
			
	}
	for(i=0;i<n;i++)
		System.out.println(ar[i]);
	}
}
