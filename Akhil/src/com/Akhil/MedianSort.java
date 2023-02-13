package com.Akhil;

import java.util.Scanner;

public class MedianSort 
{
	int n,ar[];
	MedianSort(int a)
	{
		n=a;
		ar=new int[n];
	}
	
	public static void main()
	{
		Scanner ss= new Scanner (System.in);
		int n;
		System.out.println("Enter");
		n=ss.nextInt();
		MedianSort ms = new MedianSort(n);
		
		for(i=0;i<n;i++)
			ar[i]=ss.nextInt();
		
		ms.Compute(0,n-1);
		for(i=0;i<n;i++)
			System.out.println(ar[i]);
	}
	void Compute( int l , int r)
	{
		int mid,med,i,j,b,f,c,sw,d,e,k,f=0;
		mid=(l+r+1)/2;
		for(i=0;i<r+1;i++)
		{
			c=0;
			b=0;
			for(j=0;j<r+1;j++)
			{
				if(ar[j]>ar[i])
					b++;
				if(ar[j]<ar[i])
					c++;
			}
			if((b+c)==r  &&  (int)Math.abs(b-c)==1)
			{
				
				med=i;
				
				break;
			}
		}
		sw=ar[mid];
		ar[mid]=ar[med];
		ar[med]=sw;
		k=mid+1;
		for(i=0;i<mid;i++)
		{
			d=ar[i];
			if(d<ar[mid])
			{
				f=0;
				while( k<(r+1) && f==0)
				{
					if(ar[k]>ar[mid])
					{
						sw=ar[i];
						ar[i]=ar[k];
						ar[k]=sw;
						f=1;
					}
					k++;
				}
			}
		Compute(0,mid-1);
		Compute(mid+1,r);
                }
		
		
	}
}

