package com.Akhil;

import java.util.Scanner;

public class QuickSort 
{
	public static void QuickSort(int[] ar , int st , int end)
	{
		if((end-st)<2)
			return;
		int ind=Partition(ar,st,end);
		QuickSort(ar,st,ind);
		QuickSort(ar,ind+1,end);
	}
	public static int Partition(int[] ar, int st , int end)
	{
		int p = ar[st];
		int i=st,j=end;
		while(i<j)
		{
			while( i<j  &&  ar[--j]>=p)
				if(i<j)
					ar[i]=ar[j];
			while( i<j  &&  ar[++i]>=p)
				if(i<j)
					ar[j]=ar[i];
		}
		ar[j]=p;
		return j;
	}
	public static void main()
	{
		Scanner ss= new Scanner(System.in);
		int n,ar[];
		System.out.println("Enter");
		n=ss.nextInt();
		ar=new int [n];
		for(int i=0;i<n;i++)
			ar[i]=ss.nextInt();
		QuickSort(ar,0,n);
		for(int i=0;i<n;i++)
			System.out.println(ar[i]);
	}
}

