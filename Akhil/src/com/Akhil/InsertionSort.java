package com.Akhil;
import java.util.*;
public class InsertionSort
{
	public static void main(String[] args)
	{
	Scanner ss=new Scanner (System.in);
	int n,ar[],i,j,c,h;
	System.out.println("Enter limit");
	n=ss.nextInt();
	ar=new int[n];
	for(i=0;i<n;i++)
		ar[i]=ss.nextInt();
	for(i=1;i<n;i++)
	{
		h=ar[i];
		for(j=i;j>0 && ar[j-1]>h;j--)
			ar[j]=ar[j-1];
		ar[j]=h;
	}
	for(i=0;i<n;i++)
		System.out.println(ar[i]);
    }
}
